#include<stdio.h>
int main()
{
    int a,b;
    printf("Before swap a=");
    scanf("%d",&a);
    printf("Before swap b=");
    scanf("%d",&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("numbers after swapping a=%d b=%d",a,b);
}