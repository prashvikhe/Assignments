#include<stdio.h>
int main()
{
int sal,Tx,Tsal;
printf("enter your anual salary ");
scanf("%d",&sal);
if(sal<=150000)
    {
    printf("there wil be 0 percent tax on your anual income ");
    }
else if (sal>150000 && sal<=300000)
    {
    Tx=(sal*20)/100;
    Tsal=sal-Tx;
    printf("there is 20 percent tax on your anual income which is : %d \n and after 20 percent tax your sal is : %d ",Tx,Tsal);
    }
else if (sal>300000)
    {
        Tx=(sal*30)/100;
        Tsal=sal-Tx;
        printf("there is 30 percent tax on your anual income which is %d  and after 30%% tax annual salary becomes : %d ",Tx,Tsal);
    }
}
