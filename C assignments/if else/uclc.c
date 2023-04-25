#include<stdio.h>
int main()
{
char m;
printf("enter any alphabet from a to z=");
scanf("%c",&m);
if(m>=65 && m<=90){
    printf("your entered char is in uppercase");
}
if(m>=97 && m<=122){
    printf("your entered char is in lowercase");
}
}
