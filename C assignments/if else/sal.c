//3. Write a program, which accepts annual basic salary of an employee and calculates and displays the
// Income tax as per the following rules.
// Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20%
// > 3,00,000 Tax = 30%
#include<stdio.h>
int main()
{
    float sal;
    printf("ANual Basic Salary Of An EMployee is : ");
    scanf("%f",&sal);
    if(sal<150000){
        printf("Annual Salary Incuding 0 tax is %f",sal);
    }
    else if(sal>150000 && sal<300000){
    printf("Annual Salary Incuding 20 %% Tax is :  %f ",((sal)-sal*0.2));}
    else if(sal>300000){printf("Annual Salary Incuding 30 %% Tax is : %f ",((sal)-sal*0.3));}
}