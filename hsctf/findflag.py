def bin2chr(data):
    result = ''
    while data:
        char = data & 0xff
        print char,data,result
        result += chr(char)
        data >>= 8
    return result


print bin2chr(0x6162636465)