//4. Accept radius from the user and write a program having menu with the following options and
//corresponding actions:
//Options Actions
//1. Area of Circle
//2. Circumference of Circle
//3. Volume of Sphere
#include<stdio.h>
int main()
{
    float pi,r,a,c,v;
    pi=3.14;
    int s;
    printf("enter radious of circle ");
    scanf("%f",&r);
    printf("Enter OPtions\n 1. Area of Circle \n2. Circumference of Circle \n3. Volume of Sphere : ");
    scanf("%d",&s);
    switch(s){
        case 1 :
        a=pi*r*r;
        printf("Area Of circle is : %f",a);
        break;
        case 2 : 
        c=2*pi*r;
        printf("circumference of circle is %f ",c);
        break;
        case 3 :
        v=((4/3)*pi*r*r*r);
        printf("Volume Of sphere is %f",v);
        break;
    }
}