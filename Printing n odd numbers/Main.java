#include <stdio.h>
int main() {
	//Type your code
  int n,i,count=0;
  scanf("%d",&n);
  for(i=0;;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
      count++;
    }
    if(count==n)
      break;
  }
	return 0;
}