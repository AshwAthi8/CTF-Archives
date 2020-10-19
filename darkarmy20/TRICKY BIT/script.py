  
HEADER_SIZE = 54 
ImageFile = "lsb1.bmp"
with open(ImageFile, "rb") as f:
    original_image = f.read()

print(original_image)

f= ""     

for i in range(54,102):
    cu_image_binary = '{0:08b}'.format(ord(original_image[i]))
    if(cu_image_binary[0] == cu_image_binary[-1]):
        f=f+"0"
    else:
        f=f+"1"

fl = ""
for i in range(len(f),8):
    print(f)
    fl = "0b"+fl + chr(int(f[:8]),2)
print(fl) 

