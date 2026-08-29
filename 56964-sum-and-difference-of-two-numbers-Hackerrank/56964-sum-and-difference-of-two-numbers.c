#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int p,q,sum,diff;
    float r,s,sum1,diff1;
    scanf("%d %d %f %f", &p,&q,&r,&s);
    sum=p+q;
    diff=p-q;
    sum1=r+s;
    diff1=r-s;
    printf("%d %d \n",sum, diff);
    printf("%.1f %.1f",sum1, diff1);
	
    
    return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna