#include<stdio.h>
int main()
{ 
  char c;
 scanf("%c",&c);
 if (c=='a'|| c=='e' ||c=='i'|| c=='o' ||c=='u'||
     c=='A' ||c=='E'|| c=='I' ||c=='O'|| c=='U')
 {
   printf("Vowel");
 } 
  else
  {
   printf("Consonant");
 }
  //type your code here
  return 0;
}