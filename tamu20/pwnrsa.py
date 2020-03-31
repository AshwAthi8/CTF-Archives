from pwn import *
conn = remote('challenges.tamuctf.com',8573)
conn.recvuntil('Press enter when you are ready.\n')
conn.sendline("\n")

x = int(conn.recvline().strip())

