#include<stdio.h>
#include<string.h>
int main()
{
  char arr[50];
  int temp=1;
  scanf("%s",arr);
  int i=0;
  //printf("%d",strlen(arr));
  if(strlen(arr)<=20)
  {
  while(arr[i]!='\0')
  {
    if(arr[i]==arr[i+1])
    {
      temp++;
    }
    else
    {
      printf("%c",arr[i]);
      printf("%d",temp);
      temp=1;
    }
    i++;
  }
  }
  else
  {
    printf("Invalid Input");
  }
	//type your code here
  return 0;
}