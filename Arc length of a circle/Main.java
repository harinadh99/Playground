#include<stdio.h>
#define pi 3.14
int main()
{
float x,r;
scanf("%f%f",&r,&x);
float area;
area=(2*pi*r)*(x/360);
printf("%.2f",area);
return 0;
}
