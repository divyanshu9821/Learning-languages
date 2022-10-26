#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{
    srand(time(NULL)); //random generator function
    int input, pl=0, c=0, n=3;
    printf("welcome to the game \n***ROCK PAPER AND SCISSORS***\n");
    for(int i=0;i<n;i++)
    {
        char opt;
        printf("\\\\RULES//\nThere are three rounds, if any person wins in any two rounds will be winner of this game.\nThe number of rounds increases with the no. of draws in match.\n\nChoose\n'r' for Rock\n'p' for Paper\n's' for scissor\n\nEnter your choice :- ");

        scanf("%c",&opt);
        getchar();
        
        //User's turn
        printf("\n\tPlayer choose : ");
        if(opt=='r')
            printf("Rock\n");
        else if(opt=='p')
            printf("Paper\n");
        else if(opt=='s')
            printf("Scissors\n");
        else
            goto end;
        
        //Computer's turn
        int cc = rand()%3;
        printf("\tComputer choose : ");
        if(cc==0)
        {
            printf("Rock\n");
            if(opt=='p') pl++;
            else if(opt=='s') c++;
            else n++;
        }
        else if(cc==1)
        {            
            printf("Paper\n");
            if(opt=='s') pl++;
            else if(opt=='r') c++;
            else n++;
        }    
        else if(cc==2)
        {
            printf("Scissors\n");
            if(opt=='p') c++;
            else if(opt=='r') pl++;
            else n++;
        }    
        else
            goto end;

        
    }

    (pl>c)? printf("Player wins\n"):printf("Player loose\n");

    end :
        printf("Invalid choice");
    return 0;
}