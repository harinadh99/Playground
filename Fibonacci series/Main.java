#include<stdio.h>
int main()
{
  int x=0,y=1;
  int n,z;
  printf("%d %d",x,y);
  scanf("%d",&n);
  for(int i=0;i<n-2;i++)
  {
    z=x+y;
    printf(" %d",z);
    x=y;
    y=z;
  }
  //Type your code here
  return 0;
}