reen saver. The idle priority class is inherited by child processes.
Normal - Indicates a normal process with no special scheduling needs.
Realtime - Indicates a process that has the highest possible priority. The threads of a real-time priority class process preempt the threads of all other processes, including operating system processes performing important tasks, and high priority threads. For example, a real-time process that executes for more than a very brief interval can cause disk caches not to flush or cause the mouse to be unresponsive.
Above_Normal - (Windows 2000 and later) Indicates a process that has priority higher than Normal but lower than High.
Below_Normal - (Windows 2000 and later): Indicates a process that has priority higher than Idle but lower than Normal.