#include<stdio.h>
int main()
{
  int n;
 scanf("%d",&n);
  if(n%2==1)
  {
  int a=0,d=1;
    int x=a+(n-1)*d;
    printf("%d",x);
  }
  else{
  int a=0,d=2;
    n=n/2;
    int y=a+(n-1)*d;
    printf("%d",y/2);
  }
	//type your code here
	
}