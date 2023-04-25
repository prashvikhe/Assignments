#include<stdio.h>
int main()
{
    int r;
    printf("Enter The radious of circle: ");
    scanf("%d",&r);
    float pi=3.14;
    float area=pi*r*r,circumference=2*pi*r;
    printf("\n area of circle is : %f",area);
    printf("\n circumference of circle is : %f ",circumference);
    return 0;
    
}