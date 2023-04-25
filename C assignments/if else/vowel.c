//4. Accept a lowercase character from the user and check whether the character is a vowel or consonant.
//(Hint: a, e, i, o, u are vowels)
#include<stdio.h>
int main()
{
    char ch;
    int Lc,Uc;
    printf("Enter Char  : ");
    scanf("%c",&ch);
    Lc = (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u');
    Uc = (ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U');
    if (Lc || Uc)
    {
        printf("%c is a Vowel",ch);
    }
    else{
        printf("%c is a Consonent",ch);
    }
    
}