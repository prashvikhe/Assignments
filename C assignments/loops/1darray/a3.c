#include<stdio.h>

int main()
{
int a[50],i,m,p,j=0;
printf("enter the number of elements=");
scanf("%d",&p);
printf("enter the elements=");
for(i=0;i<p;i++)
    {
         scanf("%d",&a[i]);
    }
printf("enter the no you want to the occurance of");
scanf("%d",&m);
for(i=0;i<p;i++)
{
     if(a[i]==m)
     {
        j++;
     }

}
printf("your number's occurance is %d times inside the array",j);
}
