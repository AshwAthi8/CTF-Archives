

  
#this is a z3 implementation code
from z3 import * 

x0=Real('x0')
x1=Real('x1')
x2=Real('x2')
x3=Real('x3')


s=Solver()

s.add(And(1545*x0 - 349*x1 + 769*x2 + 1406*x3 == 0,x0>0,x1>0,x2>0,x3>0))
s.add(And(-1064*x0 - 749*x1 - 576*x2 - 81*x3 == 0,x0>0,x1>0,x2>0,x3>0))
s.add(And(301*x0 - 310*x1 - 291*x2 + 2074*x3 == 0,x0>0,x1>0,x2>0,x3>0))
s.add(And(-917*x0 - 1465*x1 - 1122*x2 - 505*x3 ==0,x0>0,x1>0,x2>0,x3>0))

s.check()                   
m = s.model()
print (s.model())
