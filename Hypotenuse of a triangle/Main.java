#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float side1,side2,hyp,h;
  scanf("%f%f",&side1,&side2);
  h=(side1*side1)+(side2*side2);
  hyp=sqrt(h);
  printf("%.2f",hyp);
  return 0;
}