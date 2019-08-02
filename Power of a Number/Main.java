#include <stdio.h>
int main()
{
  	//Your code here
 long int b,e,i;
  long int v;
  scanf("%ld%ld",&b,&e);
  v=b;
  if(e>0)
  {
  for(i=1;i<e;i++)
  {
    v=v*b;
  }
  printf("%ld",v);
  }
  else if(e==0)
    printf("%d",1);
  else
    printf("Wrong input");
    return 0;
}