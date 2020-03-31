# uncompyle6 version 3.6.4
# Python bytecode 2.7 (62211)
# Decompiled from: Python 3.6.9 (default, Nov  7 2019, 10:44:02) 
# [GCC 8.3.0]
# Embedded file name: task.py
# Compiled at: 2018-09-21 00:01:08
from hashlib import md5
from base64 import b64decode
from base64 import b64encode
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
import random

class cipher:

    def __init__(self, key):
        self.key = md5(key.encode('utf8')).digest()
        self.padd = 0

    def encrypt(self, data):
        iv = get_random_string('AAAAAAAAAAAAAAAA')
        self.cipher = AES.new(self.key, AES.MODE_CBC, iv)
        ta = self.cipher.encrypt(self.pad(data))
        return b64encode(iv + ta)

    def decrypt(self, data):
        raw = b64decode(data)
        self.cipher = AES.new(self.key, AES.MODE_CBC, raw[:AES.block_size])
        x = self.cipher.decrypt(raw[AES.block_size:])
        return self.unpad(x)

    def pad(self, strr):
        x = 16 - len(strr) % 16
        final = strr + chr(x) * x
        self.padd = x
        return final

    def unpad(self, strr):
        return strr[:len(strr) - self.padd]


def get_random_string(strr):
    ch = ''
    for i in range(len(strr)):
        ch += chr(random.randint(23, 255))

    return ch


def phase1(arg1, arg2):
    res = ''
    for i in range(len(arg1)):
        res += chr(ord(arg1[i]) ^ ord(arg2[i]))

    return res


def main():
    random.seed(2020)
    last_ci = 'tMGb4+vbwHmn1Vq826krTWNtO0YHhOxrgz0SxBmsKiiV6/PlMyy1cavIOWuyCo8agFAOSDZhDY9OLXaKDqiFGA=='
    last_ci = b64decode(last_ci)
    print 'Welcome to SECURINETS CTF!'
    username = raw_input('Please enter the username:')
    password = raw_input('Please enter the password:')
    cipher1 = username + password
    tmp = get_random_string(cipher1)
    res = phase1(cipher1, tmp)
    cipher2 = ''
    for i in range(len(cipher1)):
        cipher2 += chr(ord(res[i]) + 1)

    cipher2 = cipher2[::-1]
    tool = cipher('securinets')
    last_c = tool.encrypt(cipher2)
    last_c = b64decode(last_c)
    if last_c == last_ci:
        print 'Good job!\nYou can submit with securinets{%s}' % (username + ':' + password)
    else:
        print ':( ...'


if __name__ == '__main__':
    main()
# okay decompiling tasknew.pyc
