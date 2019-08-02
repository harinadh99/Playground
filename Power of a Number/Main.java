#include <stdio.h>
#include<math.h>
int main()
{
 int x,y;
  scanf("%d%d",&x,&y);
  if(y<0)
  {
    printf("Wrong input");
  }
  else
  {
  int i;
  long int a=1;
  for(i=1;i<=y;i++)
  {
    a*=x;
  }
    
  printf("%ld",a);
  }
  	//Your code here       
    return 0;
}