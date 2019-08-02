#include<stdio.h>
int main()
{
	//type your code here
  int ind;
  scanf("%d",&ind);
  if(ind==1 || ind==2)
    printf("%d",0);
  else if(ind%2==1)
    printf("%d",ind-1);
  else
    printf("%d",(ind/2)-1);
	
}