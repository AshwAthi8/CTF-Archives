s="ASIS{ASHWATHIASH_WATERLOOSSUPQWER_123456789012345}"
k1=[]
k2=[]
k3=[]
for i in range(len(s)):
	if(i>=0 and i< 16):
		if(s[i]!="_" and s[i]!="{"):
			k1.append(ord(s[i])-55)
		else:
			k1.append(0)

	if(i>16 and i<=32):
		k2.append(ord(s[i])-55)

	if(i>33 and i < 50):
		if(s[i]!="}" ):
			k3.append(ord(s[i]))
		else:
			k3.append(0)
print(k1[:4],"	 ",k3[:4],"	 ",k3[:4])
print(k1[4:8],"	  ",k2[4:8],"	",k3[4:8])
print(k1[8:12],"	",k2[8:12],"	",k3[8:12])
print(k1[12:16],"     ",k2[12:16],"	   ",k3[12:16])
