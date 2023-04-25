// 6. Accept dimensions of a cylinder and print the surface area and volume (Hint: surface area = 2πr 2 + 2πrh,
// volume = π r 2 h). Define a constant variable pi=3.14.
#include<stdio.h>
int main()
{
    float pi=3.14;
    float r;
    printf("Specify redious of cyl ");
    scanf("%f",&r);
    float h;
    printf("Specify height of cyl ");
    scanf("%f",&h);
    float v=pi*r*r*h,a=(2*pi*r*r)+2*pi*r*h;
    printf("area is %f and volume is %f",a,v);



}