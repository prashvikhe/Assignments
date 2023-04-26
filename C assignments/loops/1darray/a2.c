// #include<stdio.h>
// int main()
// {
//     int a[50],key,n,i;
//     printf("enter the no of elements :  ");
//     scanf("%d",&n);
//     printf("enter the elements : ");
//     for(i=0;i<n;i++);
//     {
//         scanf("%d",&(a[i]));

//     }

//     printf("enter key = ");
//     scanf("%d",&key);

//     for(i=0;i<n;i++)
//     {
//         if(a[i]==key)
//         {
//             printf("the key : %d is inside the class",key);

//         }
//         else{
//             printf("Key : %d is not inside the class",key);
//         }
//     }
// }



#include<stdio.h>

int main()
{
int a[50],i,m,p;
printf("enter the number of elements=");
scanf("%d",&p);
printf("enter the elements=");
for(i=0;i<p;i++)
    {
         scanf("%d",&a[i]);
    }
printf("enter key=");
scanf("%d",&m);

for(i=0;i<p;i++)
    {
         if(a[i]==m)
        {
            printf("your key is inside the ray");
            return 0;
        }
    
    }
printf("your key is not inside the array");
}
