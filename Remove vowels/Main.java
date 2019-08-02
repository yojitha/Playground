#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int i=0,j;
  while(str[i]!='\0')
  {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
    {
      for(j=i;j<strlen(str);j++)
      {
        str[j]=str[j+1];
      }
      str[j+1]='\0';
      i--;
    }
    i++;
 }
  printf("%s",str);
  
  
  //Type your code here
  
  return 0;
}