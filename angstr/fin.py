from Crypto.Util.number import *
import string

def leftRotate(n, d): 
  
    # In n<<d, last d bits are 0. 
    # To put first 3 bits of n at  
    # last, do bitwise or of n<<d 
    # with n >>(INT_BITS - d)  
    return (n << d)|(n >> (32 - d)) 
  

k=[]

with open("gdb.output") as f:
	for line in f:
		k.append(bytes_to_long((line.split(":")[1][:-1][2:]).decode("hex")))

print(k)

for i in string.printable():
	for j in range(0,len(k)-3,3):
		for g in range(8):
			#k[j] v9 
			f=leftRotate(i,g)&1
			if(k[j+2]&1):	
				k[j+2]^=1
				 