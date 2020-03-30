from z3 import *
from xlrd import *
wb = open_workbook('val.xlsm')
arr = []
for sb in wb.sheets():
    for row in range(sb.nrows):
        values = []
        for col in range(sb.ncols):
            values.append(int(sb.cell(row,col).value))
        arr.append(values)
#rint(arr)
s=Solver()

cmparray=[490493,-7845,-54593,210672,-407144,533417,-320176,-83622,147210,-344141,507384,429295,-272727,309196,-247072,-382979,-29820,-665472,-51995,-224011,-16181,-91699,-572802,-440533,-442324,-29239,-585661,106807,-412046,1312536,44628,232490,-383077,436266,107084,-117467,309109,71961,21720,49050,-84381,-302598,-52964,209341,102350]
k = [
BitVec("k[0]", 8),
BitVec("k[1]", 8),
BitVec("k[2]", 8),
BitVec("k[3]", 8),
BitVec("k[4]", 8),
BitVec("k[5]", 8),
BitVec("k[6]", 8),
BitVec("k[7]", 8),
BitVec("k[8]", 8),
BitVec("k[9]", 8),
BitVec("k[10]", 8),
BitVec("k[11]", 8),
BitVec("k[12]", 8),
BitVec("k[13]", 8),
BitVec("k[14]", 8),
BitVec("k[15]", 8),
BitVec("k[16]", 8),
BitVec("k[17]", 8),
BitVec("k[18]", 8),
BitVec("k[19]", 8),
BitVec("k[20]", 8),
BitVec("k[21]", 8),
BitVec("k[22]", 8),
BitVec("k[23]", 8),
BitVec("k[24]", 8),
BitVec("k[25]", 8),
BitVec("k[26]", 8),
BitVec("k[27]", 8),
BitVec("k[28]", 8),
BitVec("k[29]", 8),
BitVec("k[30]", 8),
BitVec("k[31]", 8),
BitVec("k[32]", 8),
BitVec("k[33]", 8),
BitVec("k[34]", 8),
BitVec("k[35]", 8),
BitVec("k[36]", 8),
BitVec("k[37]", 8),
BitVec("k[38]", 8),
BitVec("k[39]", 8),
BitVec("k[40]", 8),
BitVec("k[41]", 8),
BitVec("k[42]", 8),
BitVec("k[43]", 8),
BitVec("k[44]", 8)]

s.add(k[0]==ord('V'))
s.add(k[1]==ord('o'))
s.add(k[2]==ord('l'))
s.add(k[3]==ord('g'))
s.add(k[4]==ord('a'))
s.add(k[5]==ord('C'))
s.add(k[6]==ord('T'))
s.add(k[7]==ord('F'))
s.add(k[8]==ord('{'))
s.add(k[44]==ord('}'))

for i in range(len(k)):
    s.add(z3.And(k[i] > 32 , k[i] <= 125))

for i in range(len(k)):
    x = 0
    for j in range(len(k)):
        x=x+arr[i][j]*k[j]

    s.add(arr[i][j+1]==x)
    print("----ADDED",i,"-----")

print("--------------------------------")
while(s.check() == sat):
    print("-----checking----")
    m = (s.model())
    w = ''
    for i in range(45):
        w += chr(m[k[i]].as_long())
    print(w)
print("--------------------------------")
#VolgaCTF{7h3_M057_M47h_cr4ckM3_y0u_3V3R_533N}