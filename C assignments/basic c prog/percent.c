#include<stdio.h>
int main()
{
    float sub1,sub2,sub3,sub4,sub5;
    printf("\nENTER MARKS FOR SUB 1 : ");
    scanf("%f",&sub1);
    printf("\nENTER MARKS FOR SUB 2 : ");
    scanf("%f",&sub2);
    printf("\nENTER MARKS FOR SUB 3 : ");
    scanf("%f",&sub3);
    printf("\nENTER MARKS FOR SUB 4 : ");
    scanf("%f",&sub4);
    printf("\nENTER MARKS FOR SUB 5 : ");
    scanf("%f",&sub5); 
    float total=(sub1+sub2+sub3+sub4+sub5);
    float percent=total/5.0;
    printf("Percentage is %f ",percent);


}