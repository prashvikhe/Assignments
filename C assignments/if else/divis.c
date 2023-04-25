//Write a program to accept a number and check if it is divisible by 5 and 7.
#include<stdio.h>
int main()
{
    int a;
    printf("Enter Number ");
    scanf("%d",&a);
    if(a%5==0){
        printf("number is divisible by 5");
    }
    else if(a%7==0)
    {
        printf("Number is divisible by 7");

    }
    else{
        printf("number is not divisible by 5 and 7");
        
    }
}