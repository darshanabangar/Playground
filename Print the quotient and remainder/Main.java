#include<stdio.h>
int main()
{
  int divisor=4, dividend=365, remainder , quotient;
  
  quotient = 365 / 4;
  remainder = 365 % 4;
  
  printf("Quotient: %d\nRemainder: %d",quotient,remainder);
  return 0;
}