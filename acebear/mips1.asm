	.text
	li  $t0, 0x0000000e
	li $t1, 0x0000000d
	li $t2, 0x0000000c
	
	sub $sp, $sp, 12
	sw  $t0, 8($sp)
	sw  $t1, 4($sp)
	sw  $t2, 0($sp)	
	li $v0, 1
	li $a0, 0xabcde
	# la $a1, ($sp)
	syscall
