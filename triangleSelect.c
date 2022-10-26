#include <stdio.h>

int func(int x, int y, int z)
{

    if (x == y)
    {
        if (x == z)
            printf("1");
        else
            printf("2");
    }
    else if (x == z)
    {
        if (x == z)
            printf("1");
        else
            printf("2");
    }
    else if (y == z)
    {
        if (x == z)
            printf("1");
        else
            printf("2");
    }
    else
        printf("3");
}
int main()
{
    // your code goes here
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);
    if (a >= b && a >= c && a < (b + c))
        func(a, b, c);
    else if (b >= a && b >= c && b < (a + c))
        func(a, b, c);
    else if (c >= b && a <= c && c < (a + b))
        func(a, b, c);
    else
        printf("-1");
        

    return 0;
}
