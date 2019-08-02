#include<stdio.h>
int main()
{
  //Type your code here
  int num,n1,a,b;
  scanf("%d",&num);
  while(num){
    n1=num%10;
    if(num>99)
    {
     a=n1; 
    };
    if(num<10)
    {
      b=n1;
    };
    num=num/10;
  };
  printf("%d",a+b);
  
  return 0;
}