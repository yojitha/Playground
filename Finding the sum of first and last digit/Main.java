#include <stdio.h>
int main() {
	//Type your code
  int num,n1,first,last;
  scanf("%d",&num);
  last=num%10;
  while(num)
  {
    n1=num%10;
    if(num<10)
      first=n1;
    num=num/10;
  }
  printf("%d",first+last);
	return 0;
}