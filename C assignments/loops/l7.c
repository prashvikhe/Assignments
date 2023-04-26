#include<stdio.h>
int main(){
    int a;
    float rect,area,r,l,b;
    float t;
    abc:  
    printf("specify the options below\n1) area of circle\n2)  area of rectangle\n3)  area of triangle\n4)  Exit\nenter option here=");
    scanf("%d",&a);
    while(a!=4){
        if(a==1){
            printf("enter the radius of the circle=");
            scanf("%d",&r);
            area=3.14*r*r;
            printf("area of circle is= %f\n",area);
            goto abc;
            
        }
        else if(a==2){
            printf("enter the lenght and the bridth of the rectangle=");
            scanf("%f %f",&l,&b);
            rect=l*b;
            printf("area of the rectangle is= %f\n",rect);
            goto abc;
        }
        else if(a==3){
            printf("enter the base and height of the triangle=");
            scanf("%f %f",&l,&b);
            t=0.5*l*b;
            printf("area of the triangle is =%f\n",t);
            goto abc;
        }
        else{
            printf("please enter proper options from the above");
            goto abc;
        }

    }
    printf("you exited the program");
}
