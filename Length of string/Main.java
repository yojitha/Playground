#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int c=0;
  char ch[50];
  gets(ch);
  int i=0;
  while(ch[i]!='\0'|| ch[i]==' ')
  {
    c++;
    i++;
  }
  printf("%d", strlen(ch));
  return 0;
}