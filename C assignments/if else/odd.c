//Write a program to accept an integer and check if it is even or odd.
#include<stdio.h>
int main()
{
    int a;
    printf("enter num ");
    scanf("%d",&a);
    if(a%2==0)
    {printf("Number is even \n ");
    }
    else
     {
        printf("Number is Odd ");
    }
}