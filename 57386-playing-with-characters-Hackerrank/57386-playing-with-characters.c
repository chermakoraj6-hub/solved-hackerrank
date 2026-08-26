#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char c;
    char s[50];
    char sen[100];
    scanf("%c %s\n %[^\n]s",&c, &s, &sen);
    printf("%c \n%s \n%s",c,s,sen);

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna