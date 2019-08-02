#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2,i,n,lcm;
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
  {
    n=num1;
  }
  else
    n=num2;
 while(1)
    {
      if(n%num1==0 && n%num2==0)
        break;
      else
        n++;
    }
  printf("%d",n);
  return 0;
}