#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,length=0,n1,sum=0;
  scanf("%d",&num);
  int numm=num;
  int nummm=num;
  while(num)
  {
    num=num/10;
    length++;
  }
  while(numm)
  {
    n1=numm%10;
    sum=sum+pow(n1,length);
    numm=numm/10;
  }
  if(nummm==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}