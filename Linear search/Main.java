#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[50],search,i,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&search);
  for(i=0;i<n;i++)
  {
    if(arr[i]==search)
    {
      printf("%d",i+1);
      c++;
      break;
    }
  }
  if(c==0)
  {
    printf("%d isn't present in the array.",search);
  }
  return 0;
}