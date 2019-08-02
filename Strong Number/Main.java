#include <stdio.h>
int main() {
	//Type your code
  int num,fact=1,i,sum=0,n1;
  scanf("%d",&num);
  int numm=num;
  while(num)
  {
    n1=num%10;
    for(i=1;i<=n1;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    fact=1;
    num=num/10;
  }
  if(numm==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}