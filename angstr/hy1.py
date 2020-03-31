sg="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_{}"
for i in sg:
	if(ord(i)<<1 == 220):
		print(i)

for i in sg:
	k=ord(i)<<8
	if(ord(i)>96):
		l=ord(i)-87

	else:
		l=ord(i)-48

	if((k+l)*65537==1712285199): #889533701   
		print(i)

print(ord("t")<<8+ord("f")<<16+ord("{"))	