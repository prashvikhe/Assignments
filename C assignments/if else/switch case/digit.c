//Accept a single digit from the user and display it in words.
// For example, if digit entered is 9, display Nine.
#include<stdio.h>
int main()
{
    int A;
    printf("Enter Single digit No. 1 to 9 : ");
    scanf("%d",&A);
    switch(A){
        case 1 : printf("ONE");
        break;
        case 2 : printf("TWO");
        break;
        case 3 : printf("THREE");
        break;
        case 4 : printf("FOUR");
        break;
        case 5 : printf("FIVE");
        break;
        case 6 : printf("SIX");
        break;
        case 7 : printf("SEVEN");
        break;
        case 8 : printf("EIGHT");
        break;
        case 9 : printf("NINE");
        break;
    }
}