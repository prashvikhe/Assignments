//3. Accept two numbers in variables x and y from the user and perform the following operations
//Options Actions
//1. Equality Check if x is equal to y
//2. Less Than Check if x is less than y
//3. Quotient and Remainder Divide x by y and display the quotient and
//remainder
//4. Range : Accept a number and check if it lies between x and y (both
//inclusive)
//5. Swap : Interchange x and y
#include<stdio.h>
int main()
{
    int x,y,a,r,q,z,temp;
    printf("ENTER Two integers x & Y : ");
    scanf("%d %d",&x,&y);
    printf("Enter Options 1 2 3 4 5 : ");
    scanf("%d",&a);
    switch(a){
        case 1 :
        if (x==y){
            printf(" x and y are equal");
        }
        else {
            printf("x and y are not equal");
            break;
        }
        case 2 : 
        if(x<y){
            printf(" Y is Greater than X ");
        }
        else {
            printf("X is GREATER THAN Y");
        }   
        break; 

        case 3 :
        q=x/y;
        r=x%y;
        printf(" Quotient is : %d and Remainder is : %d",q,r);
        break;

        case 4:
        if(x>y && x>z && z>y){
            printf(" Z lies between X and Y");
        }
        else if (y>x && y>z && z>x){
            printf("Z lies Between Y and X");

        }
        else{printf("z not lies between x and y");
        }
        break;
        
        case 5 :
        temp=x;
        x=y;
        y=temp;
        printf("After Swap X = %d  and Y=  %d",x,y);
        break;
    }
}