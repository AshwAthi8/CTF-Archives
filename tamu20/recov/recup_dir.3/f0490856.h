LE
                when 1 then 'YES'
                else 'NO'
            end,
            SS_DATA_TYPE = NULL,
            COLUMN_FLAGS = c.COLUMN_FLAGS
        from master.dbo.SYSREMOTE_COLUMNS (
                    @table_server,
                    @table_catalog,
                    NULL,
                    NULL,
                    NULL ) c,
                master.dbo.SYSREMOTE_PROVIDER_TYPES (
                    @table_server ) p
                    /* LUXOR/KAGERA don't support restricting DATA_TYPE */
            where c.DATA_TYPE = p.DATA_TYPE AND p.BEST_MATCH = 1 and
                (TABLE_SCHEMA like @table_schema
                or @table_schema is NULL or (TABLE_SCHEMA is NULL and @table_schema = N'%'))
                and (c.COLUMN_NAME like @column_name
                or   @column_name is NULL)
                and c.TABLE_NAME like @table_name
    end

    update #tmp_columns
    set SQL_DATA_TYPE = spt_dt.SQL_DATA_TYPE,
        SQL_DATETIME_SUB =
        case
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME then 3
            else #tmp_columns.SQL_DATETIME_SUB
        end,
        TYPE_NAME = 
        case 
            when #tmp_columns.DATA_TYPE = @ODBC_BINARY and (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISROWVER) = @DBCOLUMNFLAGS_ISROWVER AND
                    (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISFIXEDLENGTH) = @DBCOLUMNFLAGS_ISFIXEDLENGTH and
                    BUFFER_LENGTH = 8
                then 'timestamp'
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME and
                    #tmp_columns.SQL_DATETIME_SUB = 0
                then 'smalldatetime'
            when #tmp_columns.DATA_TYPE = @ODBC_MONEY and
                    #tmp_columns.COLUMN_SIZE = 10
                then 'smallmoney'
            when (#tmp_columns.DATA_TYPE in (@ODBC_BINARY, @ODBC_CHAR) and
                    (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISFIXEDLENGTH) = @DBCOLUMNFLAGS_ISFIXEDLENGTH) or
                 #tmp_columns.DATA_TYPE in (@ODBC_TEXT, @ODBC_NTEXT, @ODBC_IMAGE)
                then spt_dt.TYPE_NAME collate database_default
            else isnull(#tmp_columns.TYPE_NAME, spt_dt.TYPE_NAME collate database_default)
        end,
        COLUMN_SIZE =
        case
            when #tmp_columns.DATA_TYPE IN (@ODBC_REAL, @ODBC_FLOAT) then /* app. numeric types */
                spt_dt.data_precision
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME and
                    #tmp_columns.SQL_DATETIME_SUB = 0
                then 16
            else #tmp_columns.COLUMN_SIZE
        end,
        BUFFER_LENGTH =
        case
            when #tmp_columns.DATA_TYPE IN (@ODBC_NUMERIC, @ODBC_DECIMAL) then  /* decimal/numeric types */
                COLUMN_SIZE+2
            when isnull (#tmp_columns.BUFFER_LENGTH,0) = 0 then spt_dt.length
            else #tmp_columns.BUFFER_LENGTH
        end,
        DECIMAL_DIGITS =
        case
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME
                then #tmp_columns.SQL_DATETIME_SUB
            else COALESCE (DECIMAL_DIGITS, spt_dt.numeric_scale)
        end,
        NUM_PREC_RADIX = spt_dt.RADIX,
        SS_DATA_TYPE = 
        case
            when #tmp_columns.DATA_TYPE in ( @ODBC_TINYINT, @ODBC_SMALLINT, @ODBC_INT ) 
                and #tmp_columns.NULLABLE = 1
                    then @ODS_INT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_TINYINT and #tmp_columns.NULLABLE = 0 
                then @ODS_TINYINT_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_SMALLINT    and #tmp_columns.NULLABLE = 0
                then @ODS_SMALLINT_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_INT  and #tmp_columns.NULLABLE = 0
                then @ODS_INT_NOT_NULL
            when #tmp_columns.DATA_TYPE in (@ODBC_REAL, @ODBC_FLOAT) and #tmp_columns.NULLABLE = 1
                then @ODS_FLOAT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_REAL and #tmp_columns.NULLABLE = 0
                then @ODS_REAL_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_FLOAT and #tmp_columns.NULLABLE = 0
                then @ODS_FLOAT_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_MONEY and #tmp_columns.NULLABLE = 1 
                then @ODS_MONEY_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_MONEY and #tmp_columns.NULLABLE = 0 
                then @ODS_MONEY_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME and #tmp_columns.NULLABLE = 1
                then @ODS_DATETIME_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_DATETIME and #tmp_columns.NULLABLE = 0
                then @ODS_DATETIME_NOT_NULL
            when #tmp_columns.DATA_TYPE in (@ODBC_NTEXT, @ODBC_TEXT) then @ODS_TEXT
            when #tmp_columns.DATA_TYPE = @ODBC_BIT then @ODS_BIT
            when #tmp_columns.DATA_TYPE = @ODBC_DECIMAL then  @ODS_DECIMAL  
            when #tmp_columns.DATA_TYPE = @ODBC_NUMERIC then  @ODS_NUMERIC
            when #tmp_columns.DATA_TYPE = @ODBC_GUID then @ODS_GUID
            when #tmp_columns.DATA_TYPE = @ODBC_IMAGE then  @ODS_IMAGE
            when #tmp_columns.DATA_TYPE = @ODBC_TIMESTAMP
                and (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISROWVER) = @DBCOLUMNFLAGS_ISROWVER AND
                    (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISFIXEDLENGTH) = @DBCOLUMNFLAGS_ISFIXEDLENGTH and
                    BUFFER_LENGTH = 8
                then @ODS_TIMESTAMP
            when #tmp_columns.DATA_TYPE = @ODBC_BINARY and #tmp_columns.NULLABLE =  1
                and (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISFIXEDLENGTH = @DBCOLUMNFLAGS_ISFIXEDLENGTH)
                then  @ODS_BINARY_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_BINARY and #tmp_columns.NULLABLE =  0
                and (COLUMN_FLAGS & @DBCOLUMNFLAGS_ISFIXEDLENGTH = @DBCOLUMNFLAGS_ISFIXEDLENGTH)
                then @ODS_BINARY_NOT_NULL
            when #tmp_columns.DATA_TYPE = @ODBC_VARBINARY
                then @ODS_VARBINARY 
            when #tmp_columns.DATA_TYPE in (@ODBC_CHAR, @ODBC_NCHAR) and #tmp_columns.NULLABLE = 1
                then @ODS_CHAR_NULL
            when #tmp_columns.DATA_TYPE in (@ODBC_CHAR, @ODBC_NCHAR) and #tmp_columns.NULLABLE = 0
                then @ODS_CHAR_NOT_NULL
            when #tmp_columns.DATA_TYPE in (@ODBC_VARCHAR, @ODBC_NVARCHAR) then @ODS_VARCHAR
            else null
        end
        from master.dbo.spt_datatype_info spt_dt
        where spt_dt.DATA_TYPE = #tmp_columns.DATA_TYPE
            AND (spt_dt.ODBCVer is null or spt_dt.ODBCVer = @ODBCVer)
            and isnull(spt_dt.AUTO_INCREMENT,0) = 0
            and not spt_dt.TYPE_NAME = 'smalldatetime'

    select
            TABLE_CAT,          TABLE_SCHEM,        TABLE_NAME,
            COLUMN_NAME,        DATA_TYPE,          TYPE_NAME,
            COLUMN_SIZE,        BUFFER_LENGTH,      DECIMAL_DIGITS,
            NUM_PREC_RADIX,     NULLABLE,           REMARKS,
            COLUMN_DEF,         SQL_DATA_TYPE,      SQL_DATETIME_SUB,
            CHAR_OCTET_LENGTH,  ORDINAL_POSITION,   IS_NULLABLE,
            SS_DATA_TYPE
        from #tmp_columns
        order by TABLE_CAT, TABLE_SCHEM, TABLE_NAME, ORDINAL_POSITION

        drop table #tmp_columns

go
grant execute on sp_columns_ex to public
go


if object_id('sp_table_privileges_ex', 'P') is not null
    drop proc sp_table_privileges_ex
go
raiserror(15339,-1,-1,'sp_table_privileges_ex')
go
create procedure sp_table_privileges_ex(
    @table_server       sysname,
    @table_name         sysname = null,
    @table_schema       sysname = null,
    @table_catalog      sysname = null)
as
    select
        TABLE_CAT = TABLE_CATALOG,
        TABLE_SCHEM = TABLE_SCHEMA,
        TABLE_NAME = TABLE_NAME,
        GRANTOR = GRANTOR,
        GRANTEE = GRANTEE,
        PRIVILEGE = PRIVILEGE_TYPE,
        IS_GRANTABLE = 
        case IS_GRANTABLE
            when 1 then 'YES'
            when 0 then 'NO'
            else null
        end
    from master.dbo.SYSREMOTE_TABLE_PRIVILEGES (
                @table_server,
                @table_catalog,
                NULL,
                NULL )
    where (TABLE_SCHEMA like @table_schema
        or @table_schema is NULL or (TABLE_SCHEMA is NULL and @table_schema = N'%'))
        and (TABLE_NAME like @table_name
        or   @table_name is NULL)
    order by TABLE_CAT, TABLE_SCHEM, TABLE_NAME, PRIVILEGE
go
grant execute on sp_table_privileges_ex to public
go


if object_id('sp_column_privileges_ex', 'P') is not null
    drop proc sp_column_privileges_ex
go
raiserror(15339,-1,-1,'sp_column_privileges_ex')
go
create procedure sp_column_privileges_ex(
    @table_server       sysname,
    @table_name         sysname = null,
    @table_schema       sysname = null,
    @table_catalog      sysname = null,
    @column_name        sysname = null)
as
    select
        TABLE_CAT = TABLE_CATALOG,
        TABLE_SCHEM = TABLE_SCHEMA,
        TABLE_NAME = TABLE_NAME,
        COLUMN_NAME = COLUMN_NAME,
        GRANTOR = GRANTOR,
        GRANTEE = GRANTEE,
        PRIVILEGE = PRIVILEGE_TYPE,
        IS_GRANTABLE = 
        case IS_GRANTABLE
            when 1 then 'YES'
            when 0 then 'NO'
            else null
        end
    from master.dbo.SYSREMOTE_COLUMN_PRIVILEGES (
        @table_server,
        @table_catalog,
        @table_schema,
        @table_name,
        NULL )
    where (COLUMN_NAME like @column_name
        or @column_name is NULL)
    order by TABLE_CAT, TABLE_SCHEM, TABLE_NAME, COLUMN_NAME, PRIVILEGE
go
grant execute on sp_column_privileges_ex to public
go


if object_id('sp_indexes', 'P') is not null
    drop proc sp_indexes
go
raiserror(15339,-1,-1,'sp_indexes')
go
create procedure sp_indexes(
    @table_server       sysname,
    @table_name         sysname = null,
    @table_schema       sysname = null,
    @table_catalog      sysname = null,
    @index_name         sysname = null,
    @is_unique          bit = null)
as
    select
        TABLE_CAT = TABLE_CATALOG,
        TABLE_SCHEM = TABLE_SCHEMA,
        TABLE_NAME = TABLE_NAME,
            NON_UNIQUE = convert(smallint, 1 - [UNIQUE]),
        INDEX_QUALIFIER = TABLE_NAME,
        INDEX_NAME = INDEX_NAME,
            TYPE =
        case [CLUSTERED]
            when 1 then 1
            else 3
        end,
        ORDINAL_POSITION = ORDINAL_POSITION,
            COLUMN_NAME = COLUMN_NAME,
        ASC_OR_DESC = 
        case [COLLATION]
            when 1 then 'A'
            when 2 then 'D'
            else null
        end,
            CARDINALITY = CARDINALITY,
        PAGES = 
        case [CLUSTERED]
            when 1 then PAGES
            else NULL
        end,
            FILTER_CONDITION = FILTER_CONDITION
    from master.dbo.SYSREMOTE_INDEXES (
                @table_server,
                @table_catalog,
                @table_schema,
                        @index_name,
                NULL,           /* TYPE (index type) */
                @table_name )
    where @is_unique is null or @is_unique = [UNIQUE]
    order by NON_UNIQUE, TYPE, INDEX_QUALIFIER, INDEX_NAME, ORDINAL_POSITION
go
grant execute on sp_indexes to public
go


if object_id('sp_foreignkeys', 'P') is not null
    drop proc sp_foreignkeys
go
raiserror(15339,-1,-1,'sp_foreignkeys')
go
create procedure sp_foreignkeys(
    @table_server       sysname,
    @pktab_name         sysname = null,
    @pktab_schema       sysname = null,
    @pktab_catalog      sysname = null,
    @fktab_name         sysname = null,
    @fktab_schema       sysname = null,
    @fktab_catalog      sysname = null)
as
    select
        PKTABLE_CAT = PK_TABLE_CATALOG,
        PKTABLE_SCHEM = PK_TABLE_SCHEMA,
        PKTABLE_NAME = PK_TABLE_NAME,
        PKCOLUMN_NAME = PK_COLUMN_NAME,
        FKTABLE_CAT = FK_TABLE_CATALOG,
        FKTABLE_SCHEM = FK_TABLE_SCHEMA,
        FKTABLE_NAME = FK_TABLE_NAME,
        FKCOLUMN_NAME = FK_COLUMN_NAME,
        KEY_SEQ = ORDINAL,
        UPDATE_RULE = 
        case UPDATE_RULE
            when 'CASCADE' then 0
            when 'NO ACTION' then 1
            when 'SET NULL' then 2
            else null
        end,
        DELETE_RULE = 
        case DELETE_RULE
            when 'CASCADE' then 0
            when 'NO ACTION' then 1
            when 'SET NULL' then 2
            else null
        end,
        FK_NAME = convert(sysname, NULL),
        PK_NAME = convert(sysname, NULL),
        DEFERRABILITY = convert(smallint, null)

    from master.dbo.SYSREMOTE_FOREIGN_KEYS (
                @table_server,
                @pktab_catalog,
                @pktab_schema,
                @pktab_name,
                @fktab_catalog,
                @fktab_schema,
                @fktab_name )
    order by FKTABLE_CAT, FKTABLE_SCHEM, FKTABLE_NAME, KEY_SEQ
go
grant execute on sp_foreignkeys to public
go


if object_id('sp_primarykeys', 'P') is not null
    drop proc sp_primarykeys
go
raiserror(15339,-1,-1,'sp_primarykeys')
go
create procedure sp_primarykeys(
    @table_server       sysname,
    @table_name         sysname = null,
    @table_schema       sysname = null,
    @table_catalog      sysname = null)
as
    select
        TABLE_CAT = TABLE_CATALOG,
        TABLE_SCHEM = TABLE_SCHEMA,
        TABLE_NAME = TABLE_NAME,
        COLUMN_NAME = COLUMN_NAME,
        KEY_SEQ = ORDINAL,
        PK_NAME = convert(sysname, NULL)
    from master.dbo.SYSREMOTE_PRIMARY_KEYS (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name )
    order by TABLE_CAT, TABLE_SCHEM, TABLE_NAME, KEY_SEQ
go
grant execute on sp_primarykeys to public
go

/*-------------- END CATALOG STORED PROCEDURES FOR OLEDB SOURCES ------------------*/


dump tran master with no_log
go

if (charindex('6.50', @@version) = 0 and
    charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 6.50 SQL Server.'
    print 'Ignore the following errors.'
end

print 'creating sp_ddopen'
go

/*  Procedure for pre-6.50 server */
create procedure sp_ddopen(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              varchar(255) = null,
               @p2              varchar(255) = null,
               @p3              varchar(255) = null,
               @p4              varchar(255) = null,
               @p5              varchar(255) = null,
               @p6              varchar(255) = null,
               @p7              int = null,
               @ODBCVer         int = 2)
as
    set nocount on
    declare @ret int

    if @procname = 'sp_column_privileges'
    begin
        create table #spcolpriv (
            TABLE_QUALIFIER varchar(32) null,
            TABLE_OWNER varchar(32) null,
            TABLE_NAME varchar(32)  not null,
            COLUMN_NAME varchar(32) not null,
            GRANTOR varchar(32) null,
            GRANTEE varchar(32) not null,
            PRIVILEGE varchar(32) not null,
            IS_GRANTABLE varchar(3) null
            )
        insert into #spcolpriv exec sp_column_privileges @p1,@p2,@p3,@p4
        exec @ret = sp_cursoropen @handle output,
            'select * from #spcolpriv',
            @scrollopt output, @ccopt output, @rows output
        drop table #spcolpriv
    end
    else if @procname = 'sp_columns'
    begin
        create table #spcolumns (
            TABLE_QUALIFIER varchar(32) null,
            TABLE_OWNER varchar(32) null,
            TABLE_NAME varchar(32)  not null,
            COLUMN_NAME varchar(32) not null,
            DATA_TYPE smallint not null,
            TYPE_NAME varchar(32) not null,
            "PRECISION" int null,
            LENGTH int null,
            SCALE smallint null,
            RADIX smallint null,
            NULLABLE smallint not null,
            REMARKS varchar(254) null,
            COLUMN_DEF varchar(255) null,
            SQL_DATA_TYPE smallint not null,
            SQL_DATETIME_SUB smallint null,
            CHAR_OCTET_LENGTH int null,
            ORDINAL_POSITION int not null,
            IS_NULLABLE varchar(254) null,
            SS_DATA_TYPE tinyint null
            )
        insert into #spcolumns exec sp_columns @p1,@p2,@p3,@p4,@ODBCVer
        exec @ret = sp_cursoropen @handle output,
            'select * from #spcolumns',
            @scrollopt output, @ccopt output, @rows output
        drop table #spcolumns
    end
    else if @procname = 'sp_datatype_info'
    begin
        create table #spdatatypeinfo (
            TYPE_NAME           varchar(32)  not null,
            DATA_TYPE           smallint not null,
            "PRECISION"         int null,
            LITERAL_PREFIX      varchar(32) null,
            LITERAL_SUFFIX      varchar(32)    null,
            CREATE_PARAMS       varchar(32)    null,
            NULLABLE            smallint   not null,
            CASE_SENSITIVE      smallint   not null,
            SEARCHABLE          smallint   not null,
            UNSIGNED_ATTRIBUTE  smallint   null,
            MONEY   smallint    not null,
            AUTO_INCREMENT      smallint    null,
            LOCAL_TYPE_NAME     varchar(32) null,
            MINIMUM_SCALE       smallint     null,
            MAXIMUM_SCALE       smallint   null,
            SQL_DATA_TYPE       smallint      not null,
            SQL_DATETIME_SUB    smallint   null,
            NUM_PREC_RADIX      int  null,
            INTERVAL_PRECISION  smallint    NULL,
            USERTYPE            smallint not null)
        insert into #spdatatypeinfo exec sp_datatype_info @p7,@ODBCVer
        exec @ret = sp_cursoropen @handle output,
            'select * from #spdatatypeinfo',
            @scrollopt output, @ccopt output, @rows output
        drop table #spdatatypeinfo
    end
    else if @procname = 'sp_fkeys'
    begin
        create table #spfkeys (
            PKTABLE_QUALIFIER varchar(32)    null,
            PKTABLE_OWNER varchar(32)   null,
            PKTABLE_NAME varchar(32)  not null,
            PKCOLUMN_NAME varchar(32)   not null,
            FKTABLE_QUALIFIER varchar(32)   null,
            FKTABLE_OWNER varchar(32)   null,
            FKTABLE_NAME varchar(32)  not null,
            FKCOLUMN_NAME varchar(32)   not null,
            KEY_SEQ smallint not null,
            UPDATE_RULE smallint null,
            DELETE_RULE smallint null,
            FK_NAME varchar(32) null,
            PK_NAME varchar(32) null,
            DEFERRABILITY smallint null
            )
        insert into #spfkeys exec sp_fkeys @p1,@p2,@p3,@p4,@p5,@p6
        exec @ret = sp_cursoropen @handle output,
            'select * from #spfkeys',
            @scrollopt output, @ccopt output, @rows output
        drop table #spfkeys
    end
    else if @procname = 'sp_pkeys'
    begin
        create table #sppkeys (
            TABLE_QUALIFIER varchar(32)   null,
            TABLE_OWNER varchar(32)   null,
            TABLE_NAME varchar(32)  not null,
            COLUMN_NAME varchar(32)  not null,
            KEY_SEQ smallint not null,
            PK_NAME varchar(32) null
            )
        insert into #sppkeys exec sp_pkeys @p1,@p2,@p3
        exec @ret = sp_cursoropen @handle output,
            'select * from #sppkeys',
            @scrollopt output, @ccopt output, @rows output
        drop table #sppkeys
    end
    else if @procname = 'sp_special_columns'
    begin
        create table #spspeccol (
            SCOPE smallint null,
            COLUMN_NAME varchar(32) not null,
            DATA_TYPE smallint not null,
            TYPE_NAME varchar(32) not null,
            "PRECISION" int null,
            LENGTH int null,
            SCALE smallint null,
            PSEUDO_COLUMN smallint null
            )
        insert into #spspeccol exec sp_special_columns @p1,@p2,@p3,@p4,@p5,@p6,@ODBCVer
        exec @ret = sp_cursoropen @handle output,
            'select * from #spspeccol',
            @scrollopt output, @ccopt output, @rows output
        drop table #spspeccol
    end
    else if @procname = 'sp_sproc_columns'
    begin
        create table #spproccol (
            PROCEDURE_QUALIFIER varchar(32)  null,
            PROCEDURE_OWNER varchar(32)  null,
            PROCEDURE_NAME varchar(32)  not null,
            COLUMN_NAME varchar(32) not null,
            COLUMN_TYPE smallint not null,
            DATA_TYPE smallint not null,
            TYPE_NAME varchar(32) not null,
            "PRECISION" int null,
            LENGTH int null,
            SCALE smallint null,
            RADIX smallint null,
            NULLABLE smallint not null,
            REMARKS varchar(254) null,
            COLUMN_DEF varchar(255) null,
            SQL_DATA_TYPE smallint not null,
            SQL_DATETIME_SUB smallint null,
            CHAR_OCTET_LENGTH int null,
            ORDINAL_POSITION int not null,
            IS_NULLABLE varchar(254) null,
            SS_DATA_TYPE tinyint null
            )
        insert into #spproccol exec sp_sproc_columns @p1,@p2,@p3,@p4,@ODBCVer
        exec @ret = sp_cursoropen @handle output,
            'select * from #spproccol',
            @scrollopt output, @ccopt output, @rows output
        drop table #spproccol
    end
    else if @procname = 'sp_statistics'
    begin
        create table #spstatistics (
            TABLE_QUALIFIER varchar(32)   null,
            TABLE_OWNER varchar(32)   null,
            TABLE_NAME varchar(32)  not null,
            NON_UNIQUE smallint null,
            INDEX_QUALIFIER varchar(32) null,
            INDEX_NAME varchar(32)  null,
            TYPE smallint not null,
            SEQ_IN_INDEX smallint null,
            COLUMN_NAME varchar(32) null,
            COLLATION char(1) null,
            CARDINALITY int null,
            PAGES int null,
            FILTER_CONDITION varchar(128) null
            )
        insert into #spstatistics exec sp_statistics @p1,@p2,@p3,@p4,@p5,@p6
        exec @ret = sp_cursoropen @handle output,
            'select * from #spstatistics',
            @scrollopt output, @ccopt output, @rows output
        drop table #spstatistics
    end
    else if @procname = 'sp_stored_procedures'
    begin
        create table #spprocedures (
            PROCEDURE_QUALIFIER varchar(32)  null,
            PROCEDURE_OWNER varchar(32)  null,
            PROCEDURE_NAME varchar(32)  not null,
            NUM_INPUT_PARAMS int null,
            NUM_OUTPUT_PARAMS int null,
            NUM_RESULT_SETS int null,
            REMARKS varchar(254) null,
            PROCEDURE_TYPE smallint null
            )
        insert into #spprocedures exec sp_stored_procedures @p1,@p2,@p3
        exec @ret = sp_cursoropen @handle output,
            'select * from #spprocedures',
            @scrollopt output, @ccopt output, @rows output
        drop table #spprocedures
    end
    else if @procname = 'sp_table_privileges'
    begin
        create table #sptabpriv (
            TABLE_QUALIFIER varchar(32) null,
            TABLE_OWNER varchar(32) null,
            TABLE_NAME varchar(32)  not null,
            GRANTOR varchar(32) null,
            GRANTEE varchar(32) not null,
            PRIVILEGE varchar(32) not null,
            IS_GRANTABLE varchar(3) null
            )
        insert into #sptabpriv exec sp_table_privileges @p1,@p2,@p3
        exec @ret = sp_cursoropen @handle output,
            'select * from #sptabpriv',
            @scrollopt output, @ccopt output, @rows output
        drop table #sptabpriv
    end
    else if @procname = 'sp_tables'
    begin
        create table #sptables (
            TABLE_QUALIFIER varchar(32) null,
            TABLE_OWNER varchar(32) null,
            TABLE_NAME varchar(32)  null,
            TABLE_TYPE   varchar(32) null,
            REMARKS varchar(254) null)
        insert into #sptables exec sp_tables @p1,@p2,@p3,@p4
        exec @ret = sp_cursoropen @handle output,
            'select * from #sptables',
            @scrollopt output, @ccopt output, @rows output
        drop table #sptables
    end
    else
        print 'Unknown sp_ddopen procedure'
    select @ret = isnull(@ret,0)
    return isnull(@ret,0)
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_ddopen
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 server */
create procedure sp_ddopen;1(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774) = null,
               @p2              nvarchar(774) = null,
               @p3              nvarchar(774) = null,
               @p4              nvarchar(774) = null,
               @p5              nvarchar(774) = null,
               @p6              nvarchar(774) = null,
               @p7              int = null,
               @ODBCVer         int = 2)
