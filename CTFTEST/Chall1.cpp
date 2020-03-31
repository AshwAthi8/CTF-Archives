#include <iostream>
#include <stdlib.h>
#include <sys/ptrace.h>
#include <string.h>
#include <unistd.h>
#include <ctype.h>


using namespace std;


class Question
{
	
	int millisecond=1000000;
	char Flag[100];
	int count=0;
	public:
		void Welcome();
		void Pass1();
		void Pass2();
		void Pass3();
		char YouKnow(char);


};



void Question::Welcome()
{
	char y;
	cout<<"On one of their Adventures the Meddling Kids and their Dog found themselves in troble,Shaggy was captured by The Ghost of Captain Cutle\n";
	cout<<"He is locked in a cave underwater.\n\n";
	cout<<"This room is locked with 3 passcodes.Can You help Scooby and the Gang to Get the passcodes and Save Shaggy.? <y/n>";
	cin>>y;
	if(y=='y')
	{
		cout<<"Good Choice\n";
		usleep(millisecond);
		Pass1();
	}
	else
	{
		cout<<"\nShaggy was Lost forever\n";
		exit(0);
	}

}


void Question::Pass1()
{
	char n[30],a[]="Good_Old_Times";
	cout<<"Enter Passcode : ";
	cin>>n;
	if(strcmp(a,n)==0)
	{
		cout<<"\nFred: Good Job\n";
		usleep(millisecond);
		Pass2();
	}
	else
	{
		cout<<"Velma: How did you Even Start with Reversing.....";
		exit(0);
	}

}

void Question::Pass2()
{
	char a[30],b[]="QWERTYUIOP[ASDFGHJKL;ZXCVBNM,qwertyuioplkjhgfdsazxcv_bnm0987654321!";
	int n,i,k,j,lFlag=0;
/*	if(check!=1)
	{
		cout<<"Ha Ha Ha No Skipping";
		exit(0);
	}*/
	k=strlen(b);
	cout<<"Second Pass Phrase : ";
	cin>>a;                                                                                   //Pass:A_Tr1P_D0Wn_Th
	n=strlen(a);
	char c[n];										 //Pass:3_Sc0oBy_L4n3
	for(i=0;i<n;i++)
	{	
	 	for(j=0;j<k;j++)
		{

			if(a[i]=='!')
			{
				c[i]='Q';
			}
			if(a[i]==b[j])
			{
					c[i]=b[j+1];
			}
		}
		
	}
	char d[]="SbYt![bF9EmbYg";
	for(i=0;i<n;i++)
	{
		if(d[i]!=c[i])
		{
			lFlag=1;
			break;
		}
	}
	if(lFlag==0)
	{
		cout<<"Daphne: You are Smarter than i thought.\n";

		usleep(millisecond);
		for(i=count;i<n;i++)
		{
			Flag[i]=a[i];
		}
		Pass3();
	}
	else
	{
		cout<<"Velma:Not Good enough.....Try Harder....";
		exit(0);
	}
			
	
}
void Question::Pass3()
{
	char a[30],t;
	int i,n,j;
	cout<<"\nEnter the 3rd Pass : ";
	cin>>a;
	n=strlen(a);
	char b[n];
	char c[]="4@Fp1bOl@Y5a4U";
	for(i=0;i<n;i++)
	{
		b[i]=YouKnow(a[i]);

	}
	for(i=0,j=0;i<j;i++,j--)
	{
		t=b[i];
		b[i]=b[j];
		b[j]=t;
	}
	if(strcmp(b,c)==0)
	{		cout<<"Scooby Doo:Scooby Dooby Dooooooo...........You Found Shaggy .....\nShaggy: Thank u ,";
		cout<<"Here is  your Flag ";
		cout<<"bi0s{"<<Flag<<a<<"}";
		exit(0);
	}
	else
	{
		cout<<"Shaggy:Why Lord.........";
		cout<<"Game Over";
		exit(0);
	}
}
char Question::YouKnow(char c)
{
	if (c >= 'a' && c <= 'm')
        {
            c += 13;
        }
        else if (c >= 'n' && c <= 'z')
        {
            c -= 13;
        }
        else if (c >= 'A' && c <= 'M')
        {
            c += 13;
        }
        else if (c >= 'N' && c <= 'Z')
        {
            c -= 13;
        }
	else if(c>='0' && c<='9')
	{
		if(c=='9')
		{
			c=0;
		}
		else
		{
			c++;
		}
	}
	else if(c=='_')
	{
		c='@';
	}
	else
	{
		c=c;
	}
	return c;
}

int main()
{
	Question R;
	R.Welcome();
	return 0;
}
