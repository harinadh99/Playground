#include <stdio.h>
int main() {
  int  n,temp,sum=0,fact,k;
  scanf("%d",&n);
  temp=n;
 while(temp>0)
 {
   k=temp%10;
   fact=1;
  for(int i=1;i<=k;i++)
  {
    fact=fact*i;
  }
   temp=temp/10;
   sum=sum+fact;
 }
  if(n==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	//Type your code
	return 0;
}