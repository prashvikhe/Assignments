//Write a C program to input angles of a triangle and check whether triangle is valid or not.
#include<stdio.h>
int main()
{
    int A,B,C,T;
    printf("Enter Angle  A B AND C");
    scanf("%d  %d  %d",&A,&B,&C);
    T=(A+B+C);
    if(T==180)
    {
        printf("Triangle is Valid ");

    }
    else{
        printf("Triangle is Not VAlid ");

    }

}