from z3 import *
from xlrd import *

wb = open_workbook('val.xlsm') 
arr = []
for p in wb.sheets():
	for row in range(p.nrows):
		values=[]
		for col in range(p.ncols):
			values.append(int(p.cell(row,col).value))
		arr.append(values)
s = Solver()

flag = [z3.BitVec("f%d" % i, 32) for i in range(45)]
print(flag)

for i in range(len(flag)):
        s.add(z3.And(flag[i] > 32 , flag[i] <= 125))

for i in range(len(flag)):
	x = 0
	for j in range(len(flag)):
		x=x+arr[i][j]*flag[j]
		if((j+1) == len(flag)):
			print("Entered ",i,j)
			s.add(arr[i][j+1]==x)

print("------------------")

print(s.check())
print(s.model())