as
    set nocount on
    declare @ret int

    if @procname = 'sp_column_privileges'
    begin
        exec @ret = sp_ddopen;2 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4
    end
    else if @procname = 'sp_columns' or @procname = 'sp_columns_ex'
    begin
        exec @ret = sp_ddopen;3 @handle output,
                            @procname,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @ODBCVer
    end
    else if @procname = 'sp_datatype_info'
    begin
        exec @ret = sp_ddopen;4 @handle output,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p7,
                            @ODBCVer
    end
    else if @procname = 'sp_fkeys'
    begin
        exec @ret = sp_ddopen;5 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6
    end
    else if @procname = 'sp_pkeys'
    begin
        exec @ret = sp_ddopen;6 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3
    end
    else if @procname = 'sp_special_columns'
    begin
        exec @ret = sp_ddopen;7 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6,
                            @ODBCVer
    end
    else if @procname = 'sp_sproc_columns'
    begin
        exec @ret = sp_ddopen;8 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @ODBCVer
    end
    else if @procname = 'sp_statistics'
    begin
        exec @ret = sp_ddopen;9 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6
    end
    else if @procname = 'sp_stored_procedures'
    begin
        exec @ret = sp_ddopen;10 @handle output, 
                             @scrollopt output, 
                             @ccopt output, 
                             @rows output, 
                             @p1,
                             @p2,
                             @p3
    end
    else if @procname = 'sp_table_privileges'
    begin
        exec @ret = sp_ddopen;11 @handle output, 
                             @scrollopt output, 
                             @ccopt output, 
                             @rows output, 
                             @p1,
                             @p2,
                             @p3
    end
    else if @procname = 'sp_tables' or @procname = 'sp_tables_ex'
    begin
        exec @ret = sp_ddopen;12 @handle output,
                            @procname,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5
    end
    else if @procname = 'sp_tableswc'
    begin
        exec @ret = sp_ddopen;13 @handle output,
                            @procname,
                            @scrollopt output,
                            @ccopt output,
                            @rows output,
                            @p1,
                            @p2,
                            @p3,
                            @p4
    end
    else
        print 'Unknown sp_ddopen procedure'
    select @ret = isnull(@ret,0)
    return isnull(@ret,0)
go


