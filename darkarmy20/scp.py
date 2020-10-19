import binascii
import sys
 
target = "56250434"
init = "\x49\x48\x44\x52\x00\x00\x00\x00\x00\x00\x00\x00\x08\x06\x00\00\x00"
 
start = 0x00
end = 0xFF
for h2 in xrange(start, end+1) :
        for w2 in xrange(start, end+1) :
                for w1 in xrange(start, end+1) :
                        for h1 in xrange(start, end+1) :
                                tmp = init[:6]+chr(w2)+chr(w1)+init[9:11]+chr(h2)+chr(h1)+init[12:]
                                if hex(binascii.crc32(tmp)&0xffffffff).lstrip("0x").upper()==target :
                                        print "Width : "+str(int(''.join('%02x' % i for i in [w2, w1]), 16))
                                        print "Height : "+str(int(''.join('%02x' % i for i in [h2, h1]), 16))
                                        print "w2 : {:02x} | ".format(w2),
                                        print "w1 : {:02x}".format(w1)
                                        print "h2 : {:02x} | ".format(h2),
                                        print "h1 : {:02x}".format(h1)
                                        print "Chunk : \n\t"+binascii.hexlify(tmp)
                                        print "CRC : \n\t"+hex(binascii.crc32(tmp)&0xffffffff).lstrip("0x").upper()
                                        sys.exit()
