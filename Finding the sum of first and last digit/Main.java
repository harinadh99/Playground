#include <stdio.h>
int main() {
  int n,k,m;
  scanf("%d",&n);
    int a=n;
  while(a>10)
  {
    a=a/10;
  }
  k=a+(n%10);
  printf("%d",k);
	//Type your code
	return 0;
}