if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;2(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spcolpriv (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname not null,
        COLUMN_NAME sysname not null,
        GRANTOR sysname null,
        GRANTEE sysname not null,
        PRIVILEGE varchar(32) not null,
        IS_GRANTABLE varchar(3) null
        )
    insert into #spcolpriv exec sp_column_privileges @p1,@p2,@p3,@p4
    exec @ret = sp_cursoropen @handle output,
        'select * from #spcolpriv',
        @scrollopt output, @ccopt output, @rows output
    drop table #spcolpriv
    return @ret
go


if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;3(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spcolumns (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname not null,
        COLUMN_NAME sysname not null,
        DATA_TYPE smallint not null,
        TYPE_NAME sysname not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        RADIX smallint null,
        NULLABLE smallint not null,
        REMARKS varchar(254) null,
        COLUMN_DEF nvarchar(3000) null,
        SQL_DATA_TYPE smallint not null,
        SQL_DATETIME_SUB smallint null,
        CHAR_OCTET_LENGTH int null,
        ORDINAL_POSITION int not null,
        IS_NULLABLE varchar(254) null,
        SS_DATA_TYPE tinyint null
        )

    if @procname = 'sp_columns'
    begin
        insert into #spcolumns exec sp_columns @p1,@p2,@p3,@p4,@ODBCVer
    end
    else
    begin
        insert into #spcolumns exec sp_columns_ex @p1,@p2,@p3,@p4,@p5,@ODBCVer
    end
    exec @ret = sp_cursoropen @handle output,
        'select * from #spcolumns',
        @scrollopt output, @ccopt output, @rows output
    drop table #spcolumns
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;4(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p7              int,
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spdatatypeinfo (
        TYPE_NAME           sysname  not null,
        DATA_TYPE           smallint not null,
        "PRECISION"         int null,
        LITERAL_PREFIX      varchar(32) null,
        LITERAL_SUFFIX      varchar(32)    null,
        CREATE_PARAMS       varchar(32)    null,
        NULLABLE            smallint   not null,
        CASE_SENSITIVE      smallint   not null,
        SEARCHABLE          smallint   not null,
        UNSIGNED_ATTRIBUTE  smallint   null,
        MONEY   smallint    not null,
        AUTO_INCREMENT      smallint    null,
        LOCAL_TYPE_NAME     sysname null,
        MINIMUM_SCALE       smallint     null,
        MAXIMUM_SCALE       smallint   null,
        SQL_DATA_TYPE       smallint      not null,
        SQL_DATETIME_SUB    smallint   null,
        NUM_PREC_RADIX      int  null,
        INTERVAL_PRECISION  smallint    NULL,
        USERTYPE            smallint not null)

    insert into #spdatatypeinfo exec sp_datatype_info @p7,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spdatatypeinfo',
        @scrollopt output, @ccopt output, @rows output
    drop table #spdatatypeinfo
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;5(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spfkeys (
        PKTABLE_QUALIFIER sysname    null,
        PKTABLE_OWNER sysname   null,
        PKTABLE_NAME sysname  not null,
        PKCOLUMN_NAME sysname  not null,
        FKTABLE_QUALIFIER sysname   null,
        FKTABLE_OWNER sysname   null,
        FKTABLE_NAME sysname  not null,
        FKCOLUMN_NAME sysname  not null,
        KEY_SEQ smallint not null,
        UPDATE_RULE smallint null,
        DELETE_RULE smallint null,
        FK_NAME sysname null,
        PK_NAME sysname null,
        DEFERRABILITY smallint null
        )
    insert into #spfkeys exec sp_fkeys @p1,@p2,@p3,@p4,@p5,@p6
    exec @ret = sp_cursoropen @handle output,
        'select * from #spfkeys',
        @scrollopt output, @ccopt output, @rows output
    drop table #spfkeys
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;6(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sppkeys (
        TABLE_QUALIFIER sysname   null,
        TABLE_OWNER sysname   null,
        TABLE_NAME sysname  not null,
        COLUMN_NAME sysname  not null,
        KEY_SEQ smallint not null,
        PK_NAME sysname null
        )
    insert into #sppkeys exec sp_pkeys @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #sppkeys',
        @scrollopt output, @ccopt output, @rows output
    drop table #sppkeys
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;7(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spspeccol (
        SCOPE smallint null,
        COLUMN_NAME sysname not null,
        DATA_TYPE smallint not null,
        TYPE_NAME sysname not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        PSEUDO_COLUMN smallint null
        )
    insert into #spspeccol exec sp_special_columns @p1,@p2,@p3,@p4,@p5,@p6,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spspeccol',
        @scrollopt output, @ccopt output, @rows output
    drop table #spspeccol
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;8(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spproccol (
        PROCEDURE_QUALIFIER sysname  null,
        PROCEDURE_OWNER sysname  null,
        PROCEDURE_NAME sysname not null,
        COLUMN_NAME sysname not null,
        COLUMN_TYPE smallint not null,
        DATA_TYPE smallint not null,
        TYPE_NAME sysname not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        RADIX smallint null,
        NULLABLE smallint not null,
        REMARKS varchar(254) null,
        COLUMN_DEF nvarchar(3000) null,
        SQL_DATA_TYPE smallint not null,
        SQL_DATETIME_SUB smallint null,
        CHAR_OCTET_LENGTH int null,
        ORDINAL_POSITION int not null,
        IS_NULLABLE varchar(254) null,
        SS_DATA_TYPE tinyint null
        )
    insert into #spproccol exec sp_sproc_columns @p1,@p2,@p3,@p4,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spproccol',
        @scrollopt output, @ccopt output, @rows output
    drop table #spproccol
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;9(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spstatistics (
        TABLE_QUALIFIER sysname   null,
        TABLE_OWNER sysname   null,
        TABLE_NAME sysname  not null,
        NON_UNIQUE smallint null,
        INDEX_QUALIFIER sysname null,
        INDEX_NAME sysname null,
        TYPE smallint not null,
        SEQ_IN_INDEX smallint null,
        COLUMN_NAME sysname null,
        COLLATION char(1) null,
        CARDINALITY int null,
        PAGES int null,
        FILTER_CONDITION varchar(128) null
        )
    insert into #spstatistics exec sp_statistics @p1,@p2,@p3,@p4,@p5,@p6
    exec @ret = sp_cursoropen @handle output,
        'select * from #spstatistics',
        @scrollopt output, @ccopt output, @rows output
    drop table #spstatistics
    return @ret
go
               


if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;10(
               @handle          int output,
               @scrollopt           int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spprocedures (
        PROCEDURE_QUALIFIER sysname  null,
        PROCEDURE_OWNER sysname  null,
        PROCEDURE_NAME nvarchar(134) not null, /*134=sysname+';'+ltrim(str(c.number,5))*/
        NUM_INPUT_PARAMS int null,
        NUM_OUTPUT_PARAMS int null,
        NUM_RESULT_SETS int null,
        REMARKS varchar(254) null,
        PROCEDURE_TYPE smallint null
        )
    insert into #spprocedures exec sp_stored_procedures @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #spprocedures',
        @scrollopt output, @ccopt output, @rows output
    drop table #spprocedures
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;11(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sptabpriv (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname not null,
        GRANTOR sysname null,
        GRANTEE sysname not null,
        PRIVILEGE varchar(32) not null,
        IS_GRANTABLE varchar(3) null
        )
    insert into #sptabpriv exec sp_table_privileges @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptabpriv',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptabpriv
    return @ret
go



if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;12(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sptables (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname null,
        TABLE_TYPE  varchar(32) null,
        REMARKS varchar(254) null)
    if @procname = 'sp_tables'
    begin
        insert into #sptables exec sp_tables @p1,@p2,@p3,@p4
    end
    else
    begin
        insert into #sptables exec sp_tables_ex @p1,@p2,@p3,@p4,@p5
    end
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptables',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptables
    return @ret
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;13(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),  -- @table_name
               @p2              nvarchar(774),  -- @table_owner
               @p3              nvarchar(774),  -- @table_qualifier
               @p4              nvarchar(774))  -- @table_type
as
    -- this code was copied from sp_tableswc (for 7,0).  Any changes
    -- made here need to be evaluated for porting to sp_tableswc.
    set nocount on
    declare @ret int
    declare @databasename   sysname
    declare @qualprocname   nvarchar(141) /* 128 + '..sp_tables' */
    
    create table #sptables (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname null,
        TABLE_TYPE varchar(32) null,
        REMARKS varchar(254) null)
        
    declare databases CURSOR FOR
        select name from master..sysdatabases
        where name like @p3 and name <> 'model' and has_dbaccess(name)=1
        for read only

    open databases
    fetch next from databases into @databasename
    while (@@FETCH_STATUS <> -1)
    begin
        if (charindex('%', @databasename) = 0)
        begin   /* skip dbnames w/wildcard characters to prevent loop */
            select @qualprocname = @databasename + '..sp_tables'
            insert into #sptables exec @qualprocname
                @p1, @p2, @databasename, @p3
        end
        fetch next from databases into @databasename
    end
    deallocate databases
    
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptables',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptables
    return @ret
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_ddopen
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_ddopen;1(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774) = null,
               @p2              nvarchar(774) = null,
               @p3              nvarchar(774) = null,
               @p4              nvarchar(774) = null,
               @p5              nvarchar(774) = null,
               @p6              nvarchar(774) = null,
               @p7              int = null,
               @ODBCVer         int = 2)
as
    set nocount on
    declare @ret int

    if @procname = 'sp_column_privileges'
    begin
        exec @ret = sp_ddopen;2 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4
    end
    else if @procname = 'sp_columns' or @procname = 'sp_columns_ex'
    begin
        exec @ret = sp_ddopen;3 @handle output,
                            @procname,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @ODBCVer
    end
    else if @procname = 'sp_datatype_info'
    begin
        exec @ret = sp_ddopen;4 @handle output,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p7,
                            @ODBCVer
    end
    else if @procname = 'sp_fkeys'
    begin
        exec @ret = sp_ddopen;5 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6
    end
    else if @procname = 'sp_pkeys'
    begin
        exec @ret = sp_ddopen;6 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3
    end
    else if @procname = 'sp_special_columns'
    begin
        exec @ret = sp_ddopen;7 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6,
                            @ODBCVer
    end
    else if @procname = 'sp_sproc_columns'
    begin
        exec @ret = sp_ddopen;8 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @ODBCVer
    end
    else if @procname = 'sp_statistics'
    begin
        exec @ret = sp_ddopen;9 @handle output, 
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5,
                            @p6
    end
    else if @procname = 'sp_stored_procedures'
    begin
        exec @ret = sp_ddopen;10 @handle output, 
                             @scrollopt output, 
                             @ccopt output, 
                             @rows output, 
                             @p1,
                             @p2,
                             @p3
    end
    else if @procname = 'sp_table_privileges'
    begin
        exec @ret = sp_ddopen;11 @handle output, 
                             @scrollopt output, 
                             @ccopt output, 
                             @rows output, 
                             @p1,
                             @p2,
                             @p3
    end
    else if @procname = 'sp_tables' or @procname = 'sp_tables_ex'
    begin
        exec @ret = sp_ddopen;12 @handle output,
                            @procname,
                            @scrollopt output, 
                            @ccopt output, 
                            @rows output, 
                            @p1,
                            @p2,
                            @p3,
                            @p4,
                            @p5
    end
    else if @procname = 'sp_tableswc'
    begin
        exec @ret = sp_ddopen;13 @handle output,
                            @procname,
                            @scrollopt output,
                            @ccopt output,
                            @rows output,
                            @p1,
                            @p2,
                            @p3,
                            @p4
    end
    else
        print 'Unknown sp_ddopen procedure'
    select @ret = isnull(@ret,0)
    return isnull(@ret,0)
go


if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;2(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spcolpriv (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default not null,
        COLUMN_NAME sysname collate database_default not null,
        GRANTOR sysname collate database_default null,
        GRANTEE sysname collate database_default not null,
        PRIVILEGE varchar(32) collate database_default not null,
        IS_GRANTABLE varchar(3) collate database_default null
        )
    insert into #spcolpriv exec sp_column_privileges @p1,@p2,@p3,@p4
    exec @ret = sp_cursoropen @handle output,
        'select * from #spcolpriv',
        @scrollopt output, @ccopt output, @rows output
    drop table #spcolpriv
    return @ret
go


if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;3(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spcolumns (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default not null,
        COLUMN_NAME sysname collate database_default not null,
        DATA_TYPE smallint not null,
        TYPE_NAME sysname collate database_default not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        RADIX smallint null,
        NULLABLE smallint not null,
        REMARKS varchar(254) collate database_default null,
        COLUMN_DEF nvarchar(3000) collate database_default null,
        SQL_DATA_TYPE smallint null,
        SQL_DATETIME_SUB smallint null,
        CHAR_OCTET_LENGTH int null,
        ORDINAL_POSITION int not null,
        IS_NULLABLE varchar(254) collate database_default null,
        SS_DATA_TYPE tinyint null
        )

    if @procname = 'sp_columns'
    begin
        insert into #spcolumns exec sp_columns @p1,@p2,@p3,@p4,@ODBCVer
    end
    else
    begin
        insert into #spcolumns exec sp_columns_ex @p1,@p2,@p3,@p4,@p5,@ODBCVer
    end
    exec @ret = sp_cursoropen @handle output,
        'select * from #spcolumns',
        @scrollopt output, @ccopt output, @rows output
    drop table #spcolumns
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;4(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p7              int,
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spdatatypeinfo (
        TYPE_NAME           sysname  collate database_default not null,
        DATA_TYPE           smallint not null,
        "PRECISION"         int null,
        LITERAL_PREFIX      varchar(32) collate database_default null,
        LITERAL_SUFFIX      varchar(32)    collate database_default null,
        CREATE_PARAMS       varchar(32)    collate database_default null,
        NULLABLE            smallint   not null,
        CASE_SENSITIVE      smallint   not null,
        SEARCHABLE          smallint   not null,
        UNSIGNED_ATTRIBUTE  smallint   null,
        MONEY   smallint    not null,
        AUTO_INCREMENT      smallint    null,
        LOCAL_TYPE_NAME     sysname collate database_default null,
        MINIMUM_SCALE       smallint     null,
        MAXIMUM_SCALE       smallint   null,
        SQL_DATA_TYPE       smallint      not null,
        SQL_DATETIME_SUB    smallint   null,
        NUM_PREC_RADIX      int  null,
        INTERVAL_PRECISION  smallint    NULL,
        USERTYPE            smallint not null)

    insert into #spdatatypeinfo exec sp_datatype_info @p7,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spdatatypeinfo',
        @scrollopt output, @ccopt output, @rows output
    drop table #spdatatypeinfo
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;5(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spfkeys (
        PKTABLE_QUALIFIER sysname    collate database_default null,
        PKTABLE_OWNER sysname   collate database_default null,
        PKTABLE_NAME sysname  collate database_default not null,
        PKCOLUMN_NAME sysname  collate database_default not null,
        FKTABLE_QUALIFIER sysname   collate database_default null,
        FKTABLE_OWNER sysname   collate database_default null,
        FKTABLE_NAME sysname  collate database_default not null,
        FKCOLUMN_NAME sysname  collate database_default not null,
        KEY_SEQ smallint not null,
        UPDATE_RULE smallint null,
        DELETE_RULE smallint null,
        FK_NAME sysname collate database_default null,
        PK_NAME sysname collate database_default null,
        DEFERRABILITY smallint null
        )
    insert into #spfkeys exec sp_fkeys @p1,@p2,@p3,@p4,@p5,@p6
    exec @ret = sp_cursoropen @handle output,
        'select * from #spfkeys',
        @scrollopt output, @ccopt output, @rows output
    drop table #spfkeys
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;6(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sppkeys (
        TABLE_QUALIFIER sysname   collate database_default null,
        TABLE_OWNER sysname   collate database_default null,
        TABLE_NAME sysname  collate database_default not null,
        COLUMN_NAME sysname  collate database_default not null,
        KEY_SEQ smallint not null,
        PK_NAME sysname collate database_default null
        )
    insert into #sppkeys exec sp_pkeys @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #sppkeys',
        @scrollopt output, @ccopt output, @rows output
    drop table #sppkeys
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;7(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spspeccol (
        SCOPE smallint null,
        COLUMN_NAME sysname collate database_default not null,
        DATA_TYPE smallint not null,
        TYPE_NAME sysname collate database_default not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        PSEUDO_COLUMN smallint null
        )
    insert into #spspeccol exec sp_special_columns @p1,@p2,@p3,@p4,@p5,@p6,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spspeccol',
        @scrollopt output, @ccopt output, @rows output
    drop table #spspeccol
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;8(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @ODBCVer         int)
as
    set nocount on
    declare @ret int

    create table #spproccol (
        PROCEDURE_QUALIFIER sysname  collate database_default null,
        PROCEDURE_OWNER sysname  collate database_default null,
        PROCEDURE_NAME sysname collate database_default not null,
        COLUMN_NAME sysname collate database_default not null,
        COLUMN_TYPE smallint not null,
        DATA_TYPE smallint null,
        TYPE_NAME sysname collate database_default not null,
        "PRECISION" int null,
        LENGTH int null,
        SCALE smallint null,
        RADIX smallint null,
        NULLABLE smallint not null,
        REMARKS varchar(254) collate database_default null,
        COLUMN_DEF nvarchar(3000) collate database_default null,
        SQL_DATA_TYPE smallint null,
        SQL_DATETIME_SUB smallint null,
        CHAR_OCTET_LENGTH int null,
        ORDINAL_POSITION int not null,
        IS_NULLABLE varchar(254) collate database_default null,
        SS_DATA_TYPE tinyint null
        )
    insert into #spproccol exec sp_sproc_columns @p1,@p2,@p3,@p4,@ODBCVer
    exec @ret = sp_cursoropen @handle output,
        'select * from #spproccol',
        @scrollopt output, @ccopt output, @rows output
    drop table #spproccol
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;9(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774),
               @p6              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spstatistics (
        TABLE_QUALIFIER sysname   collate database_default null,
        TABLE_OWNER sysname   collate database_default null,
        TABLE_NAME sysname  collate database_default not null,
        NON_UNIQUE smallint null,
        INDEX_QUALIFIER sysname collate database_default null,
        INDEX_NAME sysname collate database_default null,
        TYPE smallint not null,
        SEQ_IN_INDEX smallint null,
        COLUMN_NAME sysname collate database_default null,
        COLLATION char(1) collate database_default null,
        CARDINALITY int null,
        PAGES int null,
        FILTER_CONDITION varchar(128) collate database_default null
        )
    insert into #spstatistics exec sp_statistics @p1,@p2,@p3,@p4,@p5,@p6
    exec @ret = sp_cursoropen @handle output,
        'select * from #spstatistics',
        @scrollopt output, @ccopt output, @rows output
    drop table #spstatistics
    return @ret
go
               


if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;10(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #spprocedures (
        PROCEDURE_QUALIFIER sysname  collate database_default null,
        PROCEDURE_OWNER sysname  collate database_default null,
        PROCEDURE_NAME nvarchar(134) collate database_default not null, /*134=sysname+';'+ltrim(str(c.number,5))*/
        NUM_INPUT_PARAMS int null,
        NUM_OUTPUT_PARAMS int null,
        NUM_RESULT_SETS int null,
        REMARKS varchar(254) collate database_default null,
        PROCEDURE_TYPE smallint null
        )
    insert into #spprocedures exec sp_stored_procedures @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #spprocedures',
        @scrollopt output, @ccopt output, @rows output
    drop table #spprocedures
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;11(
               @handle          int output,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sptabpriv (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default not null,
        GRANTOR sysname collate database_default null,
        GRANTEE sysname collate database_default not null,
        PRIVILEGE varchar(32) collate database_default not null,
        IS_GRANTABLE varchar(3) collate database_default null
        )
    insert into #sptabpriv exec sp_table_privileges @p1,@p2,@p3
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptabpriv',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptabpriv
    return @ret
go



if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_ddopen;12(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),
               @p2              nvarchar(774),
               @p3              nvarchar(774),
               @p4              nvarchar(774),
               @p5              nvarchar(774))
as
    set nocount on
    declare @ret int

    create table #sptables (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default null,
        TABLE_TYPE  varchar(32) collate database_default null,
        REMARKS varchar(254) collate database_default null)
    if @procname = 'sp_tables'
    begin
        insert into #sptables exec sp_tables @p1,@p2,@p3,@p4
    end
    else
    begin
        insert into #sptables exec sp_tables_ex @p1,@p2,@p3,@p4,@p5
    end
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptables',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptables
    return @ret
go

create procedure sp_ddopen;13(
               @handle          int output,
               @procname        sysname,
               @scrollopt       int output,
               @ccopt           int output,
               @rows            int output,
               @p1              nvarchar(774),  -- @table_name
               @p2              nvarchar(774),  -- @table_owner
               @p3              nvarchar(774),  -- @table_qualifier
               @p4              nvarchar(774))  -- @table_type
as
    -- this code was copied from sp_tableswc (for 8.0).  Any changes
    -- made here need to be evaluated for porting to sp_tableswc.
    set nocount on
    declare @ret int
    declare @databasename   sysname
    declare @qualprocname   nvarchar(141) /* 128 + '..sp_tables' */

    create table #sptables (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default null,
        TABLE_TYPE  varchar(32) collate database_default null,
        REMARKS varchar(254) collate database_default null)

    declare databases CURSOR FOR
        select name from master..sysdatabases
        where name like @p3 and name <> 'model' and has_dbaccess(name)=1
        for read only

    open databases
    fetch next from databases into @databasename
    while (@@FETCH_STATUS <> -1)
    begin
        if (charindex('%', @databasename) = 0)
        begin   /* skip dbnames w/wildcard characters to prevent loop */
            select @qualprocname = @databasename + '..sp_tables'
            insert into #sptables exec @qualprocname
                @p1, @p2, @databasename, @p4
        end
        fetch next from databases into @databasename
    end
    deallocate databases
    exec @ret = sp_cursoropen @handle output,
        'select * from #sptables',
        @scrollopt output, @ccopt output, @rows output
    drop table #sptables
    return @ret
go

grant execute on sp_ddopen to public
go

print 'creating sp_tableswc'
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 server */
create procedure sp_tableswc(
               @table_name      nvarchar(384)   = null,
               @table_owner     nvarchar(384)   = null,
               @table_qualifier sysname = null,
               @table_type      varchar(100) = null)
as
    -- sp_ddopen;13 contains the same code, so changes made here should
    -- be evaluated for porting to sp_ddopen;13
    declare @databasename   sysname
    declare @qualprocname   nvarchar(141) /* 128 + '..sp_tables' */

    create table #sptables (
        TABLE_QUALIFIER sysname null,
        TABLE_OWNER sysname null,
        TABLE_NAME sysname null,
        TABLE_TYPE  varchar(32) null,
        REMARKS varchar(254) null)

    declare databases CURSOR FOR
        select name from master..sysdatabases
        where name like @table_qualifier and name <> 'model' and has_dbaccess(name)=1
        for read only

    open databases
    fetch next from databases into @databasename
    while (@@FETCH_STATUS <> -1)
    begin
        if (charindex('%', @databasename) = 0)
        begin   /* skip dbnames w/wildcard characters to prevent loop */
            select @qualprocname = @databasename + '..sp_tables'
            insert into #sptables exec @qualprocname
                @table_name, @table_owner, @databasename, @table_type
        end
        fetch next from databases into @databasename
    end
    deallocate databases
    select * from #sptables
        order by 4, 1, 2, 3
go

if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
drop procedure sp_tableswc
go

/*  Procedure for 8.0 server */
create procedure sp_tableswc(
               @table_name      nvarchar(384)   = null,
               @table_owner     nvarchar(384)   = null,
               @table_qualifier sysname = null,
               @table_type      varchar(100) = null)
as
    -- sp_ddopen;13 contains the same code, so changes made here should
    -- be evaluated for porting to sp_ddopen;13
    declare @databasename   sysname
    declare @qualprocname   nvarchar(141) /* 128 + '..sp_tables' */

    create table #sptables (
        TABLE_QUALIFIER sysname collate database_default null,
        TABLE_OWNER sysname collate database_default null,
        TABLE_NAME sysname collate database_default null,
        TABLE_TYPE  varchar(32) collate database_default null,
        REMARKS varchar(254) collate database_default null)

    declare databases CURSOR FOR
        select name from master..sysdatabases
        where name like @table_qualifier and name <> 'model' and has_dbaccess(name)=1
        for read only

    open databases
    fetch next from databases into @databasename
    while (@@FETCH_STATUS <> -1)
    begin
        if (charindex('%', @databasename) = 0)
        begin   /* skip dbnames w/wildcard characters to prevent loop */
            select @qualprocname = @databasename + '..sp_tables'
            insert into #sptables exec @qualprocname
                @table_name, @table_owner, @databasename, @table_type
        end
        fetch next from databases into @databasename
    end
    deallocate databases
    select * from #sptables
        order by 4, 1, 2, 3
go

grant execute on sp_tableswc to public
go

dump tran master with no_log
go

/*-------------------------------------------------------------------------*/
/*-------------- CATALOG STORED PROCEDURES FOR SQLOLEDB  ------------------*/
/*-------------------------------------------------------------------------*/

print ''
print 'creating spt_provider_types'
go
if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin /* Pre 8.0 Server */
create table spt_provider_types
    (
    ss_dtype        tinyint     not null,
    fixlen          int         null,       /* datatype len for variable, else null */
    type_name       sysname     not null,
    oledb_data_type     smallint    not null,
    best_match      bit     not null,
    is_nullable     tinyint     null,
    case_sensitive      bit     not null,
    fixed_prec_scale    bit     not null,
    is_long         bit     not null,
    auto_unique_value   tinyint     not null,
    data_precision      int         null,
    numeric_scale       smallint    null,       /* min scale if 6.0 */
    column_size     int         null,
    literal_prefix      varchar(32) null,
    literal_suffix      varchar(32)     null,
    searchable      int     not null,
    unsigned_attribute  tinyint     null,
    local_type_name     sysname     null
    )
print ''
print ''
print 'Warning:'
print 'you are installing the stored procedures '
print 'on a pre 8.0 SQL Server.'
print 'Ignore the following errors.'
end
go
if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
begin /* 8.0 Server */
create table spt_provider_types
    (
    ss_dtype        tinyint     not null,
    fixlen          int         null,       /* datatype len for variable, else null */
    type_name       sysname     not null,
    oledb_data_type     smallint    not null,
    best_match      bit     not null,
    is_nullable     bit     null,
    case_sensitive      bit     not null,
    fixed_prec_scale    bit     not null,
    is_long         bit     not null,
    auto_unique_value   tinyint     not null,
    data_precision      int         null,
    numeric_scale       smallint    null,       /* min scale if 6.0 */
    column_size     int         null,
    literal_prefix      nvarchar(32)    null,
    literal_suffix      nvarchar(32)    null,
    searchable      int     not null,
    unsigned_attribute  tinyint     null,
    local_type_name     sysname     null
    )
end
go

grant select on spt_provider_types to public
go
dump tran master with no_log
go

/*
** Insert the spt_provider_types rows for DBTYTPE_STR data types
*/
begin tran

/* Get case sensitivity */
declare @case_sensitive bit
select @case_sensitive = case when 'a' <> 'A' then 1 else 0 end
/* Local Char */
insert into spt_provider_types values
    (
    47 /*SQLCHARACTER*/,        /* ss_dtype */
    0,              /* fixlen */
    'char',             /* type_name */
    129 /*DBTYPE_STR*/,     /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    @case_sensitive,        /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '''',               /* literal_prefix */
    '''',               /* literal_suffix */
    4 /*DB_SEARCHABLE*/,        /* searchable */
    null,               /* unsigned_attribute */
    'char'              /* local_type_name */
    )

/* Local Varchar */
insert into spt_provider_types values
    (
    39 /*SQLVARCHAR*/,      /* ss_dtype */
    null,               /* fixlen */
    'varchar',          /* type_name */
    129 /*DBTYPE_STR*/,     /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    @case_sensitive,        /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '''',               /* literal_prefix */
    '''',               /* literal_suffix */
    4 /*DB_SEARCHABLE*/,        /* searchable */
    null,               /* unsigned_attribute */
    'varchar'           /* local_type_name */
    )

/* Local Text */
insert into spt_provider_types values
    (
    35  /*SQLTEXT*/,        /* ss_dtype */
    null,               /* fixlen */
    'text',             /* type_name */
    129 /*DBTYPE_STR*/,     /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    @case_sensitive,        /* case_sensitive */
    0,              /* fixed_prec_scale */
    1,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    2147483647,         /* column_size */
    '''',               /* literal_prefix */
    '''',               /* literal_suffix */
    2 /*DB_LIKE_ONLY*/,     /* searchable */
    null,               /* unsigned_attribute */
    'text'              /* local_type_name */
    )
commit tran
go
dump tran master with no_log
go

/*
** Insert the spt_provider_types rows for DBTYTPE_BYTES data types
*/
begin tran
/* Local Binary */
insert into spt_provider_types values
    (
    45 /*SQLBINARY*/,       /* ss_dtype */
    0,              /* fixlen */
    'binary',           /* type_name */
    128 /*DBTYPE_BYTES*/,       /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '0x',               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    null,               /* unsigned_attribute */
    'binary'            /* local_type_name */
    )

/* Local Varbinary */
insert into spt_provider_types values
    (
    37 /*SQLVARBINARY*/,        /* ss_dtype */
    null,               /* fixlen */
    'varbinary',            /* type_name */
    128 /*DBTYPE_BYTES*/,       /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '0x',               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    null,               /* unsigned_attribute */
    'varbinary'         /* local_type_name */
    )

/* Local Image */
insert into spt_provider_types values
    (
    34 /*SQLIMAGE*/,        /* ss_dtype */
    null,               /* fixlen */
    'image',            /* type_name */
    128 /*DBTYPE_BYTES*/,       /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    1,              /* is_long */
    0,              /* auto_unique_value */
    null,               /* data_precision */
    null,               /* numeric_scale */
    2147483647,         /* column_size */
    '0x',               /* literal_prefix */
    null,               /* literal_suffix */
    1 /*DB_UNSEARCHABLE*/,      /* searchable */
    null,               /* unsigned_attribute */
    'image'             /* local_type_name */
    )

commit tran
go
dump tran master with no_log
go

/*
** Insert the spt_provider_types rows for DBTYPE_DBTIMESTAMP data types
*/
begin tran

/* Local Datetime */
insert into spt_provider_types values
    (
    61 /*SQLDATETIME*/,     /* ss_dtype */
    8,              /* fixlen */
    'datetime',         /* type_name */
    135 /*DBTYPE_DBTIMESTAMP*/, /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    23,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '''',               /* literal_prefix */
    '''',               /* literal_suffix */
    4 /*DB_SEARCHABLE*/,        /* searchable */
    null,               /* unsigned_attribute */
    'datetime'          /* local_type_name */
    )

/* Local Smalldatetime */
insert into spt_provider_types values
    (
    58 /*SQLDATETIM4*/,     /* ss_dtype */
    4,              /* fixlen */
    'smalldatetime',        /* type_name */
    135 /*DBTYPE_DBTIMESTAMP*/, /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    16,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '''',               /* literal_prefix */
    '''',               /* literal_suffix */
    4 /*DB_SEARCHABLE*/,        /* searchable */
    null,               /* unsigned_attribute */
    'smalldatetime'         /* local_type_name */
    )

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
    begin   /*  Add nullable type for non-Sphinx server */
    
    /* Local Datetimn */
    insert into spt_provider_types values
        (
        111 /*SQLDATETIMN*/,        /* ss_dtype */
        4,              /* fixlen */
        'smalldatetime',        /* type_name */
        135 /*DBTYPE_DBTIMESTAMP*/, /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        16,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        '''',               /* literal_prefix */
        '''',               /* literal_suffix */
        4 /*DB_SEARCHABLE*/,        /* searchable */
        null,               /* unsigned_attribute */
        'smalldatetime'         /* local_type_name */
        )   
    insert into spt_provider_types values
        (
        111 /*SQLDATETIMN*/,        /* ss_dtype */
        8,              /* fixlen */
        'datetime',         /* type_name */
        135 /*DBTYPE_DBTIMESTAMP*/, /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        23,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        '''',               /* literal_prefix */
        '''',               /* literal_suffix */
        4 /*DB_SEARCHABLE*/,        /* searchable */
        null,               /* unsigned_attribute */
        'datetime'          /* local_type_name */
        )
    end

commit tran
go
dump tran master with no_log
go

/*
** Insert the spt_provider_types rows for DBTYPE_CY data types
*/
begin tran

/* Local Smallmoney */
insert into spt_provider_types values
    (
    122 /*SQLMONEY4*/,      /* ss_dtype */
    4,              /* fixlen */
    'smallmoney',           /* type_name */
    6 /*DBTYPE_CY*/,        /* oledb_data_type */
    0,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    1,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    10,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '$',                /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'smallmoney'            /* local_type_name */
    )   
    
/* Local Money */
insert into spt_provider_types values
    (
    60 /*SQLMONEY*/,        /* ss_dtype */
    8,              /* fixlen */
    'money',            /* type_name */
    6 /*DBTYPE_CY*/,        /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    1,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    19,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    '$',                /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'money'             /* local_type_name */
    )   

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
    begin   /*  Add nullable type for non-Sphinx server */

    /* Local Moneyn */
    insert into spt_provider_types values
        (
        110 /*SQLMONEYN*/,  /* ss_dtype */
        4,          /* fixlen */
        'smallmoney',       /* type_name */
        6 /*DBTYPE_CY*/,    /* oledb_data_type */
        0,          /* best_match */
        null,           /* is_nullable */
        0,          /* case_sensitive */
        1,          /* fixed_prec_scale */
        0,          /* is_long */
        0,          /* auto_unique_value */
        10,         /* data_precision */
        null,           /* numeric_scale */
        null,           /* column_size */
        '$',            /* literal_prefix */
        null,           /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/, /* searchable */
        0,          /* unsigned_attribute */
        'smallmoney'        /* local_type_name */
        )   
    insert into spt_provider_types values
        (
        110 /*SQLMONEYN*/,  /* ss_dtype */
        8,          /* fixlen */
        'money',        /* type_name */
        6 /*DBTYPE_CY*/,    /* oledb_data_type */
        0,          /* best_match */
        null,           /* is_nullable */
        0,          /* case_sensitive */
        1,          /* fixed_prec_scale */
        0,          /* is_long */
        0,          /* auto_unique_value */
        19,         /* data_precision */
        null,           /* numeric_scale */
        null,           /* column_size */
        '$',            /* literal_prefix */
        null,           /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/, /* searchable */
        null,           /* unsigned_attribute */
        'money'         /* local_type_name */
        )   
    end

commit tran
go
dump tran master with no_log
go

/*
** Insert the spt_provider_types rows for the numeric data types
*/
begin tran

/* Local Float */
insert into spt_provider_types values
    (
    62 /*SQLFLT8*/,         /* ss_dtype */
    8,              /* fixlen */
    'float',            /* type_name */
    5 /*DBTYPE_R8*/,        /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    15,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    null,               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'float'             /* local_type_name */
    )   

/* Local Real */
insert into spt_provider_types values
    (
    59 /*SQLFLT4*/,         /* ss_dtype */
    4,              /* fixlen */
    'real',             /* type_name */
    4 /*DBTYPE_R4*/,        /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    0,              /* fixed_prec_scale */
    0,              /* is_long */
    0,              /* auto_unique_value */
    7,              /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    null,               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'real'              /* local_type_name */
    )   

/* Local Int */
insert into spt_provider_types values
    (
    56 /*SQLINT4*/,         /* ss_dtype */
    4,              /* fixlen */
    'int',              /* type_name */
    3 /*DBTYPE_I4*/,        /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    1,              /* fixed_prec_scale */
    0,              /* is_long */
    1,              /* auto_unique_value */
    10,             /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    null,               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'int'               /* local_type_name */
    )   

/* Local Smallint */
insert into spt_provider_types values
    (
    52 /*SQLINT2*/,         /* ss_dtype */
    2,              /* fixlen */
    'smallint',         /* type_name */
    2 /*DBTYPE_I2*/,        /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    1,              /* fixed_prec_scale */
    0,              /* is_long */
    1,              /* auto_unique_value */
    5,              /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    null,               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    0,              /* unsigned_attribute */
    'smallint'          /* local_type_name */
    )   

/* Local Tinyint */
insert into spt_provider_types values
    (
    48 /*SQLINT1*/,         /* ss_dtype */
    1,              /* fixlen */
    'tinyint',          /* type_name */
    17 /*DBTYPE_UI1*/,      /* oledb_data_type */
    1,              /* best_match */
    null,               /* is_nullable */
    0,              /* case_sensitive */
    1,              /* fixed_prec_scale */
    0,              /* is_long */
    1,              /* auto_unique_value */
    3,              /* data_precision */
    null,               /* numeric_scale */
    null,               /* column_size */
    null,               /* literal_prefix */
    null,               /* literal_suffix */
    3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
    1,              /* unsigned_attribute */
    'tinyint'           /* local_type_name */
    )   
commit tran
go
dump tran master with no_log
go
begin tran  
if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    begin   /*  Add 6.0 data types */
    
    /* Local Decimal */
    insert into spt_provider_types values
        (
        55 /*SQLDECIMAL*/,      /* ss_dtype */
        0,              /* fixlen */
        'decimal',          /* type_name */
        131 /*DBTYPE_NUMERIC*/,     /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        38,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        0,              /* unsigned_attribute */
        'decimal'           /* local_type_name */
        )   

    /* Local Numeric */
    insert into spt_provider_types values
        (
        63 /*SQLNUMERIC*/,      /* ss_dtype */
        0,              /* fixlen */
        'numeric',          /* type_name */
        131 /*DBTYPE_NUMERIC*/,     /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        38,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        0,              /* unsigned_attribute */
        'numeric'           /* local_type_name */
        )   
    end
commit tran
go
dump tran master with no_log
go
begin tran
if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
    begin   /*  Add nullable type for non-Sphinx server */
    
    /* Local Floatn */
    insert into spt_provider_types values
        (
        109 /*SQLFLTN*/,        /* ss_dtype */
        8,              /* fixlen */
        'float',            /* type_name */
        5 /*DBTYPE_R8*/,        /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        15,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'float'             /* local_type_name */
        )   
    insert into spt_provider_types values
        (
        109 /*SQLFLT4*/,        /* ss_dtype */
        4,              /* fixlen */
        'real',             /* type_name */
        4 /*DBTYPE_R4*/,        /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        7,              /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'real'              /* local_type_name */
        )   

    /* Local Intn */
    insert into spt_provider_types values
        (
        38 /*SQLINTN*/,         /* ss_dtype */
        4,              /* fixlen */
        'int',              /* type_name */
        3 /*DBTYPE_I4*/,        /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        10,             /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        0,              /* unsigned_attribute */
        'int'               /* local_type_name */
        )   
    insert into spt_provider_types values
        (
        38 /*SQLINTN*/,         /* ss_dtype */
        2,              /* fixlen */
        'smallint',         /* type_name */
        2 /*DBTYPE_I2*/,        /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        5,              /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        0,              /* unsigned_attribute */
        'smallint'          /* local_type_name */
        )   
    insert into spt_provider_types values
        (
        38 /*SQLINTN*/,         /* ss_dtype */
        1,              /* fixlen */
        'tinyint',          /* type_name */
        17 /*DBTYPE_UI1*/,      /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        3,              /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        1,              /* unsigned_attribute */
        'tinyint'           /* local_type_name */
        )   

    if (charindex('6.00', @@version) > 0 or charindex('6.50', @@version) > 0)
        begin   /*  Add 6.0 data types */
        
        /* Local Decimaln */
        insert into spt_provider_types values
            (
            106 /*SQLDECIMALN*/,        /* ss_dtype */
            0,              /* fixlen */
            'decimal',          /* type_name */
            131 /*DBTYPE_NUMERIC*/,     /* oledb_data_type */
            0,              /* best_match */
            null,               /* is_nullable */
            0,              /* case_sensitive */
            1,              /* fixed_prec_scale */
            0,              /* is_long */
            1,              /* auto_unique_value */
            38,             /* data_precision */
            null,               /* numeric_scale */
            null,               /* column_size */
            null,               /* literal_prefix */
            null,               /* literal_suffix */
            3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
            0,              /* unsigned_attribute */
            'decimal'           /* local_type_name */
            )   

        /* Local Numericn */
        insert into spt_provider_types values
            (
            108 /*SQLNUMERICN*/,        /* ss_dtype */
            0,              /* fixlen */
            'numeric',          /* type_name */
            131 /*DBTYPE_NUMERIC*/,     /* oledb_data_type */
            0,              /* best_match */
            null,               /* is_nullable */
            0,              /* case_sensitive */
            1,              /* fixed_prec_scale */
            0,              /* is_long */
            1,              /* auto_unique_value */
            38,             /* data_precision */
            null,               /* numeric_scale */
            null,               /* column_size */
            null,               /* literal_prefix */
            null,               /* literal_suffix */
            3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
            0,              /* unsigned_attribute */
            'numeric'           /* local_type_name */
            )   
        end
    end
commit tran
go
dump tran master with no_log
go

/*
**  Remaining data types
*/
if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go
begin tran

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    begin
    /* Local Bit */
    insert into spt_provider_types values
        (
        50 /*SQLBIT*/,          /* ss_dtype */
        0,              /* fixlen */
        'bit',              /* type_name */
        11 /*DBTYPE_BOOL*/,     /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        1,              /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'bit'               /* local_type_name */
        )       
    
    /* Local Timestamp */
    insert into spt_provider_types values
        (
        0,              /* ss_dtype */
        8,              /* fixlen */
        'timestamp',            /* type_name */
        128 /*DBTYPE_BYTES*/,       /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        '0x',               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'timestamp'         /* local_type_name */
        )   
    /* Local GUID */
    insert into spt_provider_types values
        (
        0,              /* ss_dtype */
        16,             /* fixlen */
        'uniqueidentifier',     /* type_name */
        72 /*DBTYPE_GUID*/,     /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        '''',               /* literal_prefix */
        '''',               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'uniqueidentifier'      /* local_type_name */
        )   
    
    /* Get case sensitivity */
    declare @ncase_sensitive bit
    select @ncase_sensitive = case when N'a' <> N'A' then 1 else 0 end

    /* Local NChar */
    insert into spt_provider_types values
        (
        0,              /* ss_dtype */
        0,              /* fixlen */
        'nchar',            /* type_name */
        130 /*DBTYPE_WSTR*/,        /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        @ncase_sensitive,       /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        'N''',              /* literal_prefix */
        '''',               /* literal_suffix */
        4 /*DB_SEARCHABLE*/,        /* searchable */
        null,               /* unsigned_attribute */
        'nchar'             /* local_type_name */
        )   

    /* Local NVarChar */
    insert into spt_provider_types values
        (
        0,              /* ss_dtype */
        null,               /* fixlen */
        'nvarchar',         /* type_name */
        130 /*DBTYPE_WSTR*/,        /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        @ncase_sensitive,       /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        'N''',              /* literal_prefix */
        '''',               /* literal_suffix */
        4 /*DB_SEARCHABLE*/,        /* searchable */
        null,               /* unsigned_attribute */
        'nvarchar'          /* local_type_name */
        )   

    /* Local NText */
    insert into spt_provider_types values
        (
        0,              /* ss_dtype */
        null,               /* fixlen */
        'ntext',            /* type_name */
        130 /*DBTYPE_WSTR*/,        /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        @ncase_sensitive,       /* case_sensitive */
        0,              /* fixed_prec_scale */
        1,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        1073741823,         /* column_size */
        'N''',              /* literal_prefix */
        '''',               /* literal_suffix */
        2 /*DB_LIKE_ONLY*/,     /* searchable */
        null,               /* unsigned_attribute */
        'ntext'             /* local_type_name */
        )   

    if (charindex('8.00', @@version) > 0)
    begin
    /* Local BIGINT */
    insert into spt_provider_types values
        (
        127,                /* ss_dtype */
        8,              /* fixlen */
        'bigint',           /* type_name */
        20 /*DBTYPE_I8*/,       /* oledb_data_type */
        1,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        1,              /* fixed_prec_scale */
        0,              /* is_long */
        1,              /* auto_unique_value */
        19,             /* data_precision */
        null,           /* numeric_scale */
        null,           /* column_size */
        null,           /* literal_prefix */
        null,           /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,       /* searchable */
        0,              /* unsigned_attribute */
        'bigint'        /* local_type_name */
        )

    /* sql_variant */
    insert into spt_provider_types values
        (
        98,             /* ss_dtype */
        null,           /* fixlen */
        'sql_variant',  /* type_name */
        12 /*DBTYPE_VARIANT*/,      /* oledb_data_type */
        1,              /* best_match */
        null,           /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        16,             /* data_precision sizeof(VARIANT)*/
        null,           /* numeric_scale */
        null,           /* column_size */
        null,           /* literal_prefix */
        null,           /* literal_suffix */
        3 ,                 /*DB_ALL_EXCEPT_LIKE*/
        null,           /* unsigned_attribute */
        'sql_variant'   /* local_type_name */
        )
    end


    /* data types changed in Sphinx: DO AFTER ALL TYPES INSERTED! */    
    update spt_provider_types set ss_dtype = (select xtype from systypes    where type_name like name+'%')

    end
commit tran
go
dump tran master with no_log
go
begin tran
if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
    begin
    /* Local Bit */
    insert into spt_provider_types values
        (
        50 /*SQLBIT*/,          /* ss_dtype */
        0,              /* fixlen */
        'bit',              /* type_name */
        11 /*DBTYPE_BOOL*/,     /* oledb_data_type */
        1,              /* best_match */
        0,              /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        1,              /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        null,               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'bit'               /* local_type_name */
        )   

    /* Local Timestamp */
    insert into spt_provider_types values
        (
        45 /*SQLBINARY*/,       /* ss_dtype */
        8,              /* fixlen */
        'timestamp',            /* type_name */
        128 /*DBTYPE_BYTES*/,       /* oledb_data_type */
        0,              /* best_match */
        null,               /* is_nullable */
        0,              /* case_sensitive */
        0,              /* fixed_prec_scale */
        0,              /* is_long */
        0,              /* auto_unique_value */
        null,               /* data_precision */
        null,               /* numeric_scale */
        null,               /* column_size */
        '0x',               /* literal_prefix */
        null,               /* literal_suffix */
        3 /*DB_ALL_EXCEPT_LIKE*/,   /* searchable */
        null,               /* unsigned_attribute */
        'timestamp'         /* local_type_name */
        )       
end

commit tran
go
dump tran master with no_log
go

create unique clustered index datatypeinfoclust on spt_provider_types(ss_dtype,fixlen)
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'spt_provider_types' and type = 'U '))
        begin
        drop table spt_provider_types
        dump tran master with no_log
        end
    end
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go


/* 
** (2/11/98) 
** The following SP is shared by instcat.sql and the server to add information
** related to server language collations. The server calls it at the end of
** collation change to update the catalog with the new language collations
** Everything in this SP should NOT use tempdb.  
*/

create procedure sp_add_server_sortinfo
as
-- spt_server_info has unigue clustered index on attribute_id
delete spt_server_info where attribute_id in (16,18)

--insert into spt_server_info
--  select 18,'COLLATION_SEQ',
--      'charset='+t2.name+' sort_order='+t1.name
--      +' charset_num='+rtrim(convert(char(4),t1.csid))+
--      ' sort_order_num='+rtrim(convert(char(4),t1.id))
--  from master.dbo.syscharsets t1, master.dbo.syscharsets t2, master.dbo.sysconfigures t3
--  where t1.csid=t2.id and t1.id=t3.value and t3.config in (123,1123)
declare @sortid int, @csid int, @sortname varchar(255), @attribute_value varchar(255)
declare @case_sensitive bit
declare @ncase_sensitive bit
select @case_sensitive = case when 'a' <> 'A' then 1 else 0 end
select @ncase_sensitive = case when N'a' <> N'A' then 1 else 0 end
select @sortid = value from sysconfigures where config = 1123
select @csid = csid, @sortname = name from master.dbo.syscharsets where id = @sortid
select @attribute_value = 'charset='+ name +' sort_order=' + @sortname
        + ' charset_num=' + rtrim(convert(char(4),@csid))+
        ' sort_order_num=' + rtrim(convert(char(4),@sortid))
        from syscharsets where id = @csid

insert into spt_server_info
        values (18,'COLLATION_SEQ', isnull(@attribute_value, ' '))

if @case_sensitive = 1 /* If case sensitive server */
begin
    insert into spt_server_info
        values (16,'IDENTIFIER_CASE','SENSITIVE')
end
else
begin
    insert into spt_server_info
        values (16,'IDENTIFIER_CASE','MIXED')
end


update spt_datatype_info set CASE_SENSITIVE = @case_sensitive 
    where DATA_TYPE in (-1, 1, 12) /* CHAR types */
update spt_datatype_info set CASE_SENSITIVE = @ncase_sensitive
    where DATA_TYPE in (-10, -9, -8) /* NCHAR types */
update spt_provider_types set case_sensitive = @case_sensitive 
    where oledb_data_type = 129 /*DBTYPE_STR*/
update spt_provider_types set case_sensitive = @ncase_sensitive
    where oledb_data_type = 130 /*DBTYPE_WSTR*/
/* sp_add_server_sortinfo */
go  


if (charindex('7.00', @@version) > 0)
begin
    exec sp_add_server_sortinfo
end
go

-- 8.0 version of sp_add_server_sortinfo
--
create procedure sp_add_server_sortinfo75
as
-- spt_server_info has unigue clustered index on attribute_id
    delete spt_server_info where attribute_id in (16, 18)

    declare @sortid int, @csid int, @sortname varchar(255), @attribute_value varchar(255)
    declare @case_sensitive bit
    declare @ncase_sensitive bit
    select @case_sensitive = case when 'a' <> 'A' then 1 else 0 end
    select @ncase_sensitive = case when N'a' <> N'A' then 1 else 0 end

    select @sortid = convert(int, ServerProperty('sqlsortorder')) 
    select @csid = convert(int, ServerProperty('sqlcharset')) 
    select @sortname = name from master.dbo.syscharsets where id = @sortid

    if @sortid = 0 -- Non-SQL Collations
        BEGIN
        select @attribute_value = 'charset=' 
            + name
            + ' collation=' + isnull(convert(sysname, ServerProperty('collation')), ' ')
            from syscharsets where id = @csid
        END
    else
        BEGIN
        select @attribute_value = 'charset='+ name +' sort_order=' + @sortname
            + ' charset_num=' + rtrim(convert(char(4),@csid))+
            ' sort_order_num=' + rtrim(convert(char(4),@sortid))
            from syscharsets where id = @csid
        END

    insert into spt_server_info
            values (18,'COLLATION_SEQ', isnull(@attribute_value, ' '))

    if @case_sensitive = 1 /* If case sensitive server */
    begin
        insert into spt_server_info
            values (16,'IDENTIFIER_CASE','SENSITIVE')
    end
    else
    begin
        insert into spt_server_info
            values (16,'IDENTIFIER_CASE','MIXED')
    end


    update spt_datatype_info set CASE_SENSITIVE = @case_sensitive 
        where DATA_TYPE in (-1, 1, 12) /* CHAR types */
    update spt_datatype_info set CASE_SENSITIVE = @ncase_sensitive
        where DATA_TYPE in (-10, -9, -8) /* NCHAR types */
    update spt_provider_types set case_sensitive = @case_sensitive 
        where oledb_data_type = 129 /*DBTYPE_STR*/
    update spt_provider_types set case_sensitive = @ncase_sensitive
        where oledb_data_type = 130 /*DBTYPE_WSTR*/
/* sp_add_server_info75 */
go 



if (charindex('8.00', @@version) > 0)
begin
    exec sp_add_server_sortinfo75
end
go

print ''
print 'creating sp_catalogs_rowset'
go

create procedure sp_catalogs_rowset
    (
    @catalog_name       varchar(255)
    )       
as
    select
        CATALOG_NAME    = name,
        DESCRIPTION = convert(varchar(1),null)
    from    master.dbo.sysdatabases
    where   name = @catalog_name AND has_dbaccess(name)=1
go
dump tran master with no_log
go
create procedure sp_catalogs_rowset;2
    (
    @dummy      int /* remove when Hydra bug 17032 is fixed */
    )
as
    select
        CATALOG_NAME    = name,
        DESCRIPTION = convert(varchar(1),null)
    from    master.dbo.sysdatabases
    where   has_dbaccess(name)=1
    order by 1
go
dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_catalogs_rowset
go

/*  Procedure for 8.0 server */
create procedure sp_catalogs_rowset
    (
    @catalog_name       sysname
    )       
as
    select
        CATALOG_NAME    = name,
        DESCRIPTION = convert(nvarchar(1),null)
    from    master.dbo.sysdatabases
    where   name = @catalog_name AND has_dbaccess(name)=1
go
dump tran master with no_log
go
create procedure sp_catalogs_rowset;2
    (
    @dummy      int /* remove when Hydra bug 17032 is fixed */
    )
as
    select
        CATALOG_NAME    = name,
        DESCRIPTION = convert(nvarchar(1),null)
    from    master.dbo.sysdatabases
    where   has_dbaccess(name)=1
    order by 1
go
dump tran master with no_log
go
create procedure sp_catalogs_rowset;5
    (
    @server_name    sysname,
    @catalog_name   sysname = NULL
    )
as
    select  CATALOG_NAME,
        DESCRIPTION
    from master.dbo.SYSREMOTE_CATALOGS ( @server_name, @catalog_name )
    where   has_dbaccess(CATALOG_NAME)=1
    order by 1
go

grant execute on sp_catalogs_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_catalogs_rowset' and type = 'P '))
        begin
        drop procedure sp_catalogs_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_column_privileges_rowset'
go

/*  Procedure for 6.0 and 6.5 server */
CREATE PROCEDURE sp_column_privileges_rowset
    (
    @table_name     varchar(255) = null,
    @table_schema   varchar(255) = null,
    @column_name    varchar(255) = null,
    @grantor    varchar(255) = null,
    @grantee    varchar(255) = null
    )
as
IF @table_name is not null
    BEGIN
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
    END
ELSE
    BEGIN
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
    END
go
dump tran master with no_log
go
CREATE PROCEDURE sp_column_privileges_rowset;2
    (
    @handle     int output,
    @scrollopt  int output,
    @ccopt      int output,
    @rows       int output,
    @table_name     varchar(255) = null,
    @table_schema   varchar(255) = null,
    @column_name    varchar(255) = null,
    @grantor    varchar(255) = null,
    @grantee    varchar(255) = null
    )
as

declare @ret int

SET NOCOUNT ON
    
create table #spcprivsrowset1
    (
    GRANTOR     sysname not null,
    GRANTEE     sysname not null,
    TABLE_CATALOG   sysname not null,
    TABLE_SCHEMA    sysname not null,
    TABLE_NAME  sysname not null,
    COLUMN_NAME sysname not null,
    COLUMN_GUID binary(16) null,
    COLUMN_PROPID   int null,
    PRIVILEGE_TYPE  sysname not null,
    IS_GRANTABLE    bit not null
    )

IF @table_name is not null
    BEGIN
    insert into #spcprivsrowset1
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
    END
ELSE
    BEGIN
    insert into #spcprivsrowset1
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
    END

exec @ret = sp_cursoropen @handle output, 'select * from #spcprivsrowset1',
    @scrollopt output, @ccopt output, @rows output

drop table #spcprivsrowset1

return isnull(@ret,0)
go
dump tran master with no_log
go
CREATE PROCEDURE sp_column_privileges_rowset;3
as
    select
        GRANTOR     = convert(sysname,' '),
        GRANTEE     = convert(sysname,' '),
        TABLE_CATALOG   = convert(sysname,' '),
        TABLE_SCHEMA    = convert(sysname,' '),
        TABLE_NAME  = convert(sysname,' '),
        COLUMN_NAME = convert(sysname,' '),
        COLUMN_GUID = convert(binary(16),null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(varchar(30),' '),
        IS_GRANTABLE    = convert(bit,1)
    where   1=0
go
dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_column_privileges_rowset
go


/*  Procedure for 8.0 server */
CREATE PROCEDURE sp_column_privileges_rowset
    (
    @table_name         sysname,
    @table_schema       sysname = null,
    @column_name        sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(uniqueidentifier,null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case p.action
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c, sysmembers m
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
        /* expand groups - AKUNDONE: only 1 level of group unrolling here. Need more?? */
    and     (u.uid > 0 and u.uid < 16384)
    and     ((p.uid = u.uid) or  (p.uid = m.groupuid and u.uid = m.memberuid))  
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(uniqueidentifier,null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case v.number
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
go
dump tran master with no_log
go
CREATE PROCEDURE sp_column_privileges_rowset;2
    (
    @table_schema       sysname = null,
    @column_name        sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(uniqueidentifier,null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case p.action
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, master.dbo.spt_values v, syscolumns c, sysmembers m
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     c.id = p.id
    and (@grantor is null or @grantor = user_name(p.grantor))
    and     case 
            when substring(p.columns, 1, 1) & 1 is null then 255    /* all columns have permission */
            when substring(p.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p.columns, v.low, 1))
            else (~convert(tinyint, coalesce(substring(p.columns, v.low, 1),0)))
            end & v.high <> 0           /* permission applies to this column */
    and     v.number <= (select count(*) from syscolumns where id = o.id)   /* ranges from 1 to # of columns in table */
    and     v.type = 'P'
    and     v.number = c.colid
    and (@grantee is null or @grantee = user_name(u.uid))
        /* expand groups - AKUNDONE: only 1 level of group unrolling here. Need more?? */
    and     (u.uid > 0 and u.uid < 16384)
    and     ((p.uid = u.uid) or  (p.uid = m.groupuid and u.uid = m.memberuid))  
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select *
            from sysprotects p1
            where
                p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid
            and     case 
                when substring(p1.columns, 1, 1) & 1 is null then 255   /* all columns have permission */
                when substring(p1.columns, 1, 1) & 1 = 0 then convert(tinyint, substring(p1.columns, v.low, 1))
                                else (~convert(tinyint,coalesce(substring(p.columns, v.low, 1),0)))
                end & v.high <> 0)          /* permission applies to this column */
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        COLUMN_NAME = c.name,
        COLUMN_GUID = convert(uniqueidentifier,null),
        COLUMN_PROPID   = convert(int,null),
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case v.number
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u, syscolumns c
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and c.id = o.id
    and     (@column_name is null or @column_name = c.name)
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'        /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,197)
    and     not exists (        /* exclude revoke'd privileges */
            select *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4, 5, 6, 9, 1, 2
go
dump tran master with no_log
go
create procedure sp_column_privileges_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @table_schema       sysname = null,
    @column_name        sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR,
        GRANTEE,
        TABLE_CATALOG,
        TABLE_SCHEMA,
        TABLE_NAME,
        COLUMN_NAME,
        COLUMN_GUID,
        COLUMN_PROPID,  
        PRIVILEGE_TYPE,
        IS_GRANTABLE    
        from master.dbo.SYSREMOTE_COLUMN_PRIVILEGES (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name,
                @column_name,
                @grantor,
                @grantee )
    order by 3, 4, 5, 6, 9, 1, 2
go

grant execute on sp_column_privileges_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_column_privileges_rowset' and type = 'P '))
        begin
        drop procedure sp_column_privileges_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_columns_rowset'
go

/*  Procedure for 6.0 and 6.50 server */
create procedure sp_columns_rowset
    (
    @table_name varchar(255),
    @table_schema   varchar(255) = null,
    @column_name    varchar(255) = null
    )
as  
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(binary(16),null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),

        COLUMN_DEFAULT      = convert (varchar (255),
                                  case when substring(m.text,1,1) = '('
                                  then substring(m.text,2,datalength(m.text)-2)
                                  else substring(m.text,1,datalength(m.text)-2)
                              end), 
        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when c.status&8 = 8
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128
                            then 0x8 /*DBCOLUMNFLAGS_WRITEUNKNOWN*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,c.status&8),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(binary(16),null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                                    then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then b_cha.name 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(varchar(1),null)  
    
    from
        syscolumns c,
        syscomments m,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        sysusers u,
        master.dbo.sysconfigures    cfg,
        master.dbo.syscharsets      a_cha, /* charset/1001, not sortorder. */
        master.dbo.syscharsets      b_cha  /* sortorder/2001, not charset. */
    where
        o.name = @table_name
    and     o.type in ('U','V','S')
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.type = d.ss_dtype
    and (t.usertype != 80 or d.type_name='timestamp')
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.usertype = t.usertype
    and c.cdefault *= m.id
    and m.colid = 1
    and cfg.comment = 'default sortorder ID' 
    and a_cha.type = 1001 /* type is charset */
    and b_cha.type = 2001 /* type is sortorder */
    and a_cha.id = b_cha.csid
    and     b_cha.id = cfg.value
    order by 2, 3, c.colid
go

dump tran master with no_log
go

create procedure sp_columns_rowset;2
    (
    @table_schema   varchar(255) = null,
    @column_name    varchar(255) = null
    )
as  
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(binary(16),null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),
        COLUMN_DEFAULT      = convert (varchar (255),
                                  case when substring(m.text,1,1) = '('
                                  then substring(m.text,2,datalength(m.text)-2)
                                  else substring(m.text,1,datalength(m.text)-2)
                              end), 
        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when c.status&8 = 8
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128
                            then 0x8 /*DBCOLUMNFLAGS_WRITEUNKNOWN*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,c.status&8),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(binary(16),null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then 'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then b_cha.name 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(varchar(1),null)  
    
    from
        syscolumns c,
        syscomments m,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        sysusers u,
        master.dbo.sysconfigures    cfg,
        master.dbo.syscharsets      a_cha, /* charset/1001, not sortorder. */
        master.dbo.syscharsets      b_cha /* sortorder/2001, not charset. */
    where
        o.type in ('U','V','S')
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.type = d.ss_dtype
    and (t.usertype != 80 or d.type_name='timestamp')
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.usertype = t.usertype
    and c.cdefault *= m.id
    and  m.colid = 1
    and cfg.comment = 'default sortorder ID' 
    and a_cha.type = 1001 /* type is charset */
    and b_cha.type = 2001 /* type is sortorder */
    and a_cha.id = b_cha.csid
    and     b_cha.id = cfg.value
    order by 2, 3, c.colid
    
go

dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_columns_rowset
go

/*  Procedure for 7.0 server */
create procedure sp_columns_rowset
    (
    @table_name sysname,
    @table_schema   sysname = NULL,
    @column_name    sysname = NULL
    )
as
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),
        COLUMN_DEFAULT      =  convert(nvarchar(2000),
                                        case when substring(m.text,1,1) = '('
                                            then substring(m.text,2,datalength(m.text)/2-2)
                                            else substring(m.text,1,datalength(m.text)/2-2)
                                        end ), 
        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when ColumnProperty(c.id,c.name,'AllowsNull') = 1
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128  and permissions(o.id,c.name)&2 = 2
                            then 0x4 /*DBCOLUMNFLAGS_WRITE*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(uniqueidentifier,null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.xprec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then b_cha.name 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(nvarchar(1),null) 

    from
        syscolumns c left join syscomments m on c.cdefault = m.id and m.colid = 1,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        master.dbo.sysconfigures    cfg,
        master.dbo.syscharsets      a_cha, /* charset/1001, not sortorder. */
        master.dbo.syscharsets      b_cha /* sortorder/2001, not charset. */
    where
        permissions(o.id, c.name) <> 0
    and o.name = @table_name
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.xtype = d.ss_dtype
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.xusertype = t.xusertype
    and cfg.comment = 'default sortorder id' 
    and a_cha.type = 1001 /* type is charset */
    and b_cha.type = 2001 /* type is sortorder */
    and a_cha.id = b_cha.csid
    and     b_cha.id = cfg.value
    order by 2, 3, c.colorder
go

dump tran master with no_log
go

/*  Procedure for 7.0 server */
create procedure sp_columns_rowset;2
    (
    @table_schema   sysname = NULL,
    @column_name    sysname = NULL
    )
as  
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),
        COLUMN_DEFAULT      =  convert(nvarchar(2000),
                                        case when substring(m.text,1,1) = '('
                                            then substring(m.text,2,datalength(m.text)/2-2)
                                            else substring(m.text,1,datalength(m.text)/2-2)
                                        end ), 
        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when ColumnProperty(c.id,c.name,'AllowsNull') = 1
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128 and permissions(o.id,c.name)&2 = 2
                            then 0x4 /*DBCOLUMNFLAGS_WRITE*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(uniqueidentifier,null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.xprec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then b_cha.name 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(nvarchar(1),null) 
    
    from
        syscolumns c left join syscomments m on c.cdefault = m.id and m.colid = 1,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        master.dbo.sysconfigures    cfg,
        master.dbo.syscharsets      a_cha, /* charset/1001, not sortorder.*/
        master.dbo.syscharsets      b_cha /* sortorder/2001, not charset.*/
    where
        permissions(o.id, c.name) <> 0
    and     o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.xtype = d.ss_dtype
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.xusertype = t.xusertype
    and cfg.comment = 'default sortorder id' 
    and     a_cha.type = 1001 /* type is charset */
    and     b_cha.type = 2001 /* type is sortorder */
    and a_cha.id = b_cha.csid
    and     b_cha.id = cfg.value
    order by 2, 3, c.colorder
go

dump tran master with no_log
go

/*  Procedure for 7.0 server */
create procedure sp_columns_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @table_schema       sysname = null,
    @column_name        sysname = null
    )
as
    select
        TABLE_CATALOG,
        TABLE_SCHEMA,
        TABLE_NAME,
        COLUMN_NAME,
        COLUMN_GUID,
        COLUMN_PROPID,
        ORDINAL_POSITION,
        COLUMN_HASDEFAULT,
        COLUMN_DEFAULT,
        COLUMN_FLAGS,
        IS_NULLABLE,
        DATA_TYPE,
        TYPE_GUID,
        CHARACTER_MAXIMUM_LENGTH,
        CHARACTER_OCTET_LENGTH,
        NUMERIC_PRECISION,
        NUMERIC_SCALE,
        DATETIME_PRECISION,
        CHARACTER_SET_CATALOG,
        CHARACTER_SET_SCHEMA,
        CHARACTER_SET_NAME,
        COLLATION_CATALOG,
        COLLATION_SCHEMA,
        COLLATION_NAME,
        DOMAIN_CATALOG,
        DOMAIN_SCHEMA,
        DOMAIN_NAME,
        DESCRIPTION
    from master.dbo.SYSREMOTE_COLUMNS (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name,
                @column_name )
    order by 1, 2, 3, 7
go


dump tran master with no_log
go

/*  Procedure for 8.00 server */
if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_columns_rowset
go

/*  Procedure for 8.00 server */
create procedure sp_columns_rowset
    (
    @table_name sysname,
    @table_schema   sysname = NULL,
    @column_name    sysname = NULL
    )
as  
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),

        /* Get rid of ( if it is first char otherwise display the whole thing */
        COLUMN_DEFAULT      = convert(nvarchar(2000),
                                        case when substring(m.text,1,1) = '('
                                            then substring(m.text,2,datalength(m.text)/2-2)
                                            else substring(m.text,1,datalength(m.text)/2-2)
                                        end ), 

        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when ColumnProperty(c.id,c.name,'AllowsNull') = 1
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128  and permissions(o.id,c.name)&2 = 2
                            then 0x4 /*DBCOLUMNFLAGS_WRITE*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(uniqueidentifier,null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.xprec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then c.collation 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(nvarchar(1),null),
        COLUMN_LCID     = convert(int, CollationPropertyFromID(c.collationid, 'lcid')),
        COLUMN_COMPFLAGS = convert(int, CollationPropertyFromID(c.collationid, 'oledbcompstyle')),
        COLUMN_SORTID = case /* hack to keep the old behavior: will be removed */
                            when ABS(c.collationid) > 0x1000000 
                            then convert(int, DATABASEPROPERTYEX(db_name(),'sqlsortorder'))
                            else null 
                        end,
        COLUMN_TDSCOLLATION = convert (binary(5),CollationPropertyFromID(c.collationid, 'TDSCollation')),
        IS_COMPUTED = convert(bit, c.iscomputed)    
    from
        syscolumns c left join syscomments m on c.cdefault = m.id and m.colid = 1,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        master.dbo.syscharsets      a_cha /* charset/1001, not sortorder. */
    where
        permissions(o.id, c.name) <> 0
    and o.name = @table_name
    and     (o.type in ('U','V','S') OR (o.type in ('TF', 'IF') and c.number = 0))
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.xtype = d.ss_dtype
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.xusertype = t.xusertype
    and a_cha.id = isnull(convert(tinyint, CollationPropertyFromID(c.collationid, 'sqlcharset')),
            convert(tinyint, ServerProperty('sqlcharset'))) -- make sure there's one and only one row selected for each column
    order by 2, 3, c.colorder
go


/*  Procedure for 8.0 server */
create procedure sp_columns_rowset;2
    (
    @table_schema   sysname = NULL,
    @column_name    sysname = NULL
    )
as  
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_HASDEFAULT   = convert(bit, case when m.text is null then 0 else 1 end),
        COLUMN_DEFAULT      = convert(nvarchar(2000),
                                        case when substring(m.text,1,1) = '('
                                            then substring(m.text,2,datalength(m.text)/2-2)
                                            else substring(m.text,1,datalength(m.text)/2-2)
                                        end ), 
        COLUMN_FLAGS        = convert(int,
                        case when d.is_long = 1 
                        then 0x82 /*DBCOLUMNFLAGS_ISLONG|DBCOLUMNFLAGS_MAYDEFER*/
                        else 0
                        end
                    |   case when d.fixlen is not null
                        then 0x10 /*DBCOLUMNFLAGS_ISFIXEDLENGTH*/
                        else 0
                        end
                    |   case when ColumnProperty(c.id,c.name,'AllowsNull') = 1
                        then 0x60 /*DBCOLUMNFLAGS_ISNULLABLE|DBCOLUMNFLAGS_MAYBENULL*/
                        else 0
                        end
                    |   case 
                        when d.type_name = 'timestamp'
                            then 0x200 /*DBCOLUMNFLAGS_ISROWVER*/
                        when (c.status&128) != 128 and permissions(o.id,c.name)&2 = 2
                            then 0x4 /*DBCOLUMNFLAGS_WRITE*/ 
                        else 0 
                        end),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        TYPE_GUID       = convert(uniqueidentifier,null),
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.xprec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DATETIME_PRECISION  = convert(int,
                        case when d.oledb_data_type <> 135 /*DBTYPE_DBTIMESTAMP*/ then null
                            when data_precision = 23 then 3 else 0 end),
        CHARACTER_SET_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        CHARACTER_SET_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        CHARACTER_SET_NAME  = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then a_cha.name 
                        else null 
                        end),
        COLLATION_CATALOG   = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'master' 
                        else null 
                        end),
        COLLATION_SCHEMA    = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then N'dbo' 
                        else null 
                        end),
        COLLATION_NAME      = convert(sysname,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/
                        then c.collation 
                        else null 
                        end),
        DOMAIN_CATALOG      = case when t.usertype < 256 then null else db_name() end,
        DOMAIN_SCHEMA       = case when t.usertype < 256 then null else user_name(o.uid) end,
        DOMAIN_NAME     = case when t.usertype < 256 then null else t.name end,
        DESCRIPTION     = convert(nvarchar(1),null),    
        COLUMN_LCID     = convert(int, CollationPropertyFromID(c.collationid, 'lcid')),
        COLUMN_COMPFLAGS = convert(int, CollationPropertyFromID(c.collationid, 'oledbcompstyle')),
        COLUMN_SORTID = case /* hack to keep the old behavior: will be removed */
                            when ABS(c.collationid) > 0x1000000 
                            then convert(int, DATABASEPROPERTYEX(db_name(),'sqlsortorder'))
                            else null 
                        end,
        
        COLUMN_TDSCOLLATION = convert (binary(5),CollationPropertyFromID(c.collationid, 'TDSCollation')),
        IS_COMPUTED = convert(bit, c.iscomputed)
    
    from
        syscolumns c left join syscomments m on c.cdefault = m.id and m.colid = 1,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t,
        master.dbo.syscharsets      a_cha /* charset/1001, not sortorder.*/
    where
        permissions(o.id, c.name) <> 0
    and     (o.type in ('U','V','S') OR (o.type in ('TF', 'IF') and c.number = 0))
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@column_name is null or @column_name = c.name)
    and     o.id = c.id
    and     t.xtype = d.ss_dtype
    and     c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     c.xusertype = t.xusertype
    and a_cha.type = 1001 /* type is charset */
    and a_cha.id = isnull(convert(tinyint, CollationPropertyFromID(c.collationid, 'sqlcharset')),
            convert(tinyint, ServerProperty('sqlcharset'))) -- make sure there's one and only one row selected for each column
    order by 2, 3, c.colorder
go

dump tran master with no_log
go

/*  Procedure for 8.0 server */
create procedure sp_columns_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @table_schema       sysname = null,
    @column_name        sysname = null
    )
as
    select
        TABLE_CATALOG,
        TABLE_SCHEMA,
        TABLE_NAME,
        COLUMN_NAME,
        COLUMN_GUID,
        COLUMN_PROPID,
        ORDINAL_POSITION,
        COLUMN_HASDEFAULT,
        COLUMN_DEFAULT,
        COLUMN_FLAGS,
        IS_NULLABLE,
        DATA_TYPE,
        TYPE_GUID,
        CHARACTER_MAXIMUM_LENGTH,
        CHARACTER_OCTET_LENGTH,
        NUMERIC_PRECISION,
        NUMERIC_SCALE,
        DATETIME_PRECISION,
        CHARACTER_SET_CATALOG,
        CHARACTER_SET_SCHEMA,
        CHARACTER_SET_NAME,
        COLLATION_CATALOG,
        COLLATION_SCHEMA,
        COLLATION_NAME,
        DOMAIN_CATALOG,
        DOMAIN_SCHEMA,
        DOMAIN_NAME,
        DESCRIPTION

    from master.dbo.SYSREMOTE_COLUMNS (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name,
                @column_name )
    order by 1, 2, 3, 7
go


grant execute on sp_columns_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_columns_rowset' and type = 'P '))
        begin
        drop procedure sp_columns_rowset
        dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_check_constraints_rowset'
go

/*  Procedure for 6.50 and earlier servers */
create procedure sp_check_constraints_rowset
    (
    @constraint_name    varchar(255),
    @constraint_schema  varchar(255) = null
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(varchar(1),null)
    from 
        sysobjects c_obj, syscomments m
    where
            c_obj.type = 'C '
        and c_obj.name  = @constraint_name
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and c_obj.id = m.id
    order by 1,2,3 
go
dump tran master with no_log
go

create procedure sp_check_constraints_rowset;2
    (
    @constraint_schema  varchar(255) = null
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(varchar(1),null)
    from 
        sysobjects c_obj, syscomments m
    where
            c_obj.type = 'C '
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and c_obj.id = m.id
    order by 1,2,3 
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_check_constraints_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 servers and 8.0 servers */
create procedure sp_check_constraints_rowset
    (
    @constraint_name    sysname,
    @constraint_schema  sysname = null
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(nvarchar(1), null)
    from 
        sysobjects c_obj, syscomments m
    where
            c_obj.type = 'C '
        and c_obj.name  = @constraint_name
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and m.id = c_obj.id
    order by 1,2,3 
go
dump tran master with no_log
go

create procedure sp_check_constraints_rowset;2
    (
    @constraint_schema  sysname = null
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(nvarchar(1), null)
    from 
        sysobjects c_obj, syscomments m
    where
            c_obj.type = 'C '
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and m.id = c_obj.id
    order by 1,2,3 
go

grant execute on sp_check_constraints_rowset to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_check_constraints_rowset' and type = 'P '))
        begin
        drop procedure sp_check_constraints_rowset
        dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_check_constbytable_rowset'
go

/*  Procedure for 6.50 and earlier servers */
create procedure sp_check_constbytable_rowset
    (
    @table_name         varchar(255), 
    @table_schema       varchar(255) = null,
    @constraint_name    varchar(255) = null,
    @constraint_schema  varchar(255) = null
    )
as
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(varchar(1),null)
    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c, syscomments m
    where
            t_obj.name  = @table_name
        and t_obj.type in ('U ','S ')
        and (@table_schema is null or @table_schema = user_name(t_obj.uid)) 
        and t_obj.id = c.id
        and c.constid = c_obj.id
        and c_obj.type = 'C '
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and c_obj.id = m.id
    order by 1,2,3,4,5,6 
go
dump tran master with no_log
go

create procedure sp_check_constbytable_rowset;2
    (
    @table_schema       varchar(255) = null,
    @constraint_name    varchar(255) = null,
    @constraint_schema  varchar(255) = null
    )
as
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(varchar(1),null)
    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c, syscomments m
    where
            t_obj.type in ('U ','S ')
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c.id = t_obj.id
        and c.constid = c_obj.id
        and c_obj.type  = 'C '
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and c_obj.id = m.id
    order by 1,2,3,4,5,6 
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_check_constbytable_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_check_constbytable_rowset
    (
    @table_name         sysname, 
    @table_schema       sysname = null,
    @constraint_name    sysname = null,
    @constraint_schema  sysname = null
    )
as
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(nvarchar(1), null)

    from 
        sysobjects c_obj, sysobjects t_obj, syscomments m
    where
            t_obj.name  = @table_name
        and t_obj.type in ('U ','S ')
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c_obj.parent_obj = t_obj.id
        and c_obj.type = 'C '
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and m.id = c_obj.id
order by 1,2,3,4,5,6 
go
dump tran master with no_log
go
create procedure sp_check_constbytable_rowset;2
    (
    @table_schema       sysname = null,
    @constraint_name    sysname = null,
    @constraint_schema  sysname = null
    )
as
    select
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        CHECK_CLAUSE        = m.text,   
        DESCRIPTION         = convert(nvarchar(1), null)
    from 
        sysobjects c_obj, sysobjects t_obj, syscomments m
    where
            t_obj.type in ('U ','S ')
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c_obj.parent_obj = t_obj.id
        and c_obj.type = 'C '
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and m.id = c_obj.id
    order by 1,2,3,4,5,6 
go
dump tran master with no_log
go

grant execute on sp_check_constbytable_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_check_constbytable_rowset' and type = 'P '))
        begin
        drop procedure sp_check_constbytable_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_foreign_keys_rowset'
go

/*  Procedure for 6.0 and 6.5 server */
CREATE PROCEDURE sp_foreign_keys_rowset
    (
    @pk_table_name      varchar(255) = null,
    @pk_table_schema    varchar(255) = null,
    @pk_table_catalog   varchar(255) = null,
    @fk_table_name      varchar(255) = null,
    @fk_table_schema    varchar(255) = null,
    @fk_table_catalog   varchar(255) = null
    )
as
    BEGIN
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(binary(16),null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(binary(16),null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,1),
        UPDATE_RULE         = 'NO ACTION',
        DELETE_RULE         = 'NO ACTION',
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey1
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey1
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,2),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 2
    and o1.id = c1.id
    and c1.colid = r.rkey2
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey2
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,3),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 3
    and o1.id = c1.id
    and c1.colid = r.rkey3
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey3
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,4),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 4
    and o1.id = c1.id
    and c1.colid = r.rkey4
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey4
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,5),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 5
    and o1.id = c1.id
    and c1.colid = r.rkey5
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey5
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,6),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 6
    and o1.id = c1.id
    and c1.colid = r.rkey6
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey6
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,7),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 7
    and o1.id = c1.id
    and c1.colid = r.rkey7
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey7
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,8),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 8
    and o1.id = c1.id
    and c1.colid = r.rkey8
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey8
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,9),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 9
    and o1.id = c1.id
    and c1.colid = r.rkey9
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey9
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,10),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 10
    and o1.id = c1.id
    and c1.colid = r.rkey10
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey10
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,11),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 11
    and o1.id = c1.id
    and c1.colid = r.rkey11
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey11
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,12),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 12
    and o1.id = c1.id
    and c1.colid = r.rkey12
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey12
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,13),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 13
    and o1.id = c1.id
    and c1.colid = r.rkey13
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey13
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,14),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 14
    and o1.id = c1.id
    and c1.colid = r.rkey14
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey14
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,15),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 15
    and o1.id = c1.id
    and c1.colid = r.rkey15
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey15
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,16),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and r.keycnt >= 16
    and c1.colid = r.rkey16
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey16
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    order by 8,9,2,3,13
    END
go
dump tran master with no_log
go
CREATE PROCEDURE sp_foreign_keys_rowset;2
    (
    @handle         int output,
    @scrollopt      int output,
    @ccopt          int output,
    @rows           int output,
    @pk_table_name      varchar(255) = null,
    @pk_table_schema    varchar(255) = null,
    @pk_table_catalog   varchar(255) = null,
    @fk_table_name      varchar(255) = null,
    @fk_table_schema    varchar(255) = null,
    @fk_table_catalog   varchar(255) = null
    )
as
    declare @ret int
    
    SET NOCOUNT ON

    create table #spfkeysrowset1
        (
        PK_TABLE_CATALOG    sysname not null,
        PK_TABLE_SCHEMA     sysname not null,
        PK_TABLE_NAME       sysname not null,
        PK_COLUMN_NAME      sysname not null,
        PK_COLUMN_GUID      binary(16) null,
        PK_COLUMN_PROPID    int null,
        FK_TABLE_CATALOG    sysname not null,
        FK_TABLE_SCHEMA     sysname not null,
        FK_TABLE_NAME       sysname not null,
        FK_COLUMN_NAME      sysname not null,
        FK_COLUMN_GUID      binary(16) null,
        FK_COLUMN_PROPID    int null,
        ORDINAL             int not null,
        UPDATE_RULE         sysname not null,
        DELETE_RULE         sysname not null,
        PK_NAME             sysname not null,
        FK_NAME             sysname not null,
        DEFERRABILITY       smallint not null       
        )
    BEGIN
    insert into #spfkeysrowset1
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,1),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey1
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey1
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,2),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 2
    and o1.id = c1.id
    and c1.colid = r.rkey2
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey2
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,3),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 3
    and o1.id = c1.id
    and c1.colid = r.rkey3
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey3
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,4),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 4
    and o1.id = c1.id
    and c1.colid = r.rkey4
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey4
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,5),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 5
    and o1.id = c1.id
    and c1.colid = r.rkey5
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey5
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,6),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 6
    and o1.id = c1.id
    and c1.colid = r.rkey6
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey6
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,7),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 7
    and o1.id = c1.id
    and c1.colid = r.rkey7
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey7
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,8),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 8
    and o1.id = c1.id
    and c1.colid = r.rkey8
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey8
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,9),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 9
    and o1.id = c1.id
    and c1.colid = r.rkey9
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey9
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,10),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 10
    and o1.id = c1.id
    and c1.colid = r.rkey10
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey10
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,11),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 11
    and o1.id = c1.id
    and c1.colid = r.rkey11
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey11
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,12),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 12
    and o1.id = c1.id
    and c1.colid = r.rkey12
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey12
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,13),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 13
    and o1.id = c1.id
    and c1.colid = r.rkey13
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey13
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,14),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 14
    and o1.id = c1.id
    and c1.colid = r.rkey14
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey14
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,15),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and r.keycnt >= 15
    and o1.id = c1.id
    and c1.colid = r.rkey15
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey15
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )   
    union all
    select
        db_name(r.rkeydbid),
        user_name(o1.uid),
        o1.name,
        c1.name,
        convert(binary(16),null),
        convert(int,null),
        db_name(r.fkeydbid),
        user_name(o2.uid),
        o2.name,
        c2.name,
        convert(binary(16),null),
        convert(int,null),
        convert(int,16),
        'NO ACTION',
        'NO ACTION',
        i.name,
        object_name(r.constid),
        convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i, sysusers u
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and r.keycnt >= 16
    and c1.colid = r.rkey16
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey16
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    and u.uid = user_id()
    and ( suser_id() = 1     /* User is the System Administrator */
    or (
        o1.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o1.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    and (
        o2.uid = user_id()   /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o2.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )
    )
    order by 8,9,2,3,13
    END

    exec @ret = sp_cursoropen @handle output, 'select * from #spfkeysrowset1',
        @scrollopt output, @ccopt output, @rows output

    drop table #spfkeysrowset1
    return isnull(@ret,0)
go
dump tran master with no_log
go
CREATE PROCEDURE sp_foreign_keys_rowset;3
as
    select
        PK_TABLE_CATALOG    = convert(sysname,' '),
        PK_TABLE_SCHEMA     = convert(sysname,' '),
        PK_TABLE_NAME       = convert(sysname,' '),
        PK_COLUMN_NAME      = convert(sysname,' '),
        PK_COLUMN_GUID      = convert(binary(16),null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = convert(sysname,' '),
        FK_TABLE_SCHEMA     = convert(sysname,' '),
        FK_TABLE_NAME       = convert(sysname,' '),
        FK_COLUMN_NAME      = convert(sysname,' '),
        FK_COLUMN_GUID      = convert(binary(16),null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,1),
        UPDATE_RULE         = 'NO ACTION',
        DELETE_RULE         = 'NO ACTION',
        PK_NAME             = convert(sysname, ' '),
        FK_NAME             = convert(sysname, ' '),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    where   1=0
go
dump tran master with no_log
go


if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_foreign_keys_rowset
go


/*  Procedure for 8.0 server */
CREATE PROCEDURE sp_foreign_keys_rowset
    (
    @pk_table_name      sysname,
    @pk_table_schema    sysname = null,
    @fk_table_name      sysname = null,
    @fk_table_schema    sysname = null,
    @fk_table_catalog   sysname = null
    )
as
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,1),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey1
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey1
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,2),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey2
    and r.keycnt >= 2
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey2
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,3),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey3
    and r.keycnt >= 3
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey3
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0 
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,4),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 4
    and o1.id = c1.id
    and c1.colid = r.rkey4
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey4
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid   
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,5),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 5
    and o1.id = c1.id
    and c1.colid = r.rkey5
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey5
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,6),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 6
    and o1.id = c1.id
    and c1.colid = r.rkey6
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey6
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,7),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 7
    and o1.id = c1.id
    and c1.colid = r.rkey7
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey7
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,8),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 8
    and o1.id = c1.id
    and c1.colid = r.rkey8
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey8
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,9),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 9
    and o1.id = c1.id
    and c1.colid = r.rkey9
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey9
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,10),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 10
    and o1.id = c1.id
    and c1.colid = r.rkey10
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey10
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,11),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 11
    and o1.id = c1.id
    and c1.colid = r.rkey11
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey11
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,12),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 12
    and o1.id = c1.id
    and c1.colid = r.rkey12
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey12
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,13),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 13
    and o1.id = c1.id
    and c1.colid = r.rkey13
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey13
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,14),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 14
    and o1.id = c1.id
    and c1.colid = r.rkey14
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey14
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,15),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 15
    and o1.id = c1.id
    and c1.colid = r.rkey15
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey15
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,16),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and o1.name = @pk_table_name
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 16
    and o1.id = c1.id
    and c1.colid = r.rkey16
    and r.fkeyid = o2.id
    and (@fk_table_name is null or @fk_table_name = o2.name)
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey16
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    order by 8,9,2,3,13
go
dump tran master with no_log
go
CREATE PROCEDURE sp_foreign_keys_rowset;2
    (
    @fk_table_name      sysname,
    @fk_table_schema    sysname = null,
    @pk_table_name      sysname = null,
    @pk_table_schema    sysname = null,
    @pk_table_catalog   sysname = null
    )
as
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,1),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and o2.id = c2.id
    and c2.colid = r.fkey1
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey1
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,2),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 2
    and o2.id = c2.id
    and c2.colid = r.fkey2
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey2
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,3),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 3
    and o2.id = c2.id
    and c2.colid = r.fkey3
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey3
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,4),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 4
    and o2.id = c2.id
    and c2.colid = r.fkey4
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey4
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,5),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 5
    and o2.id = c2.id
    and c2.colid = r.fkey5
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey5
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,6),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 6
    and o2.id = c2.id
    and c2.colid = r.fkey6
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id       
    and c1.colid = r.rkey6
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,7),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 7
    and o2.id = c2.id
    and c2.colid = r.fkey7
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey7
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,8),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 8
    and o2.id = c2.id
    and c2.colid = r.fkey8
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey8
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,9),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 9
    and o2.id = c2.id
    and c2.colid = r.fkey9
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey9
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,10),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 10
    and o2.id = c2.id
    and c2.colid = r.fkey10
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey10
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,11),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 11
    and o2.id = c2.id
    and c2.colid = r.fkey11
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey11
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,12),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 12
    and o2.id = c2.id
    and c2.colid = r.fkey12
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey12
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,13),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 13
    and o2.id = c2.id
    and c2.colid = r.fkey13
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey13
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,14),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 14
    and o2.id = c2.id
    and c2.colid = r.fkey14
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey14
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,15),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/      
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 15
    and o2.id = c2.id
    and c2.colid = r.fkey15
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey15
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid           
    union   all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,16),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/      
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and o2.name = @fk_table_name
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = r.fkeyid
    and r.keycnt >= 16
    and o2.id = c2.id
    and c2.colid = r.fkey16
    and r.rkeyid = o1.id
    and (@pk_table_name is null or @pk_table_name = o1.name)
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = c1.id   
    and c1.colid = r.rkey16
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    order by 8,9,2,3,13
go
dump tran master with no_log
go
CREATE PROCEDURE sp_foreign_keys_rowset;3
    (
    @pk_table_schema    sysname = null,
    @pk_table_catalog   sysname = null,
    @fk_table_schema    sysname = null,
    @fk_table_catalog   sysname = null
    )
as
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,1),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/      
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and c1.colid = r.rkey1
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey1
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,2),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 2
    and o1.id = c1.id
    and c1.colid = r.rkey2
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey2
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,3),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 3
    and o1.id = c1.id
    and c1.colid = r.rkey3
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey3
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,4),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 4
    and o1.id = c1.id
    and c1.colid = r.rkey4
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey4
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,5),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 5
    and o1.id = c1.id
    and c1.colid = r.rkey5
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey5
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,6),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 6
    and o1.id = c1.id
    and c1.colid = r.rkey6
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey6
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,7),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 7
    and o1.id = c1.id
    and c1.colid = r.rkey7
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey7
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,8),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 8
    and o1.id = c1.id
    and c1.colid = r.rkey8
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey8
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,9),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 9
    and o1.id = c1.id
    and c1.colid = r.rkey9
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey9
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,10),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 10
    and o1.id = c1.id
    and c1.colid = r.rkey10
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey10
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,11),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 11
    and o1.id = c1.id
    and c1.colid = r.rkey11
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey11
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,12),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 12
    and o1.id = c1.id
    and c1.colid = r.rkey12
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey12
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,13),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 13
    and o1.id = c1.id
    and c1.colid = r.rkey13
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey13
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,14),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 14
    and o1.id = c1.id
    and c1.colid = r.rkey14
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey14
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,15),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and r.keycnt >= 15
    and o1.id = c1.id
    and c1.colid = r.rkey15
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey15
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    union all
    select
        PK_TABLE_CATALOG    = db_name(r.rkeydbid),
        PK_TABLE_SCHEMA     = user_name(o1.uid),
        PK_TABLE_NAME       = o1.name,
        PK_COLUMN_NAME      = c1.name,
        PK_COLUMN_GUID      = convert(uniqueidentifier,null),
        PK_COLUMN_PROPID    = convert(int,null),
        FK_TABLE_CATALOG    = db_name(r.fkeydbid),
        FK_TABLE_SCHEMA     = user_name(o2.uid),
        FK_TABLE_NAME       = o2.name,
        FK_COLUMN_NAME      = c2.name,
        FK_COLUMN_GUID      = convert(uniqueidentifier,null),
        FK_COLUMN_PROPID    = convert(int,null),
        ORDINAL             = convert(int,16),
        UPDATE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsUpdateCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        DELETE_RULE = CASE WHEN (ObjectProperty(r.constid, 'CnstIsDeleteCascade')=1) THEN N'CASCADE' ELSE N'NO ACTION' END,
        PK_NAME             = i.name,
        FK_NAME             = object_name(r.constid),
        DEFERRABILITY       = convert(smallint, 3) /*DBPROPVAL_DF_NOT_DEFERRABLE*/
    from
        sysobjects o1, sysobjects o2,
        syscolumns c1, syscolumns c2,
        sysreferences r, sysindexes i
    where   
        (@pk_table_catalog is null or @pk_table_catalog = db_name())
    and     (@fk_table_catalog is null or @fk_table_catalog = db_name())
    and (@pk_table_schema is null or @pk_table_schema = user_name(o1.uid))
    and o1.id = r.rkeyid
    and o1.id = c1.id
    and r.keycnt >= 16
    and c1.colid = r.rkey16
    and r.fkeyid = o2.id
    and (@fk_table_schema is null or @fk_table_schema = user_name(o2.uid))
    and o2.id = c2.id   
    and c2.colid = r.fkey16
    and permissions(o1.id) <> 0
    and permissions(o2.id) <> 0
    and i.id = r.rkeyid
    and i.indid = r.rkeyindid       
    order by 8,9,2,3,13
go
dump tran master with no_log
go
create procedure sp_foreign_keys_rowset;5
    (
    @server_name        sysname,
    @pk_catalog_name    sysname = null,
    @fk_catalog_name    sysname = null,
    @pk_table_name      sysname = null,
    @pk_table_schema    sysname = null,
    @fk_table_name      sysname = null,
    @fk_table_schema    sysname = null
    )
as
    select
        PK_TABLE_CATALOG,
        PK_TABLE_SCHEMA,    
        PK_TABLE_NAME,  
        PK_COLUMN_NAME,     
        PK_COLUMN_GUID, 
        PK_COLUMN_PROPID,
        FK_TABLE_CATALOG,
        FK_TABLE_SCHEMA, 
        FK_TABLE_NAME,  
        FK_COLUMN_NAME,     
        FK_COLUMN_GUID, 
        FK_COLUMN_PROPID,
        ORDINAL,        
        UPDATE_RULE,    
        DELETE_RULE
        --PK_NAME,      
        --FK_NAME,
        --DEFERRABILITY 
    from master.dbo.SYSREMOTE_FOREIGN_KEYS (
                @server_name,
                @pk_catalog_name,
                @pk_table_schema,
                @pk_table_name,
                @fk_catalog_name,
                @fk_table_schema,
                @fk_table_name )
    order by 7,8,9,1,2,3,13
go

grant execute on sp_foreign_keys_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_foreign_keys_rowset' and type = 'P '))
        begin
        drop procedure sp_foreign_keys_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_indexes_rowset'
go

/*  6.0 and 6.5 version */
create procedure sp_indexes_rowset
    (
    @table_name varchar(255), 
    @index_name varchar(255) = null,
    @table_schema   varchar(255) = null  
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_NAME     = index_col(user_name(o.uid)+'.'+o.name, x.indid, c.colid),
        COLUMN_GUID     = convert(binary(16),null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint, 1 /* DB_COLLATION_ASC */),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(varchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16)
        
    from    sysobjects o, sysindexes x, syscolumns c, sysusers u
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and     x.id = o.id
    and     x.id = c.id
    and     c.colid < x.keycnt+(x.status&16)/16
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go
create procedure sp_indexes_rowset;2
    (
    @index_name varchar(255) = null,
    @table_schema   varchar(255) = null  
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int,
                       (
                        select count(*)
                        from syscolumns sc
                        where sc.id     =  c.id
                          AND sc.number =  c.number
                          AND sc.colid  <= c.colid
                        )),
        COLUMN_NAME     = index_col(user_name(o.uid)+'.'+o.name, x.indid, c.colid),
        COLUMN_GUID     = convert(binary(16),null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint, 1 /* DB_COLLATION_ASC */),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(varchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16) 
        
    from    sysobjects o, sysindexes x, syscolumns c, sysusers u
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and     x.id = o.id
    and     x.id = c.id
    and     c.colid < x.keycnt+(x.status&16)/16
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_indexes_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  7.0 version */
create procedure sp_indexes_rowset
    (
    @table_name sysname, 
    @index_name sysname = null,
    @table_schema   sysname = null   
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int, xk.keyno),
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint, 1 /* DB_COLLATION_ASC */),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(nvarchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16) 
        
    from    sysobjects o, sysindexes x, syscolumns c, sysindexkeys xk
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and x.id = o.id
    and o.id = c.id
    and o.id = xk.id
    and x.indid = xk.indid
    and c.colid = xk.colid
    and xk.keyno <= x.keycnt
    and permissions(o.id, c.name) <> 0
    and     (x.status&32) = 0  -- No hypothetical indexes
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go
create procedure sp_indexes_rowset;2
    (
    @index_name sysname = null,
    @table_schema   sysname = null   
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int, xk.keyno),
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint, 1 /* DB_COLLATION_ASC */),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(nvarchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16) 
        
    from    sysobjects o, sysindexes x, syscolumns c, sysindexkeys xk
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and x.id = o.id
    and o.id = c.id
    and o.id = xk.id
    and x.indid = xk.indid
    and c.colid = xk.colid
    and xk.keyno <= x.keycnt
    and permissions(o.id, c.name) <> 0
    and (x.status&32) = 0  -- No hypothetical indexes
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go
create procedure sp_indexes_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @index_name     sysname = null,
    @table_schema       sysname = null
    )
as
    select
        TABLE_CATALOG,  
        TABLE_SCHEMA,   
        TABLE_NAME, 
        INDEX_CATALOG,      
        INDEX_SCHEMA,   
        INDEX_NAME, 
        PRIMARY_KEY,    
        "UNIQUE",   
        "CLUSTERED",    
        "TYPE",     
        FILL_FACTOR,    
        INITIAL_SIZE,   
        NULLS,      
        SORT_BOOKMARKS, 
        AUTO_UPDATE,    
        NULL_COLLATION, 
        ORDINAL_POSITION,
        COLUMN_NAME,    
        COLUMN_GUID,    
        COLUMN_PROPID,  
        COLLATION,  
        CARDINALITY,    
        PAGES,      
        FILTER_CONDITION
    --  INTEGRATED
    from master.dbo.SYSREMOTE_INDEXES (
                @table_server,
                @table_catalog,
                @table_schema,
                @index_name,
                NULL,           /* TYPE (index type) */
                @table_name )
    order by 8 desc, 4, 5, 6, 17
go

grant execute on sp_indexes_rowset to public
go

dump tran master with no_log
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_indexes_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  8.0 version */
create procedure sp_indexes_rowset
    (
    @table_name sysname, 
    @index_name sysname = null,
    @table_schema   sysname = null   
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int, xk.keyno),
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint,
                        case when indexkey_property(o.id, x.indid, xk.keyno, 'IsDescending') =1
                        then 2      /* DB_COLLATION_DESC */ 
                        else 1      /* DB_COLLATION_ASC */ 
                        end),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(nvarchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16) 
        
    from    sysobjects o, sysindexes x, syscolumns c, sysindexkeys xk
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and x.id = o.id
    and o.id = c.id
    and o.id = xk.id
    and x.indid = xk.indid
    and c.colid = xk.colid
    and xk.keyno <= x.keycnt
    and permissions(o.id, c.name) <> 0
    and     (x.status&32) = 0  -- No hypothetical indexes
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go
create procedure sp_indexes_rowset;2
    (
    @index_name sysname = null,
    @table_schema   sysname = null   
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        INDEX_CATALOG       = db_name(),        
        INDEX_SCHEMA        = user_name(o.uid),
        INDEX_NAME      = x.name,
        PRIMARY_KEY     = convert(bit,(x.status & 0x800)/0x800),
        "UNIQUE"        = convert(bit,(x.status & 2)/2),
        "CLUSTERED"     = convert(bit,(x.status & 16)/16),
        "TYPE"          = convert(smallint, 1 /*DBPROPVAL_IT_BTREE*/),
        FILL_FACTOR     = convert(int, x.OrigFillFactor),
        INITIAL_SIZE        = convert(int,null),
        NULLS           = convert(int,null),
        SORT_BOOKMARKS      = convert(bit,0),
        AUTO_UPDATE     = convert(bit,1),
        NULL_COLLATION      = convert(int,4 /*DBPROPVAL_NC_LOW*/),
        ORDINAL_POSITION    = convert(int, xk.keyno),
        COLUMN_NAME     = c.name,
        COLUMN_GUID     = convert(uniqueidentifier,null),
        COLUMN_PROPID       = convert(int,null),
        COLLATION   = convert(smallint,
                        case when indexkey_property(o.id, x.indid, xk.keyno, 'IsDescending') =1
                        then 2      /* DB_COLLATION_DESC */ 
                        else 1      /* DB_COLLATION_ASC */ 
                        end),
        CARDINALITY     = case when (x.status & 2) = 2 then x.rows else null end,
        PAGES           = convert(int, x.dpages),
        FILTER_CONDITION    = convert(nvarchar(1),null),
        INTEGRATED      = convert(bit,(x.status & 16)/16) 
        
    from    sysobjects o, sysindexes x, syscolumns c, sysindexkeys xk
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and (@index_name is null or @index_name = x.name)
    and x.id = o.id
    and o.id = c.id
    and o.id = xk.id
    and x.indid = xk.indid
    and c.colid = xk.colid
    and xk.keyno <= x.keycnt
    and permissions(o.id, c.name) <> 0
    and (x.status&32) = 0  -- No hypothetical indexes
    order by 8 desc, 4, 5, 6, 17
go
dump tran master with no_log
go
create procedure sp_indexes_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @index_name     sysname = null,
    @table_schema       sysname = null
    )
as
    select
        TABLE_CATALOG,  
        TABLE_SCHEMA,   
        TABLE_NAME, 
        INDEX_CATALOG,      
        INDEX_SCHEMA,   
        INDEX_NAME, 
        PRIMARY_KEY,    
        "UNIQUE",   
        "CLUSTERED",    
        "TYPE",     
        FILL_FACTOR,    
        INITIAL_SIZE,   
        NULLS,      
        SORT_BOOKMARKS, 
        AUTO_UPDATE,    
        NULL_COLLATION, 
        ORDINAL_POSITION,
        COLUMN_NAME,    
        COLUMN_GUID,    
        COLUMN_PROPID,  
        COLLATION,  
        CARDINALITY,    
        PAGES,      
        FILTER_CONDITION
    --  INTEGRATED
    from master.dbo.SYSREMOTE_INDEXES (
                @table_server,
                @table_catalog,
                @table_schema,
                @index_name,
                NULL,           /* TYPE (index type) */
                @table_name )
    order by 8 desc, 4, 5, 6, 17
go

grant execute on sp_indexes_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_indexes_rowset' and type = 'P '))
        begin
        drop procedure sp_indexes_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_primary_keys_rowset'
go

/*  Procedure for 6.0 and 6.5 servers */
create procedure sp_primary_keys_rowset
    (
    @table_name     varchar(255),
    @table_schema       varchar(244) = null
    )
as
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(binary(16),null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o, sysusers u
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_primary_keys_rowset;2
    (
    @table_schema       varchar(244) = null
    )
as
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(binary(16),null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o, sysusers u
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    order by 2, 3
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_primary_keys_rowset
go

/*  Procedure for 7.0 & 8.0 servers */
create procedure sp_primary_keys_rowset
    (
    @table_name     sysname,
    @table_schema   sysname = null
    )
as
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(uniqueidentifier,null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800 -- PRIMARY KEY
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and permissions(o.id) <> 0
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_primary_keys_rowset;2
    (
    @table_schema   sysname = null
    )
as
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(uniqueidentifier,null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800 -- PRIMARY KEY
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and permissions(o.id) <> 0
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_primary_keys_rowset;3
    (
    @table_name     sysname = null,
    @table_schema       sysname = null
    )
as
IF @table_name is not NULL
    BEGIN
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(uniqueidentifier,null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800 -- PRIMARY KEY
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and permissions(o.id) <> 0
    END
ELSE
    BEGIN
    select  TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(o.uid),
            TABLE_NAME      = o.name,   
            COLUMN_NAME     = c.name,
            COLUMN_GUID     = convert(uniqueidentifier,null),
            COLUMN_PROPID   = convert(int,null),
            ORDINAL         = convert(int,
                                      case
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  1) then 1
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  2) then 2
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  3) then 3
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  4) then 4
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  5) then 5
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  6) then 6
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  7) then 7
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  8) then 8
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid,  9) then 9
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 10) then 10
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 11) then 11
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 12) then 12
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 13) then 13
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 14) then 14
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 15) then 15
                                      when c.name = index_col(user_name(o.uid)+'.'+o.name, i.indid, 16) then 16
                                      end
                                     ),
            PK_NAME         = i.name
    from    sysindexes i, syscolumns c, sysobjects o
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     o.id = c.id
    and     o.id = i.id
    and     (i.status & 0x800) = 0x800 -- PRIMARY KEY
    and (c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  1) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  2) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  3) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  4) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  5) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  6) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  7) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  8) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid,  9) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 10) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 11) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 12) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 13) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 14) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 15) or
         c.name = index_col (user_name(o.uid)+'.'+o.name, i.indid, 16)
        )
    and permissions(o.id) <> 0
    END
go
dump tran master with no_log
go
create procedure sp_primary_keys_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name         sysname = null,
    @table_schema       sysname = null
    )
as
    select
        TABLE_CATALOG,  
        TABLE_SCHEMA,   
        TABLE_NAME, 
        COLUMN_NAME,    
        COLUMN_GUID,    
        COLUMN_PROPID,  
        ORDINAL
        --PK_NAME       
    from master.dbo.SYSREMOTE_PRIMARY_KEYS (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name )
    order by 1,2,3
go

grant execute on sp_primary_keys_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_primary_keys_rowset' and type = 'P '))
        begin
        drop procedure sp_primary_keys_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_provider_types_rowset'
go

/*  Procedure for 6.0 and 6.50 servers */
create proc sp_provider_types_rowset
    (
    @data_type  smallint = null,
    @best_match tinyint  = null
    )
as
    select
        TYPE_NAME       = case when t.usertype = 80 then t.name 
                        else d.type_name 
                        end,
        DATA_TYPE       = d.oledb_data_type,                            
        COLUMN_SIZE     = case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ 
                            then @@max_precision
                            else coalesce(d.column_size,d.data_precision,t.prec) end,
        LITERAL_PREFIX      = d.literal_prefix,
        LITERAL_SUFFIX      = d.literal_suffix,
        CREATE_PARAMS       = convert(varchar(32),e.CREATE_PARAMS),
        IS_NULLABLE     = t.allownulls,
        CASE_SENSITIVE      = d.case_sensitive,
        SEARCHABLE      = d.searchable,
        UNSIGNED_ATTRIBUTE  = d.unsigned_attribute,
        FIXED_PREC_SCALE    = d.fixed_prec_scale,
        AUTO_UNIQUE_VALUE   = d.auto_unique_value, 
        LOCAL_TYPE_NAME     = case  when t.usertype = 80 then t.name 
                        else d.local_type_name
                        end,
        MINIMUM_SCALE       = convert(smallint,
                        case 
                        when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then 0 
                        else null 
                        end),
        MAXIMUM_SCALE       = convert(smallint,
                        case 
                        when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ 
                        then @@max_precision
                        else null 
                        end),
        GUID            = convert(binary(16),null),
        TYPELIB         = convert(varchar(1),null),
        VERSION         = convert(varchar(1),null),
        IS_LONG         = d.is_long,
        BEST_MATCH      = case when t.usertype = 80
                        then convert(bit,0)
                        else d.best_match
                        end,
        IS_FIXEDLENGTH      = convert(bit, 
                        case when d.fixlen is null then 0 else 1 end)
    from    master.dbo.spt_provider_types d, master.dbo.spt_datatype_info_ext e, systypes t
    where   d.ss_dtype = t.type 
    and t.usertype <= 100
    and t.usertype <> 18 /* sysname */
    and (case when t.usertype = 80 /* TIMESTAMP */ then 1 else 0 end 
            = case when d.type_name = 'timestamp' then 1 else 0 end)
    and     t.usertype *= e.user_type 
    and     e.AUTO_INCREMENT = 0
    and     t.type not in (111,109,38,110,55,63)    /* get rid of nullable types */
    and (@data_type is null or d.oledb_data_type = @data_type)
    and (@best_match is null or d.best_match = @best_match)
    order by 2
go
dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_provider_types_rowset
go

/*  Procedure for 8.0 server */
create proc sp_provider_types_rowset
    (
    @data_type  smallint = null,
    @best_match tinyint  = null
    )
as
    select
        TYPE_NAME       = case  when t.usertype = 80 then t.name 
                        else d.type_name 
                        end,
        DATA_TYPE       = d.oledb_data_type,                            


        COLUMN_SIZE     = case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ 
                            then @@max_precision
                            else coalesce(d.column_size,d.data_precision,t.prec) end,
        LITERAL_PREFIX      = d.literal_prefix,
        LITERAL_SUFFIX      = d.literal_suffix,
        CREATE_PARAMS       = convert(nvarchar(32),e.CREATE_PARAMS),
        IS_NULLABLE     = t.allownulls,
        CASE_SENSITIVE      = d.case_sensitive,
        SEARCHABLE      = d.searchable,
        UNSIGNED_ATTRIBUTE  = d.unsigned_attribute,
        FIXED_PREC_SCALE    = d.fixed_prec_scale,
        AUTO_UNIQUE_VALUE   = d.auto_unique_value, 
        LOCAL_TYPE_NAME     = case  when t.usertype = 80 then t.name 
                        else d.local_type_name
                        end,
        MINIMUM_SCALE       = convert(smallint,
                        case 
                        when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then 0 
                        else null 
                        end),
        MAXIMUM_SCALE       = convert(smallint,
                        case 
                        when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ 
                        then @@max_precision
                        else null 
                        end),
        GUID            = convert(uniqueidentifier,null),
        TYPELIB         = convert(nvarchar(1),null),
        VERSION         = convert(nvarchar(1),null),
        IS_LONG         = d.is_long,
        BEST_MATCH      = case  when t.usertype = 80
                        then convert(bit,0)
                        else d.best_match
                        end,
        IS_FIXEDLENGTH      = convert(bit, 
                        case when d.fixlen is null then 0 else 1 end)

    from master.dbo.spt_provider_types d
        INNER JOIN master.dbo.systypes t on d.ss_dtype = t.xtype
        LEFT OUTER JOIN master.dbo.spt_datatype_info_ext e on
            t.xusertype = e.user_type
            and e.AUTO_INCREMENT = 0
    where   (@data_type is null or d.oledb_data_type = @data_type)
    and (@best_match is null or d.best_match = @best_match) 
    and t.usertype <= 255
    and t.usertype <> 18 /* sysname */
    order by 2
go

grant execute on sp_provider_types_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_provider_types_rowset' and type = 'P '))
        begin
        drop procedure sp_provider_types_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_procedure_params_rowset'
go

/*  Procedure for 6.0 and 6.50 servers */
create procedure sp_procedure_params_rowset
    (
    @procedure_name     varchar(255) = null,
    @group_number       int = null,
    @procedure_schema   varchar(255) = null,
    @parameter_name     varchar(255) = null
    )
as
IF @procedure_name is not null
    BEGIN
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+((c.status/64)&1)),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,
                        case when d.oledb_data_type = 11 /*DBTYPE_BOOL*/ 
                        then 0 else 1
                        end),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec 
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        syscolumns c,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.name = @procedure_name
    and o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.number = @group_number
    and c.type = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.usertype = t.usertype
    and (t.usertype != 80 or d.type_name='timestamp')
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = convert(sysname,'int'),
        LOCAL_TYPE_NAME     = convert(sysname,'int')
    from
        syscomments c,
        sysobjects o
    where
        o.name = @procedure_name
    and o.type = 'P'                        /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    and c.id = o.id
    and c.number = @group_number
    and c.colid = 1
    order by 2, 3, 5
    END
ELSE
    BEGIN
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+((c.status/64)&1)),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,
                        case when d.oledb_data_type = 11 /*DBTYPE_BOOL*/ 
                        then 0 else 1
                        end),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        syscolumns c,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.type = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.usertype = t.usertype
    and (t.usertype != 80 or d.type_name='timestamp')
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = convert(sysname,'int'),
        LOCAL_TYPE_NAME     = convert(sysname,'int')
    from
        syscomments c,
        sysobjects o
    where
        o.type = 'P'                        /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    and c.id = o.id
    and     c.colid = 1
    order by 2, 3, 5
    END
go
dump tran master with no_log
go
create procedure sp_procedure_params_rowset;2
    (
    @handle         int output,
    @scrollopt      int output,
    @ccopt          int output,
    @rows           int output,
    @procedure_name     varchar(255) = null,
    @group_number       int = null,
    @procedure_schema   varchar(255) = null,
    @parameter_name     varchar(255) = null
    )
as
    declare @ret int


SET NOCOUNT ON

    create table #spprocparamrowset1
        (
        PROCEDURE_CATALOG   sysname not null,
        PROCEDURE_SCHEMA    sysname not null,
        PROCEDURE_NAME      varchar(35) not null,
        PARAMETER_NAME      sysname not null,
        ORDINAL_POSITION    smallint not null,
        PARAMETER_TYPE      smallint null,
        PARAMETER_HASDEFAULT    tinyint null,
        PARAMETER_DEFAULT   varchar(255) null,
        IS_NULLABLE     bit not null,
        DATA_TYPE       smallint null,
        CHARACTER_MAXIMUM_LENGTH int null,
        CHARACTER_OCTET_LENGTH  int null,
        NUMERIC_PRECISION   smallint null,
        NUMERIC_SCALE       smallint null,
        DESCRIPTION     varchar(1) null,
        TYPE_NAME       sysname null,
        LOCAL_TYPE_NAME     sysname null,
        )

IF @procedure_name is not null
    BEGIN
    insert into #spprocparamrowset1
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+((c.status/64)&1)),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,
                        case when d.oledb_data_type = 11 /*DBTYPE_BOOL*/ 
                        then 0 else 1
                        end),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        syscolumns c,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.name = @procedure_name
    and o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.number = @group_number
    and c.type = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.usertype = t.usertype
    and (t.usertype != 80 or d.type_name='timestamp')
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = convert(sysname,'int'),
        LOCAL_TYPE_NAME     = convert(sysname,'int')
    from
        syscomments c,
        sysobjects o
    where
        o.name = @procedure_name
    and o.type = 'P'                        /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    and c.id = o.id
    and c.number = @group_number
    and c.colid = 1
    order by 2, 3, 5
    END
ELSE
    BEGIN
    insert into #spprocparamrowset1
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+((c.status/64)&1)),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,
                        case when d.oledb_data_type = 11 /*DBTYPE_BOOL*/ 
                        then 0 else 1
                        end),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        syscolumns c,
        sysobjects o,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.type = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.usertype = t.usertype
    and (t.usertype != 80 or d.type_name='timestamp')
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint,0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = convert(sysname,'int'),
        LOCAL_TYPE_NAME     = convert(sysname,'int')
    from
        syscomments c,
        sysobjects o
    where
        o.type = 'P'                        /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    and c.id = o.id
    and     c.colid = 1
    order by 2, 3, 5
    END

    exec @ret = sp_cursoropen @handle output, 'select * from #spprocparamrowset1',
        @scrollopt output, @ccopt output, @rows output

    drop table #spprocparamrowset1
    return isnull(@ret,0)
go
dump tran master with no_log
go
create procedure sp_procedure_params_rowset;3
as
    select
        PROCEDURE_CATALOG   = convert(sysname, ' '),
        PROCEDURE_SCHEMA    = convert(sysname, ' '),
        PROCEDURE_NAME      = convert(varchar(35), ' '),
        PARAMETER_NAME      = convert(sysname, ' '),
        ORDINAL_POSITION    = convert(smallint, 0),
        PARAMETER_TYPE      = convert(smallint, 0),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(varchar(255),null),
        IS_NULLABLE     = convert(bit, 0),
        DATA_TYPE       = convert(smallint, 0),
        CHARACTER_MAXIMUM_LENGTH= convert(int, 0),
        CHARACTER_OCTET_LENGTH  = convert(int, 0),
        NUMERIC_PRECISION   = convert(smallint, 0),
        NUMERIC_SCALE       = convert(smallint, 0),
        DESCRIPTION     = convert(varchar(1),null),
        TYPE_NAME       = convert(sysname,null),
        LOCAL_TYPE_NAME     = convert(sysname,null)
    where   1=0
go
dump tran master with no_log
go


if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_procedure_params_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 servers */
create procedure sp_procedure_params_rowset
    (
    @procedure_name     sysname,
    @group_number       int = 1,
    @procedure_schema   sysname = null,
    @parameter_name     sysname = null
    )
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+c.isoutparam),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.name = @procedure_name
    and o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.number = @group_number
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = convert(sysname,N'int'),
        LOCAL_TYPE_NAME     = convert(sysname,N'int')
    from
        sysobjects o,
        syscomments c
    where
        o.name = @procedure_name
    and o.id = c.id 
    and c.number = @group_number
    and c.colid = 1
    and o.type = 'P'                        /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    order by 2, 3, 5
go
dump tran master with no_log
go
create procedure sp_procedure_params_rowset;2
    (
    @procedure_schema   sysname = null,
    @parameter_name     sysname = null
    )
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+c.isoutparam),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.type = 'P'                            /* Just Procedures */
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = convert(sysname,N'int'),
        LOCAL_TYPE_NAME     = convert(sysname,N'int')
    from
        sysobjects o,
        syscomments c
    where
        o.type = 'P'        /* Just Procedures */
    and o.id = c.id 
    and c.colid = 1
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    order by 2, 3, 5
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_procedure_params_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 servers */
create procedure sp_procedure_params_rowset
    (
    @procedure_name     sysname,
    @group_number       int = 1,
    @procedure_schema   sysname = null,
    @parameter_name     sysname = null
    )
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+c.isoutparam),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.name = @procedure_name
    and     (o.type in ('P', 'TF', 'IF') OR (len(c.name) > 0 and o.type = 'FN'))
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and ((c.number = @group_number and o.type = 'P') 
            or (c.number = 0 and o.type = 'FN')
            or (c.number = 1 and o.type in ('TF', 'IF')))
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = convert(sysname,N'int'),
        LOCAL_TYPE_NAME     = convert(sysname,N'int')
    from
        sysobjects o,
        syscomments c
    where
        o.name = @procedure_name
    and o.id = c.id 
    and c.number = @group_number
    and c.colid = 1
    and o.type = 'P'            /* Just Procedures */
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    UNION ALL
    SELECT         /* UDF return value row*/
        PROCEDURE_CATALOG        = db_name(),
        PROCEDURE_SCHEMA         = user_name(o.uid),
        PROCEDURE_NAME           = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME           = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION         = convert(smallint, 0),
        PARAMETER_TYPE           = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT     = convert(tinyint, 0),
        PARAMETER_DEFAULT        = convert(nvarchar(255),null),
        IS_NULLABLE              = convert(bit, c.isnullable),
        DATA_TYPE                = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH = convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH   = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION        = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE            = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION              = convert(nvarchar(1),null),
        TYPE_NAME                = d.type_name,
        LOCAL_TYPE_NAME          = d.local_type_name
    FROM
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    WHERE
        o.name = @procedure_name
    and o.id = c.id 
    and c.number = 0
    and c.colid = 0
    and o.type = 'FN'           /* UDF scalar functions */
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    UNION ALL
    SELECT         /* UDF table value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@TABLE_RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint, 0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 0),             /*DBTYPE_EMPTY*/
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129        /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128  /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130        /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129   /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128  /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130        /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(50), N'Result table returned by table valued function'),
        TYPE_NAME       = N'table',
        LOCAL_TYPE_NAME     = N'table'
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d
    where
        o.name = @procedure_name
    and o.id = c.id 
    and c.number = 0
    and c.colid = 1
    and o.type in ('TF', 'IF')          /* UDF table functions */
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@TABLE_RETURN_VALUE')
    order by 2, 3, 5
go
dump tran master with no_log
go
create procedure sp_procedure_params_rowset;2
    (
    @procedure_schema   sysname = null,
    @parameter_name     sysname = null
    )
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = c.name,
        ORDINAL_POSITION    = convert(smallint, c.colid),
        PARAMETER_TYPE      = convert(smallint, 1+c.isoutparam),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,ColumnProperty(c.id,c.name,'AllowsNull')),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    where
        (o.type in ('P', 'TF', 'IF') OR (len(c.name) > 0 and o.type = 'FN'))
    and (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and o.id = c.id
    and (o.type = 'P' or (c.number = 0 and o.type = 'FN') or (c.number = 1 and o.type in ('TF', 'IF')))
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and (@parameter_name is null or @parameter_name = c.name)
    UNION ALL
    SELECT         /* return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint,0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 3 /*DBTYPE_I4*/),
        CHARACTER_MAXIMUM_LENGTH= convert(int,null),
        CHARACTER_OCTET_LENGTH  = convert(int,null),
        NUMERIC_PRECISION   = convert(smallint,10),
        NUMERIC_SCALE       = convert(smallint,null),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = convert(sysname,N'int'),
        LOCAL_TYPE_NAME     = convert(sysname,N'int')
    from
        sysobjects o,
        syscomments c
    where
        o.type = 'P'            /* Just Procedures */
    and o.id = c.id 
    and c.colid = 1
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    UNION ALL
    SELECT         /* UDF return value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint, 0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit, c.isnullable),
        DATA_TYPE       = d.oledb_data_type,
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = d.type_name,
        LOCAL_TYPE_NAME     = d.local_type_name
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d,
        systypes t
    where
        o.id = c.id 
    and c.number = 0
    and c.colid = 0
    and o.type = 'FN'           /* UDF scalar functions */
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and c.xusertype = t.xusertype
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@RETURN_VALUE')
    UNION ALL
    SELECT         /* UDF table value row*/
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(c.number,5))),
        PARAMETER_NAME      = convert(sysname,'@TABLE_RETURN_VALUE'),
        ORDINAL_POSITION    = convert(smallint, 0),
        PARAMETER_TYPE      = convert(smallint, 4 /*DBPARAMTYPE_RETURNVALUE*/),
        PARAMETER_HASDEFAULT    = convert(tinyint, 0),
        PARAMETER_DEFAULT   = convert(nvarchar(255),null),
        IS_NULLABLE     = convert(bit,0),
        DATA_TYPE       = convert(smallint, 0),         /*DBTYPE_EMPTY*/
        CHARACTER_MAXIMUM_LENGTH= convert(int,
                        case 
                        when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size,c.length/2)
                        else null 
                        end),
        CHARACTER_OCTET_LENGTH  = convert(int,
                        case when d.oledb_data_type = 129 /*DBTYPE_STR*/ 
                            or d.oledb_data_type = 128 /*DBTYPE_BYTES*/
                        then coalesce(d.column_size,c.length)
                        when d.oledb_data_type = 130 /*DBTYPE_WSTR*/
                        then coalesce(d.column_size*2,c.length)
                        else null 
                        end),
        NUMERIC_PRECISION   = convert(smallint,
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.prec
                            when (d.fixed_prec_scale =1  or d.oledb_data_type =5 or d.oledb_data_type =4)
                            then d.data_precision else null end),
        NUMERIC_SCALE       = convert(smallint, 
                        case when d.oledb_data_type = 131 /*DBTYPE_NUMERIC*/ then c.scale else null end),
        DESCRIPTION     = convert(nvarchar(1),null),
        TYPE_NAME       = N'table',
        LOCAL_TYPE_NAME     = N'table'
    
    from
        sysobjects o,
        syscolumns c,
        master.dbo.spt_provider_types d
    where
        o.id = c.id 
    and c.number = 0
    and c.colid = 1
    and o.type in ('TF', 'IF')          /* UDF table functions */
    and c.xtype = d.ss_dtype
    and c.length = case when d.fixlen > 0 then d.fixlen else c.length end
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and (@parameter_name is null or @parameter_name = '@TABLE_RETURN_VALUE')
    order by 2, 3, 5
go

grant execute on sp_procedure_params_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_procedure_params_rowset' and type = 'P '))
        begin
        drop procedure sp_procedure_params_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_procedures_rowset'
go


/* pre 7.0 version */
create procedure sp_procedures_rowset
    (
    @procedure_name     varchar(255), 
    @group_number       int = 1,
    @procedure_schema   varchar(255) = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(varchar(1),null),
        DESCRIPTION     = convert(varchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    
        sysobjects o, 
        syscomments p,
        sysusers u
    where
            o.name = @procedure_name
        and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type = 'P'        /* Object type of Procedure */
    and     p.colid = 1
    and     p.id = o.id
    and p.number = @group_number
    and     u.uid = user_id()   /* constrain sysusers uid for use in subquery */
    and     (   suser_id() = 1  /* User is the System Administrator */
        or  o.uid = user_id()   /* User created the object */
            /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or  ((select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
             from sysprotects p
             where p.id = o.id
                 /*  get rows for public,current user,user's group */
                 and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
                 /* check for SELECT,EXECUTE privilege */
             and (action in (193,224)))&1    /* more magic...normalize GRANT */
            ) = 1    /* final magic...compare Grants    */
        )
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_procedures_rowset;2
    (
    @procedure_schema   varchar(255) = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(varchar(35),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(varchar(1),null),
        DESCRIPTION     = convert(varchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    
        sysobjects o, 
        syscomments p,
        sysusers u
    where
            (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type = 'P'        /* Object type of Procedure */
    and     p.colid = 1
    and     p.id = o.id
    and     u.uid = user_id()   /* constrain sysusers uid for use in subquery */
    and     (   suser_id() = 1  /* User is the System Administrator */
        or  o.uid = user_id()   /* User created the object */
            /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or  ((select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
             from sysprotects p
             where p.id = o.id
                 /*  get rows for public,current user,user's group */
                 and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
                 /* check for SELECT,EXECUTE privilege */
             and (action in (193,224)))&1    /* more magic...normalize GRANT */
            ) = 1    /* final magic...compare Grants    */
        )
    order by 2, 3
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_procedures_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/* 7.0 version */
create procedure sp_procedures_rowset
    (
    @procedure_name     sysname, 
    @group_number       int = 1,
    @procedure_schema   sysname = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(nvarchar(1),null),
        DESCRIPTION     = convert(nvarchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    
        sysobjects o, 
        syscomments p
    where
        permissions(o.id) <> 0
    and o.name = @procedure_name
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type = 'P'        /* Object type of Procedure */
    and     p.colid = 1
    and     p.id = o.id
    and p.number = @group_number
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_procedures_rowset;2
    (
    @procedure_schema   sysname = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(nvarchar(1),null),
        DESCRIPTION     = convert(nvarchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    sysobjects o, syscomments p
    where
        permissions(o.id) <> 0
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type = 'P'        /* Object type of Procedure */
    and p.colid = 1
    and p.id = o.id
    order by 2, 3
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_procedures_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/* 8.0 version */
create procedure sp_procedures_rowset
    (
    @procedure_name     sysname, 
    @group_number       int = 1,
    @procedure_schema   sysname = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(nvarchar(1),null),
        DESCRIPTION     = convert(nvarchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    
        sysobjects o, 
        syscomments p
    where
        permissions(o.id) <> 0
    and o.name = @procedure_name
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type in ('P', 'FN', 'TF', 'IF')   /* Object type of Procedure */
    and     p.colid = 1
    and     p.id = o.id
    and p.number = @group_number
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_procedures_rowset;2
    (
    @procedure_schema   sysname = null
    )       
as
    select
        PROCEDURE_CATALOG   = db_name(),
        PROCEDURE_SCHEMA    = user_name(o.uid),
        PROCEDURE_NAME      = convert(nvarchar(134),o.name +';'+ ltrim(str(p.number,5))),
        PROCEDURE_TYPE      = convert(smallint, 3 /*DB_PT_FUNCTION*/),
        PROCEDURE_DEFINITION    = convert(nvarchar(1),null),
        DESCRIPTION     = convert(nvarchar(1),null),
        DATE_CREATED        = o.crdate,
        DATE_MODIFIED       = convert(datetime,null)
    from    sysobjects o, syscomments p
    where
        permissions(o.id) <> 0
    and     (@procedure_schema is null or @procedure_schema = user_name(o.uid))
    and     o.type in ('P', 'FN', 'TF', 'IF')   /* Object type of Procedure */
    and p.colid = 1
    and p.id = o.id
    order by 2, 3
go

grant execute on sp_procedures_rowset to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_procedures_rowset' and type = 'P '))
        begin
        drop procedure sp_procedures_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_schemata_rowset'
go

/*  6.0 and 6.5 and 7.0 version */
create procedure sp_schemata_rowset
    (
    @schema_name    varchar(90) = null, 
    @schema_owner   varchar(90) = null
    )       
as
    select  distinct
        CATALOG_NAME            = db_name(),
        SCHEMA_NAME         = user_name(o.uid), 
        SCHEMA_OWNER            = user_name(o.uid), 
        DEFAULT_CHARACTER_SET_CATALOG   = convert(sysname,'master'),
        DEFAULT_CHARACTER_SET_SCHEMA    = convert(sysname,'dbo'),
        DEFAULT_CHARACTER_SET_NAME  = convert(sysname,a_cha.name)
    from    
        sysobjects o,
        master.dbo.sysconfigures    cfg,
        master.dbo.syscharsets      a_cha, /* charset/1001, not sortorder */
        master.dbo.syscharsets      b_cha  /* sortorder/2001, not charset */
    where   
        (@schema_name is null or @schema_name = user_name(o.uid))
    and     (@schema_owner is null or @schema_owner = user_name(o.uid))
    and a_cha.type = 1001 /* type is charset */
    and     b_cha.type = 2001 /* type is sortorder */
    and     a_cha.id = b_cha.csid
    and     b_cha.id = cfg.value
    order by 2
go
dump tran master with no_log
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_schemata_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/* 8.0 version */
create procedure sp_schemata_rowset
    (
    @schema_name    sysname = null, 
    @schema_owner   sysname = null
    )       
as
    select  distinct
        CATALOG_NAME            = db_name(),
        SCHEMA_NAME         = user_name(o.uid), 
        SCHEMA_OWNER            = user_name(o.uid), 
        DEFAULT_CHARACTER_SET_CATALOG   = convert(sysname,N'master'),
        DEFAULT_CHARACTER_SET_SCHEMA    = convert(sysname,N'dbo'),
        DEFAULT_CHARACTER_SET_NAME  = convert(sysname,a_cha.name)
    from    
        sysobjects o,
        master.dbo.syscharsets      a_cha /* charset/1001, not sortorder */
    where   
        (@schema_name is null or @schema_name = user_name(o.uid))
    and     (@schema_owner is null or @schema_owner = user_name(o.uid))
    and a_cha.type = 1001 /* type is charset */
    and     a_cha.id = convert(tinyint, DatabasePropertyEx(db_name(), 'sqlcharset')) /* what is charset of a table? */
    order by 2
go

dump tran master with no_log
go

/* The following stored procedure is used for Sphinx and Hydra */
create procedure sp_schemata_rowset;3
as
    select
        CATALOG_NAME            = convert(sysname,' '),
        SCHEMA_NAME         = convert(sysname,' '), 
        SCHEMA_OWNER            = convert(sysname,' '), 
        DEFAULT_CHARACTER_SET_CATALOG   = convert(sysname,' '),
        DEFAULT_CHARACTER_SET_SCHEMA    = convert(sysname,' '),
        DEFAULT_CHARACTER_SET_NAME  = convert(sysname,' ')
    where   1=0
go
grant execute on sp_schemata_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_schemata_rowset' and type = 'P '))
        begin
        drop procedure sp_schemata_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_statistics_rowset'
go


/*  6.0 and 6.5 version */
create procedure sp_statistics_rowset
    (
    @table_name varchar(255),
    @table_schema   varchar(255) = null  
    )
as
    select  db_name()               as TABLE_CATALOG,       
        user_name(o.uid)            as TABLE_SCHEMA,
        o.name                  as TABLE_NAME,
        x.rows                  as CARDINALITY
    from    sysobjects o, sysindexes x, sysusers u
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     x.id = o.id
    and     x.indid in (0,1)    /*If there are no indexes then table stats are in a row with indid =0 */
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_statistics_rowset;2
    (
    @table_schema   varchar(255) = null  
    )
as
    select  db_name()               as TABLE_CATALOG,       
        user_name(o.uid)            as TABLE_SCHEMA,
        o.name                  as TABLE_NAME,
        x.rows                  as CARDINALITY
    from    sysobjects o, sysindexes x, sysusers u
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     x.id = o.id
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
           )        
    order by 2, 3
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_statistics_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  8.0 version */
create procedure sp_statistics_rowset
    (
    @table_name sysname,
    @table_schema   sysname = null   
    )
as
    select  db_name()               as TABLE_CATALOG,       
        user_name(o.uid)            as TABLE_SCHEMA,
        o.name                  as TABLE_NAME,
        x.rows                  as CARDINALITY
    from    sysobjects o, sysindexes x
    where   o.type in ('U')
    and     o.name = @table_name
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     x.id = o.id
    and     x.indid in (0,1)    /*If there are no indexes then table stats are in a row with indid =0 */
    and     permissions(o.id) <> 0
    order by 2, 3
go
dump tran master with no_log
go
create procedure sp_statistics_rowset;2
    (
    @table_schema   sysname = null   
    )
as
    select  db_name()               as TABLE_CATALOG,       
        user_name(o.uid)            as TABLE_SCHEMA,
        o.name                  as TABLE_NAME,
        x.rows                  as CARDINALITY
    from    sysobjects o, sysindexes x
    where   o.type in ('U')
    and     (@table_schema is null or @table_schema = user_name(o.uid))
    and     x.id = o.id
    and     x.indid in (0,1)    /*If there are no indexes then table stats are in a row with indid =0 */
    and     permissions(o.id) <> 0
    order by 2, 3
go

grant execute on sp_statistics_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_statistics_rowset' and type = 'P '))
        begin
        drop procedure sp_statistics_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_tables_rowset'
go


/*  Procedure for 6.50 and earlier servers */
create procedure sp_tables_rowset
    (
    @table_name varchar(255), 
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        TABLE_TYPE  = convert(varchar(30),
                    case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end),
        TABLE_GUID  = convert(binary(16), null),
        DESCRIPTION = convert(varchar(1), null),
        TABLE_PROPID    = convert(int,null),
        DATE_CREATED    = o.crdate,
        DATE_MODIFIED   = convert(datetime,null)
    from    sysusers u, sysobjects o
    where   o.type in ('U','V','S')
    and     o.name = @table_name
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_rowset;2
    (
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        TABLE_TYPE  = convert(varchar(30),
                    case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end),
        TABLE_GUID  = convert(binary(16), null),
        DESCRIPTION = convert(varchar(1), null),
        TABLE_PROPID    = convert(int,null),
        DATE_CREATED    = o.crdate,
        DATE_MODIFIED   = convert(datetime,null)
    from    sysusers u, sysobjects o
    where   o.type in ('U','V','S')
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_tables_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_tables_rowset
    (
    @table_name sysname, 
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(uid),
            TABLE_NAME  = name,
            TABLE_TYPE  = convert(nvarchar(30),
                        case type 
                        when 'U' then 
                            case when ObjectProperty(id, 'IsMSShipped') = 0
                            then N'TABLE' else N'SYSTEM TABLE' end
                        when 'S' then N'SYSTEM TABLE'
                        when 'V' then 
                            case when ObjectProperty(id, 'IsMSShipped') = 0
                            then N'VIEW' else N'SYSTEM VIEW' end
                        end),
            TABLE_GUID  = convert(uniqueidentifier, null),
            DESCRIPTION = convert(nvarchar(1), null),
            TABLE_PROPID    = convert(int,null),
            DATE_CREATED    = crdate,
            DATE_MODIFIED   = convert(datetime,null)
        from    sysobjects
        where   name = @table_name
        and type in ('U','V','S')
        and permissions(id) <> 0
        ) as o

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)   
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_rowset;2
    (
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG   = db_name(),
            TABLE_SCHEMA    = user_name(uid),
            TABLE_NAME  = name,
            TABLE_TYPE  = convert(nvarchar(30),
                        case type 
                        when 'U' then 
                            case when ObjectProperty(id, 'IsMSShipped') = 0
                            then N'TABLE' else N'SYSTEM TABLE' end
                        when 'S' then N'SYSTEM TABLE'
                        when 'V' then 
                            case when ObjectProperty(id, 'IsMSShipped') = 0
                            then N'VIEW' else N'SYSTEM VIEW' end
                        end),
            TABLE_GUID  = convert(uniqueidentifier, null),
            DESCRIPTION = convert(nvarchar(1), null),
            TABLE_PROPID    = convert(int,null),
            DATE_CREATED    = crdate,
            DATE_MODIFIED   = convert(datetime,null)
        from    sysobjects
        where   type in ('U','V','S')
        and permissions(id) <> 0
        ) as o

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)   
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @table_schema       sysname = null,
    @table_type     sysname = null
    )
as
    select
        TABLE_CATALOG,
        TABLE_SCHEMA,
        TABLE_NAME,
        TABLE_TYPE,
        TABLE_GUID,
        DESCRIPTION
    --  TABLE_PROPID,
    --  DATE_CREATED,
    --  DATE_MODIFIED
    from master.dbo.SYSREMOTE_TABLES (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name,
                @table_type )
    order by 4,1,2,3
go

grant execute on sp_tables_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_tables_rowset' and type = 'P '))
        begin
        drop procedure sp_tables_rowset
        dump tran master with no_log
        end
    end
go



print ''
print 'creating sp_tables_info_rowset'
go


/*  Procedure for 6.50 and earlier servers */
create procedure sp_tables_info_rowset
    (
    @table_name varchar(255), 
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        TABLE_TYPE      = convert(varchar(30),
                        case o.type 
                        when 'U' then 'TABLE'
                        when 'V' then 'VIEW'
                        when 'S' then 'SYSTEM TABLE'
                        end),
        TABLE_GUID      = convert(binary(16), null),
        BOOKMARKS       = convert(bit, 1),
        BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
        BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
        BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
        BOOKMARK_INFORMATION    = convert(int, 0),
        TABLE_VERSION       = convert(int, o.schema_ver),
        CARDINALITY     = x.rows,
        DESCRIPTION     = convert(varchar(1), null),
        TABLE_PROPID        = convert(int, null)

    from    sysusers u, 
        sysobjects o,
        sysindexes x

    where   o.type in ('U','V','S')
    and     o.name = @table_name
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and o.id *= x.id
    and x.indid in (0,1)
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset;2
    (
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        TABLE_TYPE      = convert(varchar(30),
                        case o.type 
                        when 'U' then 'TABLE'
                        when 'V' then 'VIEW'
                        when 'S' then 'SYSTEM TABLE'
                        end),
        TABLE_GUID      = convert(binary(16), null),
        BOOKMARKS       = convert(bit, 1),
        BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
        BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
        BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
        BOOKMARK_INFORMATION    = convert(int, 0),
        TABLE_VERSION       = convert(int, o.schema_ver),
        CARDINALITY     = x.rows,
        DESCRIPTION     = convert(varchar(1), null),
        TABLE_PROPID        = convert(int, null)

    from    sysusers u, 
        sysobjects o,
        sysindexes x

    where   o.type in ('U','V','S')
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and o.id *= x.id
    and x.indid in (0,1)
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_tables_info_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 server */
create procedure sp_tables_info_rowset
    (
    @table_name sysname, 
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(int, o.schema_ver),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.name = @table_name
        and     o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset;2
    (
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(int, o.schema_ver),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go

dump tran master with no_log
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_tables_info_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_tables_info_rowset
    (
    @table_name sysname, 
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(bigint, ObjectPropertyEx(o.id, 'objectversion')),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.name = @table_name
        and     o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset;2
    (
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 19 /*DBTYPE_UI4 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 4),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(bigint, ObjectPropertyEx(o.id, 'objectversion')),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go

grant execute on sp_tables_info_rowset to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_tables_info_rowset' and type = 'P '))
        begin
        drop procedure sp_tables_info_rowset
        dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_tables_info_rowset_64'
go


/*  Procedure for 6.50 and earlier servers */
create procedure sp_tables_info_rowset_64
    (
    @table_name varchar(255), 
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        TABLE_TYPE      = convert(varchar(30),
                        case o.type 
                        when 'U' then 'TABLE'
                        when 'V' then 'VIEW'
                        when 'S' then 'SYSTEM TABLE'
                        end),
        TABLE_GUID      = convert(binary(16), null),
        BOOKMARKS       = convert(bit, 1),
        BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
        BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
        BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
        BOOKMARK_INFORMATION    = convert(int, 0),
        TABLE_VERSION       = convert(int, o.schema_ver),
        CARDINALITY     = x.rows,
        DESCRIPTION     = convert(varchar(1), null),
        TABLE_PROPID        = convert(int, null)

    from    sysusers u, 
        sysobjects o,
        sysindexes x

    where   o.type in ('U','V','S')
    and     o.name = @table_name
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and o.id *= x.id
    and x.indid in (0,1)
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset_64;2
    (
    @table_schema   varchar(255) = null,    
    @table_type varchar(255) = null 
    )
as
    select  TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(o.uid),
        TABLE_NAME      = o.name,
        TABLE_TYPE      = convert(varchar(30),
                        case o.type 
                        when 'U' then 'TABLE'
                        when 'V' then 'VIEW'
                        when 'S' then 'SYSTEM TABLE'
                        end),
        TABLE_GUID      = convert(binary(16), null),
        BOOKMARKS       = convert(bit, 1),
        BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
        BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
        BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
        BOOKMARK_INFORMATION    = convert(int, 0),
        TABLE_VERSION       = convert(int, o.schema_ver),
        CARDINALITY     = x.rows,
        DESCRIPTION     = convert(varchar(1), null),
        TABLE_PROPID        = convert(int, null)

    from    sysusers u, 
        sysobjects o,
        sysindexes x

    where   o.type in ('U','V','S')
    and     (   @table_schema is null
        or  @table_schema = user_name(o.uid)
        )
    and     (
            @table_type is null
        or  @table_type = case o.type 
                    when 'U' then 'TABLE'
                    when 'V' then 'VIEW'
                    when 'S' then 'SYSTEM TABLE'
                    end
        )
    and o.id *= x.id
    and x.indid in (0,1)
    and     u.uid = user_id() /* constrain sysusers uid for use in subquery */
    and     (
        suser_id() = 1   /* User is the System Administrator */
        or o.uid = user_id()     /* User created the object */
        /* here's the magic... select the highest precedence of permissions in the order (user,group,public)  */
        or (    (select max(((sign(uid)*abs(uid-16383))*2)+(protecttype&1))
            from sysprotects p
            /* join to correlate with all rows in sysobjects */
            where p.id = o.id
            /* get rows for public,current user,user's group */
            and (p.uid = 0 or p.uid = user_id() or p.uid = u.gid)
            /* check for SELECT,EXECUTE privilege */
            and (action in (193,224)))&1     /* more magic...normalize GRANT */
            ) = 1   /* final magic...compare Grants   */
        )       
    order by 4, 2, 3
go
dump tran master with no_log
go

if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_tables_info_rowset_64
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 7.0 server */
create procedure sp_tables_info_rowset_64
    (
    @table_name sysname, 
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(int, o.schema_ver),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.name = @table_name
        and     o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset_64;2
    (
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(int, o.schema_ver),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go

dump tran master with no_log
go

if (charindex('8.00', @@version) > 0)
    drop procedure sp_tables_info_rowset_64
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_tables_info_rowset_64
    (
    @table_name sysname, 
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(bigint, ObjectPropertyEx(o.id, 'objectversion')),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.name = @table_name
        and     o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go
dump tran master with no_log
go
create procedure sp_tables_info_rowset_64;2
    (
    @table_schema   sysname = null, 
    @table_type nvarchar(255) = null 
    )
as
    select  *
    from    (select TABLE_CATALOG       = db_name(),
            TABLE_SCHEMA        = user_name(o.uid),
            TABLE_NAME      = o.name,
            TABLE_TYPE      = convert(nvarchar(30),
                            case o.type 
                            when 'U' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'TABLE' else N'SYSTEM TABLE' end
                            when 'S' then N'SYSTEM TABLE'
                            when 'V' then 
                                case when ObjectProperty(o.id, 'IsMSShipped') = 0
                                then N'VIEW' else N'SYSTEM VIEW' end
                            end),
            TABLE_GUID      = convert(uniqueidentifier, null),
            BOOKMARKS       = convert(bit, 1),
            BOOKMARK_TYPE       = convert(int, 1 /*DBPROPVAL_BMK_NUMERIC*/),
            BOOKMARK_DATATYPE   = convert(smallint, 21 /*DBTYPE_UI8 */),
            BOOKMARK_MAXIMUM_LENGTH = convert(int, 8),
            BOOKMARK_INFORMATION    = convert(int, 0),
            TABLE_VERSION       = convert(bigint, ObjectPropertyEx(o.id, 'objectversion')),
            CARDINALITY     = x.rows,
            DESCRIPTION     = convert(nvarchar(1), null),
            TABLE_PROPID        = convert(int, null) 
    
        from    sysobjects o left join sysindexes x on o.id = x.id and x.indid in (0,1)
        where   o.type in ('U','V','S')
        and permissions(o.id) <> 0) as t

    where   (@table_schema is null or @table_schema = TABLE_SCHEMA)
    and     (@table_type is null or @table_type = TABLE_TYPE)
    order by 4, 2, 3
go

grant execute on sp_tables_info_rowset_64 to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_tables_info_rowset_64' and type = 'P '))
        begin
        drop procedure sp_tables_info_rowset_64
        dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_table_constraints_rowset'
go


/*  Procedure for 6.50 and earlier servers */
create procedure sp_table_constraints_rowset
    (
    @table_name         varchar(255), 
    @table_schema       varchar(255) = null,
    @table_catalog      varchar(255) = null,
    @constraint_name    varchar(255) = null,
    @constraint_schema  varchar(255) = null,
    @constraint_catalog varchar(255) = null,
    @constraint_type    varchar(255) = null 
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_TYPE     = case (c.status & 0xf)
                                when 1 then 'PRIMARY KEY'
                                when 2 then 'UNIQUE'
                                when 3 then 'FOREIGN KEY'
                                when 4 then 'CHECK'
                                end, 
        IS_DEFERRABLE       = convert(tinyint, 0),
        INITIALLY_DEFERRED  = convert(tinyint, 0),
        DESCRIPTION         = convert(varchar(1), null)

    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c
    where
            t_obj.name  = @table_name
        and t_obj.type in ('U','S')
        and (@table_catalog is null or @table_catalog = db_name())
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c.id = t_obj.id
        and (c.status & 0xf) between 1 and 4
        and c_obj.id    = c.constid
        and c_obj.uid   = user_id()
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_catalog is null or @constraint_catalog = db_name())
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and (@constraint_type is null
            or (c.status & 0xf)
                = case @constraint_type
                    when 'PRIMARY KEY' then 1
                    when 'UNIQUE' then 2
                    when 'FOREIGN KEY' then 3
                    when 'CHECK' then 4
                    end)
order by 2,3,5,6,7 
go
dump tran master with no_log
go
create procedure sp_table_constraints_rowset;2
    (
    @table_schema       varchar(255) = null,
    @table_catalog      varchar(255) = null,
    @constraint_name    varchar(255) = null,
    @constraint_schema  varchar(255) = null,
    @constraint_catalog varchar(255) = null,
    @constraint_type    varchar(255) = null 
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_TYPE     = case (c.status & 0xf)
                                when 1 then 'PRIMARY KEY'
                                when 2 then 'UNIQUE'
                                when 3 then 'FOREIGN KEY'
                                when 4 then 'CHECK'
                                end, 
        IS_DEFERRABLE       = convert(tinyint, 0),
        INITIALLY_DEFERRED  = convert(tinyint, 0),
        DESCRIPTION         = convert(varchar(1), null)

    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c
    where
            t_obj.type in ('U','S')
        and (@table_catalog is null or @table_catalog = db_name())
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c.id = t_obj.id
        and (c.status & 0xf) between 1 and 4
        and c_obj.id    = c.constid
        and c_obj.uid   = user_id()
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_catalog is null or @constraint_catalog = db_name())
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and (@constraint_type is null
            or (c.status & 0xf)
                = case @constraint_type
                    when 'PRIMARY KEY' then 1
                    when 'UNIQUE' then 2
                    when 'FOREIGN KEY' then 3
                    when 'CHECK' then 4
                    end)
order by 2,3,5,6,7 
go
dump tran master with no_log
go


if (charindex('7.00', @@version) > 0 or
    charindex('8.00', @@version) > 0)
    drop procedure sp_table_constraints_rowset
else
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/*  Procedure for 8.0 server */
create procedure sp_table_constraints_rowset
    (
    @table_name         sysname, 
    @table_schema       sysname = null,
    @table_catalog      sysname = null,
    @constraint_name    sysname = null,
    @constraint_schema  sysname = null,
    @constraint_catalog sysname = null,
    @constraint_type    nvarchar(255) = null 
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_TYPE     = case (c.status & 0xf)
                                when 1 then N'PRIMARY KEY'
                                when 2 then N'UNIQUE'
                                when 3 then N'FOREIGN KEY'
                                when 4 then N'CHECK'
                                end, 
        IS_DEFERRABLE       = convert(bit, 0),
        INITIALLY_DEFERRED  = convert(bit, 0),
        DESCRIPTION         = convert(nvarchar(1), null)

    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c
    where
            t_obj.name  = @table_name
        and t_obj.type in ('U','S')
        and (@table_catalog is null or @table_catalog = db_name())
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c.id = t_obj.id
        and (c.status & 0xf) between 1 and 4
        and c_obj.id    = c.constid
        and c_obj.uid   = user_id()
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_catalog is null or @constraint_catalog = db_name())
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and (@constraint_type is null
            or (c.status & 0xf)
                = case @constraint_type
                    when N'PRIMARY KEY' then 1
                    when N'UNIQUE' then 2
                    when N'FOREIGN KEY' then 3
                    when N'CHECK' then 4
                    end)
order by 2,3,5,6,7 
go
dump tran master with no_log
go
create procedure sp_table_constraints_rowset;2
    (
    @table_schema       sysname = null,
    @table_catalog      sysname = null,
    @constraint_name    sysname = null,
    @constraint_schema  sysname = null,
    @constraint_catalog sysname = null,
    @constraint_type    nvarchar(255) = null 
    )
as
    select
        CONSTRAINT_CATALOG  = db_name(),
        CONSTRAINT_SCHEMA   = user_name(c_obj.uid),
        CONSTRAINT_NAME     = c_obj.name,
        TABLE_CATALOG       = db_name(),
        TABLE_SCHEMA        = user_name(t_obj.uid),
        TABLE_NAME          = t_obj.name,
        CONSTRAINT_TYPE     = case (c.status & 0xf)
                                when 1 then N'PRIMARY KEY'
                                when 2 then N'UNIQUE'
                                when 3 then N'FOREIGN KEY'
                                when 4 then N'CHECK'
                                end, 
        IS_DEFERRABLE       = convert(bit, 0),
        INITIALLY_DEFERRED  = convert(bit, 0),
        DESCRIPTION         = convert(nvarchar(1), null)

    from 
        sysobjects c_obj, sysobjects t_obj, sysconstraints c
    where
            t_obj.type in ('U','S')
        and (@table_catalog is null or @table_catalog = db_name())
        and (@table_schema is null or @table_schema = user_name(t_obj.uid))
        and c.id = t_obj.id
        and (c.status & 0xf) between 1 and 4
        and c_obj.id    = c.constid
        and c_obj.uid   = user_id()
        and (@constraint_name is null or c_obj.name = @constraint_name)
        and (@constraint_catalog is null or @constraint_catalog = db_name())
        and (@constraint_schema is null or @constraint_schema = user_name(c_obj.uid))
        and (@constraint_type is null
            or (c.status & 0xf)
                = case @constraint_type
                    when N'PRIMARY KEY' then 1
                    when N'UNIQUE' then 2
                    when N'FOREIGN KEY' then 3
                    when N'CHECK' then 4
                    end)
order by 2,3,5,6,7 
go
dump tran master with no_log


grant execute on sp_table_constraints_rowset to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
            where name = 'sp_table_constraints_rowset' and type = 'P '))
        begin
        drop procedure sp_table_constraints_rowset
        dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_table_privileges_rowset'
go

/*  Procedure for 6.0 and 6.5 server */
CREATE PROCEDURE sp_table_privileges_rowset
    (
    @table_name varchar(255) = null,
    @table_schema   varchar(255) = null,
    @grantor    varchar(255) = null,
    @grantee    varchar(255) = null
    )
as
IF @table_name is not null
    BEGIN
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and     o.type in ('U','V','S')
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     o.type in ('U','V','S')
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
    END
ELSE
    BEGIN
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
    END
go
dump tran master with no_log
go
CREATE PROCEDURE sp_table_privileges_rowset;2
    (
    @handle     int output,
    @scrollopt  int output,
    @ccopt      int output,
    @rows       int output,
    @table_name     varchar(255) = null,
    @table_schema   varchar(255) = null,
    @grantor    varchar(255) = null,
    @grantee    varchar(255) = null
    )
as
declare @ret int
SET NOCOUNT ON
create table #sptprivsrowset1
    (
    GRANTOR     sysname not null,
    GRANTEE     sysname not null,
    TABLE_CATALOG   sysname not null,
    TABLE_SCHEMA    sysname not null,
    TABLE_NAME  sysname not null,
    PRIVILEGE_TYPE  sysname not null,
    IS_GRANTABLE    bit not null
    )
    
IF @table_name is not null
    BEGIN
    insert into #sptprivsrowset1
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and     o.type in ('U','V','S')
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     o.type in ('U','V','S')
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
    END
ELSE
    BEGIN
    insert into #sptprivsrowset1
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case p.action
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
            /* expand groups */
    and     ((p.uid = u.uid and u.uid <> u.gid) or (p.uid = u.gid and u.uid <> u.gid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(varchar(30),
                    case v.number
                    when 193 then 'SELECT'
                    when 195 then 'INSERT'
                    when 196 then 'DELETE'
                    when 197 then 'UPDATE'
                    else 'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
    END

exec @ret = sp_cursoropen @handle output, 'select * from #sptprivsrowset1',
    @scrollopt output, @ccopt output, @rows output

drop table #sptprivsrowset1
return isnull(@ret,0)
go
dump tran master with no_log
go
CREATE PROCEDURE sp_table_privileges_rowset;3
as
    select
        GRANTOR     = convert(sysname, ' '),
        GRANTEE     = convert(sysname, ' '),
        TABLE_CATALOG   = convert(sysname, ' '),
        TABLE_SCHEMA    = convert(sysname, ' '),
        TABLE_NAME  = convert(sysname, ' '),
        PRIVILEGE_TYPE  = convert(varchar(30), ' '),
        IS_GRANTABLE    = convert(bit, 0)
    where   1=0
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_table_privileges_rowset
go


/*  Procedure for 8.0 server */
CREATE PROCEDURE sp_table_privileges_rowset
    (
    @table_name         sysname,
    @table_schema       sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case p.action
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 196 then N'DELETE'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, sysmembers m
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and     o.type in ('U','V','S')
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
        /* expand groups - AKUNDONE: only 1 level of grp unrolling. */
    and     (u.uid > 0 and u.uid < 16384)
    and     ((p.uid = u.uid) or (p.uid = m.groupuid and u.uid = m.memberuid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case v.number
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 196 then N'DELETE'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.name = @table_name
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     o.type in ('U','V','S')
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
go
dump tran master with no_log
go
CREATE PROCEDURE sp_table_privileges_rowset;2
    (
    @table_schema       sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR     = user_name(p.grantor),
        GRANTEE     = user_name(u.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case p.action
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 196 then N'DELETE'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,case when p.protecttype = 205 then 0 else 1 end)
    from 
        sysprotects p, sysobjects o, sysusers u, sysmembers m
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(u.uid))
    and p.id = o.id
    and     (@grantor is null or @grantor = user_name(p.grantor))
        /* expand groups - AKUNDONE: only 1 level of grp unrolling. */
    and     (u.uid > 0 and u.uid < 16384)
    and     ((p.uid = u.uid) or (p.uid = m.groupuid and u.uid = m.memberuid))
    and     p.protecttype <> 206    /* only grant rows */
    and     p.action in (26,193,195,196,197)
    and     o.uid <> u.uid          /* no rows for owner */
    and     not exists (            /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = p.action
            and     p1.id = p.id
            and     p1.uid = u.uid)
    union
    select  /*  Add rows for table owner */
        GRANTOR     = user_name(u.uid),
        GRANTEE     = user_name(o.uid),
        TABLE_CATALOG   = db_name(),
        TABLE_SCHEMA    = user_name(o.uid),
        TABLE_NAME  = o.name,
        PRIVILEGE_TYPE  = convert(nvarchar(30),
                    case v.number
                    when 193 then N'SELECT'
                    when 195 then N'INSERT'
                    when 196 then N'DELETE'
                    when 197 then N'UPDATE'
                    else N'REFERENCES'
                    end),
        IS_GRANTABLE    = convert(bit,1)    
    from 
        sysobjects o, master.dbo.spt_values v, sysusers u
    where
        o.type in ('U','V','S')
    and (@table_schema is null or @table_schema = user_name(o.uid))
    and (@grantee is null or @grantee = user_name(o.uid))
    and     u.uid = 1       /* grantor is dbo of database */
    and (@grantor is null or @grantor = user_name(u.uid))
    and     v.type = 'P'    /* cross product to get all exposed privileges */
    and     v.number in (26,193,195,196,197)
    and     not exists (    /* exclude revoke'd privileges */
            select  *
            from    sysprotects p1
            where   p1.protecttype = 206
            and     p1.action = v.number
            and     p1.id = o.id
            and     p1.uid = o.uid)
    order by 4,5,6,1,2
go
dump tran master with no_log
go
create procedure sp_table_privileges_rowset;5
    (
    @table_server       sysname,
    @table_catalog      sysname = null,
    @table_name     sysname = null,
    @table_schema       sysname = null,
    @grantor        sysname = null,
    @grantee        sysname = null
    )
as
    select
        GRANTOR,        
        GRANTEE,        
        TABLE_CATALOG,  
        TABLE_SCHEMA,   
        TABLE_NAME, 
        PRIVILEGE_TYPE, 
        IS_GRANTABLE    
    from master.dbo.SYSREMOTE_TABLE_PRIVILEGES (
                @table_server,
                @table_catalog,
                @table_schema,
                @table_name,
                @grantor,
                @grantee )
    order by 3,4,5,6,1,2
go

grant execute on sp_table_privileges_rowset to public
go
dump tran master with no_log
go
if (charindex('6.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_table_privileges_rowset' and type = 'P '))
        begin
        drop proc sp_table_privileges_rowset
        dump tran master with no_log
        end
    end
go


print ''
print 'creating sp_linkedservers_rowset'
go
if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go
/*  Procedure for 8.0 server */
create proc sp_linkedservers_rowset
    (
    @srvname    sysname
    )
as
	select
		SVR_NAME 		    = srvname,
		SVR_PRODUCT		    = srvproduct,
		SVR_PROVIDERNAME	= providername,
		SVR_DATASOURCE		= datasource,
		SVR_PROVIDERSTRING  = case when is_srvrolemember('sysadmin') = 1 then providerstring else NULL end,
		SVR_LOCATION		= location,
		SVR_CATALOG		    = catalog
	from master.dbo.sysservers
	where srvname = @srvname and (srvstatus & 128) = 128
	order by 1
go
dump tran master with no_log
go
create proc sp_linkedservers_rowset;2
as
	select
		SVR_NAME 		    = srvname,
		SVR_PRODUCT		    = srvproduct,
		SVR_PROVIDERNAME	= providername,
		SVR_DATASOURCE		= datasource,
		SVR_PROVIDERSTRING  = case when is_srvrolemember('sysadmin') = 1 then providerstring else NULL end,
		SVR_LOCATION		= location,
		SVR_CATALOG		    = catalog
	from master.dbo.sysservers
	where (srvstatus & 128) = 128
	order by 1
go

grant execute on sp_linkedservers_rowset to public
go

dump tran master with no_log
go

print ''
print 'creating sp_table_statistics_rowset'
go
if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.00 SQL Server.'
    print 'Ignore the following errors.'
end
go
/*  Procedure for 8.00 server */
create proc sp_table_statistics_rowset
as
    select
        TABLE_CATALOG = convert(sysname, null),
        TABLE_SCHEMA = convert(sysname, null),
        TABLE_NAME = convert(sysname, null),
        STATISTICS_CATALOG = convert(sysname, null),
        STATISTICS_SCHEMA = convert(sysname, null),
        STATISTICS_NAME = convert(sysname, null),
        STATISTICS_TYPE = convert(smallint,0),
        COLUMN_NAME = convert(sysname, null),
        COLUMN_GUID = convert(uniqueidentifier, null),
        COLUMN_PROPID = convert(int, null),
        ORDINAL_POSITION = convert(int, null),
        SAMPLE_PCT = convert(smallint, null),
        LAST_UPDATE_TIME = convert(datetime, null),
        NO_OF_RANGES = convert(int, null),
        COLUMN_CARDINALITY = convert(bigint, null),
        TUPLE_CARDINALITY = convert(bigint, null),
        TABLE_CARDINALITY = convert(bigint, null),
        AVG_COLUMN_LENGTH = convert(int, null)
    where 1=0
go
dump tran master with no_log
go

create proc sp_table_statistics_rowset;2
                (@table_catalog     sysname = null,
                @table_schema       sysname = null,
                @table_name     sysname = null,
                @stat_catalog       sysname = null,
                @stat_schema        sysname = null,
                @stat_name      sysname = null)
as 
begin
    
    set nocount on

    -- check in parameters
    if ((@table_catalog is not null) and (db_name() <> @table_catalog)
        or (@stat_catalog is not null) and (db_name() <> @stat_catalog))
        begin   /* If qualifier doesn't match current database */
            raiserror 20001 '~~Rush_5~~'
            return
        end

    --- create temp table
    create table #spstattab(
        tblcatalog  sysname collate database_default not null,
        tblschema   sysname collate database_default not null,
        tblname     sysname collate database_default not null,
        statname    sysname collate database_default not null
        )

    insert into #spstattab
    select 
        db_name(),
        user_name(o.uid),
        o.name,
        x.name
    from sysobjects o, sysindexes x
    where o.type in ('U')
        and (@table_name is null or o.name = @table_name)
        and (@table_schema is null or @table_schema = user_name(o.uid))
        and (@stat_name is null or @stat_name = x.name)
        and (@stat_schema is null or @stat_schema = user_name(o.uid))
        and x.id = o.id
        and permissions(o.id) <> 0
        and x.statblob is not null
    order by 1,2,3,4

    -- fast forward CURSOR OVER THE temp TABLE
    declare ff_csr  cursor fast_forward for
    select tblcatalog, tblschema, tblname, statname from #spstattab

    declare @tblcatalog sysname,
        @tblschema  sysname,
        @tblname    sysname,
        @statname   sysname,
        @qtbl       nvarchar(4000),
        @rowsetcount    int

    set @rowsetcount = 0

    open ff_csr
    fetch ff_csr into @tblcatalog, @tblschema, @tblname, @statname
    while @@fetch_status >= 0
    begin
        set @rowsetcount = @rowsetcount + 1
        set @qtbl = @tblcatalog + '.' + @tblschema + '.' + @tblname
        dbcc show_statistics(@qtbl, @statname) with stat_header join density_vector
        fetch ff_csr into @tblcatalog, @tblschema, @tblname, @statname
    end
    close ff_csr
    deallocate ff_csr
    
    --- drop temp table
    drop table #spstattab

    if @rowsetcount = 0
    begin
        select  
            TABLE_CATALOG = convert(sysname, null),
            TABLE_SCHEMA = convert(sysname, null),
            TABLE_NAME = convert(sysname, null),
            STATISTICS_CATALOG = convert(sysname, null),
            STATISTICS_SCHEMA = convert(sysname, null),
            STATISTICS_NAME = convert(sysname, null),
            STATISTICS_TYPE = convert(smallint,0),
            COLUMN_NAME = convert(sysname, null),
            COLUMN_GUID = convert(uniqueidentifier, null),
            COLUMN_PROPID = convert(int, null),
            ORDINAL_POSITION = convert(int, null),
            SAMPLE_PCT = convert(smallint, null),
            LAST_UPDATE_TIME = convert(datetime, null),
            NO_OF_RANGES = convert(int, null),
            COLUMN_CARDINALITY = convert(bigint, null),
            TUPLE_CARDINALITY = convert(bigint, null),
            TABLE_CARDINALITY = convert(bigint, null),
            AVG_COLUMN_LENGTH = convert(int, null)
        where 1=0
    end

    set nocount off
end
go

grant execute on sp_table_statistics_rowset to public
go

dump tran master with no_log
go

print ''
print 'creating sp_oledb_column_constraints'
go

/* Procedure for 6.5 server */
create procedure sp_oledb_column_constraints
    (@tblname varchar(225)      -- the table to check for constraints
    ,@colname varchar(225)      -- the column to check for constraints
    ,@dropcnst smallint)
as
begin
    -- PRELIM
    set nocount on

    declare @tblid      int           -- the object id of the table
        ,@cnstname      varchar(225)   -- name of const. currently under consideration
        ,@cnstid        int
        ,@cnstatus      int
        ,@dbname        varchar(30)

    -- Create temp table
    create table #spcnsttab
    (cnst_name      varchar(225)        NOT NULL)

    -- Check to see that the object names are local to the current database.
    if @tblname like '%.%.%'
       and  substring(@tblname, 1, charindex('.', @tblname) - 1) <> db_name()
    begin
        raiserror(15250,-1,-1)
        return (1)
    end
    -- Check to see if the table exists and initialize @objid.
    select @tblid = object_id(@tblname)
    if @tblid is NULL
    begin
        select @dbname=db_name()
        raiserror(15009,-1,-1,@tblname,@dbname)
        return (1)
    end

    -- STATIC CURSOR OVER THE TABLE'S CONSTRAINTS
    declare cnst_csr insensitive cursor for
        select c.constid, c.status, o.name 
        from sysconstraints c, sysobjects o 
        where c.id = @tblid and o.id = c.constid
            and ((c.status & 0xf)=1 and (@dropcnst & 16)<> 0
            or (c.status & 0xf)=2 and (@dropcnst & 32)<> 0 
            or (c.status & 0xf)=5 and (@dropcnst & 2)<> 0)  
        -- ONLY 6.5 sysconstraints objects
        for read only

    -- Now check out each constraint, figure out its type and keys and
    -- save the info in a temporary table that we'll print out at the end.
    open cnst_csr
    fetch cnst_csr into @cnstid, @cnstatus, @cnstname
    while @@fetch_status >= 0
    begin
        if ((@cnstatus & 0xf) in (1, 2)) ---- primary key, unique
            begin
                -- get indid
                declare @indid smallint
                select  @indid = indid
                from    sysindexes
                where   name = object_name(@cnstid) and id = @tblid

                if (@colname = index_col(@tblname, @indid, 1)) 
                    and (index_col(@tblname, @indid, 2) is null)
                    begin
                        -- ADD TO TABLE
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end
        else
        if (@cnstatus & 0xf) = 5
            begin
                if (select col_name(id, colid) from sysconstraints where colid > 0 and constid=@cnstid) = @colname
                    begin
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end

        fetch cnst_csr into @cnstid ,@cnstatus ,@cnstname
    end     --of major loop
    close cnst_csr
    deallocate cnst_csr

    -- Now print out the contents of the temporary index table.
    select 'constraint_name' = cnst_name
    from #spcnsttab 
    
    drop table #spcnsttab

    set nocount off
    return (0)
end 
go
dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 7.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_oledb_column_constraints
go

/* Procedure for 7.0 server */
create procedure sp_oledb_column_constraints
    (@tblname nvarchar(776)     -- the table to check for constraints
    ,@colname nvarchar(776)     -- the column to check for constraints
    ,@dropcnst smallint)
as
begin
    -- PRELIM
    set nocount on

    declare @tblid      int           -- the object id of the table
        ,@cnstname      sysname       -- name of const. currently under consideration
        ,@cnstid        int
        ,@cnsttype      character(2)
        ,@dbname        sysname

    -- Create temp table
    create table #spcnsttab
    (cnst_name      sysname     NOT NULL)

    -- Check to see that the object names are local to the current database.
    select @dbname = parsename(@tblname,3) 
    if @dbname is not null and @dbname <> db_name()
    begin
        raiserror(15250,-1,-1)
        return (1)
    end

    -- Check to see if the table exists and initialize @objid.
    select @tblid = object_id(@tblname)
    if @tblid is NULL
    begin
        select @dbname=db_name()
        raiserror(15009,-1,-1,@tblname,@dbname)
        return (1)
    end

    -- STATIC CURSOR OVER THE TABLE'S CONSTRAINTS
    declare cnst_csr cursor fast_forward for
        select id, xtype, name 
        from sysobjects 
        where parent_obj = @tblid
            and ((xtype = 'PK' and (@dropcnst & 16)<> 0) 
            or (xtype = 'UQ' and (@dropcnst & 32)<> 0)
            or (xtype = 'D ' and (@dropcnst & 2)<> 0))  
        -- ONLY 6.5 sysconstraints objects
        for read only

    -- Now check out each constraint, figure out its type and keys and
    -- save the info in a temporary table that we'll print out at the end.
    open cnst_csr
    fetch cnst_csr into @cnstid, @cnsttype, @cnstname
    while @@fetch_status >= 0
    begin
        if @cnsttype in ('PK','UQ')
            begin
                -- get indid
                declare @indid smallint
                select  @indid = indid
                from    sysindexes
                where   name = object_name(@cnstid) and id = @tblid

                if (@colname = index_col(@tblname, @indid, 1)) 
                    and (index_col(@tblname, @indid, 2) is null)
                    begin
                        -- ADD TO TABLE
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end
        else
        if (@cnsttype = 'D ')
            begin
                if (select col_name(@tblid, info) from sysobjects where id=@cnstid) = @colname
                    begin
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end

        fetch cnst_csr into @cnstid ,@cnsttype ,@cnstname
    end     --of major loop
    close cnst_csr
    deallocate cnst_csr

    -- Now print out the contents of the temporary index table.
    select 'constraint_name' = cnst_name
    from #spcnsttab 

    drop table #spcnsttab
    
    set nocount off
    return (0)
end
go

if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_oledb_column_constraints
go

/* Procedure for 8.0 server */
create procedure sp_oledb_column_constraints
    (@tblname nvarchar(776)     -- the table to check for constraints
    ,@colname nvarchar(776)     -- the column to check for constraints
    ,@dropcnst smallint)
as
begin
    -- PRELIM
    set nocount on

    declare @tblid      int           -- the object id of the table
        ,@cnstname      sysname       -- name of const. currently under consideration
        ,@cnstid        int
        ,@cnsttype      character(2)
        ,@dbname        sysname

    -- Create temp table
    create table #spcnsttab
    (cnst_name      sysname     collate database_default NOT NULL)

    -- Check to see that the object names are local to the current database.
    select @dbname = parsename(@tblname,3) 
    if @dbname is not null and @dbname <> db_name()
    begin
        raiserror(15250,-1,-1)
        return (1)
    end

    -- Check to see if the table exists and initialize @objid.
    select @tblid = object_id(@tblname)
    if @tblid is NULL
    begin
        select @dbname=db_name()
        raiserror(15009,-1,-1,@tblname,@dbname)
        return (1)
    end

    -- STATIC CURSOR OVER THE TABLE'S CONSTRAINTS
    declare cnst_csr cursor fast_forward for
        select id, xtype, name 
        from sysobjects 
        where parent_obj = @tblid
            and ((xtype = 'PK' and (@dropcnst & 16)<> 0) 
            or (xtype = 'UQ' and (@dropcnst & 32)<> 0)
            or (xtype = 'D ' and (@dropcnst & 2)<> 0))  
        -- ONLY 6.5 sysconstraints objects
        for read only

    -- Now check out each constraint, figure out its type and keys and
    -- save the info in a temporary table that we'll print out at the end.
    open cnst_csr
    fetch cnst_csr into @cnstid, @cnsttype, @cnstname
    while @@fetch_status >= 0
    begin
        if @cnsttype in ('PK','UQ')
            begin
                -- get indid
                declare @indid smallint
                select  @indid = indid
                from    sysindexes
                where   name = object_name(@cnstid) and id = @tblid

                if (@colname = index_col(@tblname, @indid, 1)) 
                    and (index_col(@tblname, @indid, 2) is null)
                    begin
                        -- ADD TO TABLE
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end
        else
        if (@cnsttype = 'D ')
            begin
                if (select col_name(@tblid, info) from sysobjects where id=@cnstid) = @colname
                    begin
                        insert into #spcnsttab
                        values (@cnstname)
                    end
            end

        fetch cnst_csr into @cnstid ,@cnsttype ,@cnstname
    end     --of major loop
    close cnst_csr
    deallocate cnst_csr

    -- Now print out the contents of the temporary index table.
    select 'constraint_name' = cnst_name
    from #spcnsttab 

    drop table #spcnsttab
    
    set nocount off
    return (0)
end
go

grant execute on sp_oledb_column_constraints to public
go

dump tran master with no_log
go

print ''
print 'creating sp_oledb_indexinfo'
go

/* Procedure for 6.5 server */
create procedure sp_oledb_indexinfo
        @objname varchar(225)       -- the table to check for indexes
        ,@indname varchar(225)
as
begin
    -- PRELIM
    set nocount on

    declare @objid int,         -- the object id of the table
        @indid smallint,    -- the index id of an index
        @status int,
        @dbname varchar(30),
        @OrigFillFactor tinyint,
        @i int, 
        @thiskey varchar(32),
        @tptr     varbinary(16) -- pointer for building text strings.
    ---- Check to see that the object names are local to the current database.
    if @objname like '%.%.%'
       and  substring(@objname, 1, charindex('.', @objname) - 1) <> db_name()
    begin
        raiserror(15250,-1,-1)
        return (1)
    end
    ---- Check to see if the table exists and initialize @objid.
    select @objid = object_id(@objname)
    ---- Table does not exist so return.
    if @objid is NULL
    begin
        select @dbname=db_name()
        raiserror(15009,-1,-1,@objname,@dbname)
        return (1)
    end

    select @indid = indid, @status = status, @OrigFillFactor = OrigFillFactor
    from sysindexes
    where id = @objid and name = @indname 

    -- IF NO INDEX, QUIT
    if @indid is NULL
    begin
        raiserror(15472,-1,-1) --'Object does not have any indexes.'
        return (1)
    end
    -- create temp table
    create table #spindtab
    (
        status              int,
        OrigFillFactor          tinyint,
        index_keys          text    NOT NULL,
    )
    -- Now check out each index, figure out its type and keys and
    -- First we'll figure out what the keys are.
    select @i = 1
    while (@i <= 16)
        begin
            select @thiskey = index_col(@objname, @indid, @i)
            if @thiskey is NULL
                    goto keysdone
            if @i=1
                begin
                    insert into #spindtab
                    values (@status, @OrigFillFactor, @thiskey)

            select @tptr = textptr(index_keys) from #spindtab
                end
            else
                begin
                    select @thiskey = ', ' + @thiskey

            if @tptr is not null
                    updatetext #spindtab.index_keys @tptr null null @thiskey
                end

        select @i = @i + 1
         end --loop 16
         ---- When we get here we now have all the keys.

keysdone:
    select * from #spindtab
    
    drop table #spindtab
    set nocount off
    return (0)
end
go
dump tran master with no_log
go

if (charindex('7.00', @@version) = 0 and
    charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
else
    drop proc sp_oledb_indexinfo
go

/* Procedure for 8.0 server */
create proc sp_oledb_indexinfo
        @objname nvarchar(776)      -- the table to check for indexes
        ,@indname nvarchar(776)
as
begin
    -- PRELIM
    set nocount on

    declare @objid int,         -- the object id of the table
        @indid smallint,    -- the index id of an index
        @status int,
        @keys nvarchar(2078),-- string build index key list, length = (16*max_id_length)+(15*2)
        @dbname sysname,
        @OrigFillFactor tinyint

    -- Check to see that the object names are local to the current database.
    select @dbname = parsename(@objname,3) 

    if @dbname is not null and @dbname <> db_name()
    begin
            raiserror(15250,-1,-1)
            return (1)
    end

    -- Check to see the the table exists and initialize @objid.
    select @objid = object_id(@objname)
    if @objid is NULL
    begin
        select @dbname=db_name()
        raiserror(15009,-1,-1,@objname,@dbname)
        return (1)
    end

    select @indid = indid, @status = status, @OrigFillFactor = OrigFillFactor
    from sysindexes
    where id = @objid and name = @indname 

    -- IF NO INDEX, QUIT
    if @indid is NULL
    begin
        raiserror(15472,-1,-1) --'Object does not have any indexes.'
        return (1)
    end

    -- First we'll figure out what the keys are.
    declare @i int, @thiskey sysname
    select @keys = index_col(@objname, @indid, 1),
        @i = 2, @thiskey = index_col(@objname, @indid, 2)
    while (@thiskey is not null )
    begin
        select @keys = @keys + ', ' + @thiskey, @i = @i + 1
        select @thiskey = index_col(@objname, @indid, @i)
    end
    -- DISPLAY THE RESULTS
    select 'Status'=@status, 'OrigFillFactor' =@OrigFillFactor, 'Index keys'=@keys
    set nocount off
    return (0) 
end
go

grant execute on sp_oledb_indexinfo to public
go

dump tran master with no_log
go

print ''
print 'creating sp_oledb_ro_usrname'
go

create procedure sp_oledb_ro_usrname
as
begin
    select substring('NY',status/1024&1+1,1),user_name() 
    from master..sysdatabases 
    where name=DB_NAME()
end
go

grant execute on sp_oledb_ro_usrname to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_oledb_ro_usrname' and type = 'P '))
        begin
            drop proc sp_oledb_ro_usrname
            dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_oledb_deflang'
go

if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_oledb_deflang
as
    begin
        select ISNULL(language,'us_english') 
        from master..syslogins 
        where sid=SUSER_SID()
    end
go

grant execute on sp_oledb_deflang to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_oledb_deflang' and type = 'P '))
        begin
            drop proc sp_oledb_deflang
            dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_oledb_defdb'
go

if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

create procedure sp_oledb_defdb
as
    begin
        select dbname from master..syslogins where sid=SUSER_SID()
    end
go

grant execute on sp_oledb_defdb to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_oledb_defdb' and type = 'P '))
        begin
            drop proc sp_oledb_defdb
            dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_oledb_database'
go

create procedure sp_oledb_database
as
    begin
        select name from master..sysdatabases
    end
go

grant execute on sp_oledb_database to public
go

dump tran master with no_log
go

if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_oledb_database' and type = 'P '))
        begin
            drop proc sp_oledb_database
            dump tran master with no_log
        end
    end
go

print ''
print 'creating sp_oledb_language'
go

create procedure sp_oledb_language
as
begin
    select 'English','us_english' 
    union 
    select alias,name from master..syslanguages
end
go

grant execute on sp_oledb_language to public
go

dump tran master with no_log
go
if (charindex('6.00', @@version) > 0 or
    charindex('6.50', @@version) > 0 or
    charindex('7.00', @@version) > 0)
    begin
    if (exists (select * from sysobjects
        where name = 'sp_oledb_language' and type = 'P '))
        begin
            drop proc sp_oledb_language
            dump tran master with no_log
        end
    end
go

/*---------------------------- END OLEDB CATALOG PROCS ------------------------*/


/*---------------------------- BEGIN BCP CATALOG PROCS ------------------------*/

print 'creating sp_tablecollations'
go

/* Used by BCP to gather all the collation names for a table */
if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/* Procedure for 8.0 server */
create procedure sp_tablecollations (@object nvarchar(4000))
as
begin
    select c.colid,
           c.name, 
           tds_collation = c.tdscollation,
           collation_name = BCPCollationName(c.tdscollation, c.xtype)
    from syscolumns c inner join sysobjects t on c.id = t.id
    where t.id = object_id(@object, 'local')
    order by c.colid
end
go

grant execute on sp_tablecollations to public
go

print 'creating sp_bcp_dbcmptlevel'
go

/* Used by BCP to get current db compatibility level */
if (charindex('8.00', @@version) = 0)
begin
    print ''
    print ''
    print 'Warning:'
    print 'you are installing the stored procedures '
    print 'on a pre 8.0 SQL Server.'
    print 'Ignore the following errors.'
end
go

/* Procedure for 8.0 server */
create procedure sp_bcp_dbcmptlevel (@dbname sysname)
as
begin
    select cmptlevel
    from master.dbo.sysdatabases
    where name = @dbname
end
go

grant execute on sp_bcp_dbcmptlevel to public
go

/*---------------------------- END BCP CATALOG PROCS ------------------------*/

dump tran master with no_log
go




if (exists (select * from sysobjects
        where name = 'sp_configure' and type = 'P '))
    begin
        exec sp_configure 'allow updates',0
        reconfigure with override
    end
go

exec sp_MS_upd_sysobj_category 2 /* set category | 2 based on crdate. */

go

if exists (select * from sysobjects where name = 'sp_check_objects'
            and type = 'P ')
    begin
        /* Only supported on 6.0 servers */
        print ''
        print 'Checking objects created by instcat.sql.'

        exec sp_check_objects 'catalog'
    end
go

print ''
print 'instcat.sql completed successfully.'
go

set quoted_identifier off
go

dump tran master with no_log
go
checkpoint
go
/**/
