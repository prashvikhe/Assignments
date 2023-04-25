//5. Write a program having menu that has three options - 
//add, subtract or multiply two fractions. The two
//fractions and the options are taken as input and the result is 
//displayed as output. Each fraction is read as
//two integers, numerator and denominator.
#include<stdio.h>
int main()
{
    int nom1,den1,nom2,den2,mul,sub,add,opr;
    printf("ENTER NOM 1 : ");
    scanf("%d",&nom1);
    printf("ENTER den 1 : ");
    scanf("%d",&den1);
    printf("ENTER NOM 2 : ");
    scanf("%d",&nom2);
    printf("ENTER den 2 : ");
    scanf("%d",&den2);
    printf("ENTER case for add=1 sub=2 multi=3  :  ");
    scanf("%d",&opr);
    //for add=1 sub=2 multi=3
    switch (opr){
        case 1 : 
        add = (((nom1*den2)+(nom2*den1))/(den1*den2));
        printf("add = %d ",add);
        break;

        case 2 :
        sub = (((nom1*den2)-(nom2*den1))/(den1*den2));
        printf("sub = %d ",sub);
        break;

        case 3 : 
        mul = ((nom1*nom2)/(den1*den2));
        printf("mul = %d ",mul);

    }
}