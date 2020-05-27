#include<stdio.h>

int main()
{
  int marks;
  
  scanf("%d",&marks);
  if(marks==100)
    printf("S");
else  if(marks>90 && marks<=99)
    printf("A");
   else if(marks>80 && marks<=89)
    printf("B");
  else if(marks>70 && marks<=79)
    printf("C");
  else if(marks>60 && marks<=69)
    printf("D");
  else  if(marks>50 && marks<=59)
    printf("E");
 else if(marks<50)
      printf("F");
else 
  printf("Invalid Input");
  return 0;
}