#include<stdio.h>
int main()
{
  //Type your code here
  int num,sum=0,n1;
  scanf("%d",&num);
  while(num)
  {
    n1=num%10;
    sum=sum+n1;
    num=num/10;
  };
  printf("%d",sum);
  return 0;
}