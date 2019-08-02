#include<stdio.h>
#include<string.h>

int main()
{
  //Type your code here
  char ch[50];
  int res=1,i;
  gets(ch);
  for(i=0;i<strlen(ch);i++)
  {
    if(ch[i]==' ')
      res++;
  }
  printf("%d",res);
  
}