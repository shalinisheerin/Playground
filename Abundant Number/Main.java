# include <stdio.h>  
# include <string.h>  
# include <stdbool.h>  
# include <math.h>  
int getSum(int n)  
{  
    int sum = 0;  
    for (int i=1; i<=sqrt(n); i++)  
    {  
        if (n%i==0)  
        {  
            if (n/i == i)  
                sum = sum + i;  
            else   
            {  
                sum = sum + i;  
                sum = sum + (n / i);  
            }  
        }  
    }  
    sum = sum - n;  
    return sum;  
}  
bool checkAbundant(int n)  
{  
    return getSum(n) > n;  
}  
int main()  
{  
int n;  
scanf("%d",&n);  
checkAbundant(n)? printf("Abundant Number\n") : printf("Not Abundant Number\n");  
    return 0;  
}  

