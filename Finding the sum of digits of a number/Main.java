#include <stdio.h>
int main() {
	//Type your code
  int num,n1,sum=0;
  scanf("%d",&num);
  while(num)
  {
    n1=num%10;
    num=num/10;
    sum=sum+n1;
  }
  printf("%d",sum);
	return 0;
}