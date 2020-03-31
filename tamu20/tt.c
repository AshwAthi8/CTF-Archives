 
#include <stdlib.h> 
#include <stdio.h> 
#include <time.h>  
#define Size 50
int main() 
{ 
  
    struct tm* local; 
    time_t t = time(0); 
  	char MY_TIME[Size]; 
    // Get the localtime 
    char np;
    local = localtime(&t); 
  	strftime(MY_TIME, 0x32uLL,"%Y-%m-%dT%H:%M:%S%Z", local); 
    printf("Formatted date & time : %s\n", MY_TIME ); 
    strftime(&np, 5uLL, "%M", local);
    printf("Month : %d\n", np ); 
  
    return 0; 
} 