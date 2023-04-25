//Write a program to accept 3 numbers and compute minimum and maximum from them.
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Num A & B & C ");
    scanf("%d %d %d",&a,&b,&c);
    if(a>b && b>c){
        printf(" A IS MAX");
        }
        else if(b>a && a>c){
            printf(" B IS MAX");
        }
        else{
            printf(" C is Max");
        }
    }
