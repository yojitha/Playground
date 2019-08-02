#include<stdio.h>
int main()
{
  //Type your code here
  int num,n1,count=0;
  scanf("%d",&num);
  while(num)
  {
     if(count==2)
    {
      break;
    };
    n1=num%10;
    count++;
    num=num/10;
   
  };
  printf("%d",n1);
  return 0;
}