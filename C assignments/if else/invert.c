//7. Write a C program to accept a character and invert the case of it.
#include<stdio.h>
int main()
{
    char a,b;
    printf("Enter Character ");
    scanf("%c",&a);
    if(a>=65 && a<=90){
        b=a+32;
        printf("Character After Inversion : %c ",b);

    }
    else if (a>=97 && a<=122){
        b=a-32;
        printf(" Character After Inversioin : %c ",b);
    }
}