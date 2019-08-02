#include<stdio.h>
int main()
{
  //Type your code here
  int num,arr[30],rem,i=0,c=0;
  scanf("%d",&num);
  while(num!=0 && num!=1)
  {
    rem=num%2;
    arr[i++]=rem;
    c++;
    num=num/2;
  }
  arr[i++]=num;
  //printf("%d",num);
  for(i=c;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}