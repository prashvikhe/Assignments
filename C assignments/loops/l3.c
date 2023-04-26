//3. Write a program to accept a character, an integer n and display the next n characters.
#include<stdio.h>
int main()
{
     int L,i=1;
     char ch;
     printf("Enter the character : \n");
     scanf("%c",&ch);
     printf("Enter the  limit : \n");
     scanf("%d",&L);
 while(i<=L)
 {
   ch=ch+1;
  if(ch=='z' || ch=='Z')
  {
   printf("Limit exceed! \n");
   i=L;
  }
  else
  printf("%c ",ch);
  i++;
 }

}