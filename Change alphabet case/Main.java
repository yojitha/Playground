#include <stdio.h>
int main() {
	// Type your code here
  char ch;
  int val;
  scanf("%c",&ch);
  val=(int)ch;
  if(val>=97 && val<=123)
  {
    val=val-32;
  }
  else if(val>=65 && val<=91)
  {
    val=val+32;
  }
  printf("%c",(char)val);
	return 0;
}