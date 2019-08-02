#include<stdio.h>
int main()
{
  //type your code here
  char ch;
  int c=0;
  scanf("%c",&ch);
  char stt[]="AEIOUaeiou";
  int i=0;
  while(stt[i]!='\0')
  {
    if(ch==stt[i])
    {
      c++;
      break;
    }
    i++;
  }
 if(c==0)
   printf("Consonant");
 else
   printf("Vowel");
  return 0;
}