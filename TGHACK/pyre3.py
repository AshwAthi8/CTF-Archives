from itertools import permutations
perms = [''.join(p) for p in permutations(['10','24','31','45','74','67'])]

inputs=[]

s="485984954859"
for i in range(250): 
	inputs.append(perms[i]+s) 

inputs=list(inputs)
for i in range(250): 
	inputs[i]=int(inputs[i],10)

print(inputs)