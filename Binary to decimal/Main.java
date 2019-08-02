#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int n,n1;
  int j=0,i=0,arr[50],sum=0;
  scanf("%ld",&n);
  while(n)
  {
    n1=n%10;
    arr[i++]=n1;
    n=n/10;
  }
  arr[i]=n;
  for(j=0;j<i;j++)
  {
    sum=sum+(arr[j]*pow(2,j));
  }
  printf("%d",sum);
  return 0;
}