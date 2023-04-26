//2. Write a program to accept two integers x and n and compute x raised to n.
#include<stdio.h>
int main()
{
    int x,n,pow=1,j=1;
    printf("enter x and n : ");
    scanf("%d %d",&x,&n);
     pow=x;
     while(n!=j) {
                     pow=pow*x;
                        j++;
                 }
 printf(" %d to the power %d = %d",x,n,pow);
}

    