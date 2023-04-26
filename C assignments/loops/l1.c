//1. Write a program that accepts numbers continuously as long as
//  the number is positive and prints the
// sum of the given numbers.
#include<stdio.h>
int main()
{
    int i,sum=0;
    printf("Enter Number to add :  ");
    scanf("%d",&i);
    while(i>0)
    {
        sum=sum+i;
        scanf("%d",&i);

    }
    printf("sum =%d",sum);


}