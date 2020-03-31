import angr
import claripy
def main():
    proj = angr.Project('./angrmanagement', load_options={"auto_load_libs": False})
    input_size = 32;
    argv1 = claripy.BVS("argv1", input_size * 8)
    initial_state = proj.factory.entry_state()
    initial_state.libc.buf_symbolic_bytes=input_size + 1
    for byte in argv1.chop(8):
    	initial_state.add_constraints(byte != '\x30') # null
    	initial_state.add_constraints(byte > ' ') # '\x20'
    	initial_state.add_constraints(byte < '~') # '\x7e'
    sm = proj.factory.simulation_manager(initial_state)
    sm.explore(find=0x402360, avoid=0x4023b2)
    found = sm.found[0]
    solution = found.solver.eval(argv1, cast_to=bytes)
    print(solution)


main()

