st=0
stack=[]
stack_top= -1

def push(q):
  global stack_top,st
  if(stack_top>4094):
    print("Stack overflow")
  stack_top=stack_top+1
 # print(stack)
  stack.append(q)


def pop():
  global stack_top,st
  a=stack_top
  stack_top=stack_top-1
  if(st<0):
    print("Stack underflow")
  return stack[a]


check_prog=[17,
  0,
  17,
  12596,
  17,
  14668,
  17,
  14500,
  17,
  14668,
  17,
  14696,
  17,
  14724,
  17,
  14500,
  17,
  14724,
  17,
  14668,
  17,
  14528,
  17,
  14500,
  17,
  14752,
  17,
  13436,
  17,
  12904,
  17,
  13268,
  17,
  12848,
  17,
  12848,
  17,
  13268,
  17,
  13352,
  17,
  13436,
  17,
  12876,
  17,
  13156,
  17,
  13436,
  17,
  12820,
  17,
  13044,
  17,
  13268,
  17,
  12932,
  17,
  12652,
  17,
  13212,
  17,
  13380,
  17,
  13072,
  17,
  13240,
  19,
  3735929054,
  11,
  3735929054,
  17,
  68,
  16,
  3735929054,
  0,
  3735929054,
  17,
  10,
  2,
  3735929054,
  17,
  1337,
  4,
  3735929054,
  17,
  191,
  5,
  3735929054,
  17,
  4095,
  9,
  3735929054,
  12,
  3735929054,
  10,
  3735929054,
  17,
  2,
  14,
  3735929054,
  9,
  3735929054,
  11,
  3735929054,
  17,
  33,
  16,
  3735929054,
  17,
  69,
  1,
  3735929054,
  17,
  114,
  1,
  3735929054,
  17,
  114,
  1,
  3735929054,
  17,
  111,
  1,
  3735929054,
  17,
  114,
  1,
  3735929054,
  17,
  10,
  1,
  3735929054,
  17,
  1,
  20,
  3735929054,
  17,
  65,
  1,
  3735929054,
  17,
  99,
  1,
  3735929054,
  17,
  99,
  1,
  3735929054,
  17,
  101,
  1,
  3735929054,
  17,
  115,
  1,
  3735929054,
  17,
  115,
  1,
  3735929054,
  17,
  32,
  1,
  3735929054,
  17,
  103,
  1,
  3735929054,
  17,
  114,
  1,
  3735929054,
  17,
  97,
  1,
  3735929054,
  17,
  110,
  1,
  3735929054,
  17,
  116,
  1,
  3735929054,
  17,
  101,
  1,
  3735929054,
  17,
  100,
  1,
  3735929054,
  17,
  10,
  1,
  3735929054,
  17,
  0,
  20,
  3735929054]

instr = ['in','out','add','sub','mul','div','mod','and','or','xor','not','cmp','neg','sar','shl','jump','JumpZ','Push_next','pop','peak','nop','exit']

types = {'in':0,'out':0,'add':2,'sub':2,'mul':2,'div':2,'mod':2,'and':2,'or':2,'xor':2,'not':1,'cmp':1,'neg':1,'sar':2,'shl':2,'jump':1,'JumpZ':1,'Push_next':3,'pop':1,'peak':4,'nop':5,'exit':6}


while(st<len(check_prog)/2):
  w=st
  if(w>99):
    break

  opcode=check_prog[2*st]
  inst=instr[opcode]
  if(types[inst]==0):
    print(inst+' ')
    if(inst=='in'):
      push(input())


    elif(inst=='out'):
      l=pop()
      if(l>0x7f):
        print("put not ascii")
        break
      print(l)


  elif(types[inst]==1):
    a=pop()
    print(inst,a)
    if(inst=='neg'):
      a=a*(-1)
      push(a)
    elif(inst=='not'):
      push(~a)
    elif(inst=='jump'):
      st=a
    elif(inst=="JumpZ"):
      p=st+1
      a=pop()
      if(a==0):
        a=p
      st=a
    elif(inst=='pop'):
      st=w+1

    elif(inst=="cmp"):
      if(a==0):
        push(0)

  elif(types[inst]==2):
    pop1=pop()
    pop2=pop()

    print(inst,(pop1),pop2)
    if(inst=='add'):
      push(pop1+pop2)
    elif(inst=='sub'):
      push(pop1-pop2)
    elif(inst=='mul'):
      push(pop1*pop2)
    elif(inst=="div"):
      push(pop1/pop2)
    elif(inst=='mod'):
      push(pop1%pop2)
    elif(inst=='and'):
      push(pop1 & pop2)
    elif(inst=='or'):
      push(pop1 | pop2)
    elif(inst=='xor'):
      push(pop1^pop2)
    elif(inst=='sar'):
      push(pop1>>pop2)
    elif(inst=='shl'):
      push(pop1<<pop2)



  elif(types[inst]==3):    
    a=check_prog[2*st+1]
    push((a))
    print(inst+" "+str(a))
    
    st=w+1

  elif(types[inst]==4):
    a=stack[stack_top]
    push(a)
    print(inst+' '+str(a))
    st=1+w
    continue

  elif(types[inst]==5):
    pop()
    print(inst)
    exit()
  elif(types[inst]==6):
    exit()

st=st+1




  
