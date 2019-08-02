#include <stdio.h>
int main() {
	//Type your code
  int num,n1,number;
  scanf("%d",&num);
  while(num>10)
  {
    n1=num%10;
    num=num/10;
  }
  printf("%d",n1);
	return 0;
}