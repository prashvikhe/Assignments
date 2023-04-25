#include<stdio.h>
int main()
{
    float BS;
    printf("Enter The Basic salary in Rs.: ");
    scanf("%f",&BS);
    float HRA=(0.05*BS),DA=(0.08*BS),TAX=(0.03*BS),PF=(0.02*BS);
    float Net_sal=BS+HRA+DA-PF-TAX;
    printf("Net Salary of an employee is : Rs. %f",Net_sal);


}