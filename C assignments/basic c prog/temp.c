#include<stdio.h>
int main()
{
    float C,F,K;
    printf("Enter Temp in Degree Far. ");
    scanf("%f",&F);
    C=((5*F)-(5*32))/9;
    printf("Temp in degree Calcious is  : %f",C);
    K=C+273.15;
    printf("Temp in degree Kelvin is  : %f ",K);
    
}