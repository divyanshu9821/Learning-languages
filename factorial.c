#include <stdio.h>
int main()
{
    int num;
        scanf("%d", &num);
        int size = 500, fact[size], k = size-1, carry = 0;
        fact[size-1] = 1;
        while(num>1)
        {
            for(int i = size-1;i>=k;i--)
            {
                int x = fact[i] * num + carry;
                fact[i] = x%10;
                carry = x/10;
            }
            
            while(carry>0)
            {
                fact[--k] = carry % 10;
                carry /= 10;
            }
            num--;
        }
        //print
        for(int j = k;j<size;j++)
        {
            printf("%d", fact[j]);
        }
        printf("\n");   
        return 0;
}   