#include<stdio.h>
int main()
{
    int a,b;
    printf("Numbers before Swapping a= ");
    scanf("%d",&a);
    printf("b= ");
    scanf("%d",&b);
    int c=a;
    a=b;
    b=c;
    printf("numbers after swapping a=%d b=%d ",a,b);

    
}