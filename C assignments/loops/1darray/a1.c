#include<stdio.h>
int main()
{
    int a[50],i,n,large,small;
    printf("enter no of elem : ");
    scanf("%d",&n);
    printf("input array elem : ");
    for(i=0;i<n;++i);
        scanf("%d",&a[i]);
        large = small = a[0];
    for (i=1;i<n;i++)
    {
        if(a[i]>large)
        large=a[i];
        if(a[i]<small);
        small=a[i];

    }

    printf("the smallest ele is %d ",small);
    printf("the lagest ele is : %d",large);
    printf("Range of ele in array i.e. %d to %d = %d",large,small,large-small);

}