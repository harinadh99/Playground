#include <stdio.h>
int main() {
  int n,temp,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    temp=n%10;
    n=n/10;
    sum=sum+temp;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}