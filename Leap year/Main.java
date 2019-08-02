#include<stdio.h>
int main()
{
  int year,k;
  scanf("%d",&year);
  k=year%4;
    if(k==0)
    {
      printf("Leap year");
    }
  else
  {
    printf("Not Leap year");
           }
  //Type your code here
  return 0;
}