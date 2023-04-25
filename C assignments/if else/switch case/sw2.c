//2. Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the
//corresponding operation and displays the result.#include<stdio.h>
#include<stdio.h>
int main()
{
    int a,b;
    char c;
    printf("Enter operator as a character (+ - * / )");
    scanf("%c",&c);
    switch(c)
    {
        case '+' : printf(" Enter A and B ");
        scanf("%d %d",&a,&b);
        printf("Sum is : %d ",a+b);
        break;
        case '-' : printf(" Enter A and B ");
        scanf("%d %d",&a,&b);
        printf("SUbstraction is : %d ",a-b);
        break;
        case '*' : printf(" Enter A and B ");
        scanf("%d %d",&a,&b);
        printf("Product is : %d ",a*b);
        break;
        case '/' : printf(" Enter A and B ");
        scanf("%d %d",&a,&b);
        printf("Division is : %d ",a/b);
        break;
    }
}