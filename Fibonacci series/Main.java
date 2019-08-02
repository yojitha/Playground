#include<stdio.h>
int main()
{
  //Type your code here
  int n1=0,n2=1,n3,n,i;
  scanf("%d",&n);
  printf("%d %d ",n1,n2);
  for(i=0;i<n-2;i++)
  {
    n3=n1+n2;
    printf("%d ",n3);
    n1=n2;
    n2=n3;
  }
  return 0;
}