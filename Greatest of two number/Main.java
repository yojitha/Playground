#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2;
  scanf("%d%d",&num1,&num2);
  if(num1>num2){
    printf("num1 is the greatest");
  }
  else if(num1==num2)
  {
    printf("Both number equal");
  }
  else
  {
    printf("num2 is the greatest");
  };
  return 0;
}