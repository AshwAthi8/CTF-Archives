from z3 import *

def get_index(n):
    return (0x83f66d0e3 * n + 0x24a452f8e)&0xffffffffffffffff

def options(op,a,b):
        print(op)
        s={0:lambda a,b: a&0xffffffffffffffff,1:lambda a,b: (a+b)&0xffffffffffffffff,2:lambda a,b: (a-b)&0xffffffffffffffff,3:lambda a,b: (a*b)&0xffffffffffffffff,4:lambda a,b: (a*b)&0xffffffffffffffff,5:lambda a,b: (a<<b)&0xffffffffffffffff,6:lambda a,b: (a>>b)&0xffffffffffffffff,7:lambda a,b: (a^b)&0xffffffffffffffff} 
        print(type(op))
        return s.get(op)(a,b)

inp = BitVec("inp",64)
ret = BitVec("ret",64)
ret1 = BitVec("ret1",64)
ret2 = BitVec("ret2",64)
ret3 = BitVec("ret3",64)
ret4 = BitVec("ret4",64)
ret5 = BitVec("ret5",64)
ret6 = BitVec("ret6",64)
ret7 = BitVec("ret7",64)
ind1 = BitVec("ind1",64)
ind2 = BitVec("ind2",64)
ind3 = BitVec("ind3",64)
ind4 = BitVec("ind4",64)
ind5 = BitVec("ind5",64)
ind6 = BitVec("ind6",64)
ind7 = BitVec("ind7",64)
ind8 = BitVec("ind8",64)

ret = options(inp & 0x7,0xcafebabe,inp)
ind1= get_index(inp)
ret1 = options(ind1 & 0x7,ret,ind1)
ind2= get_index(inp)
ret2 = options(ind2 & 0x7,ret1,ind2)
ind3= get_index(inp)
ret3 = options(ind3 & 0x7,ret2,ind3)
ind4= get_index(inp)
ret4 = options(ind4 & 0x7,ret3,ind4)
ind5= get_index(inp)
ret5 = options(ind5 & 0x7,ret4,ind5)
ind6= get_index(inp)
ret6 = options(ind6 & 0x7,ret5,ind6)
ind7= get_index(inp)
ret7 = options(ind7 & 0x7,ret6,ind7)
ind8= get_index(inp)

s=Solver()
s.add(Or(ind8==0x471DE8678AE30BA1, ind8==0xACDEE2ED87A5D886))

print (s.check())
m= s.model()
print ("input ==", m.evaluate(inp))

