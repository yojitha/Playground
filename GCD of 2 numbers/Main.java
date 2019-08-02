// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int i,num1,num2,n,gcd;
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
    n=num2;
  else
    n=num1;
  for(i=1;i<=n;i++)
  {
    if(num1%i==0 && num2%i==0)
      gcd=i;
  }
  printf("%d",gcd);
  
   return 0;
}