#include <stdio.h>

 int max_of_four(int a, int b, int c, int d)
 {
    if((a>b)&&(a>c)&&(a>d))
    {
    return a;
    }
    else if((b>c)&&(b>d))
    {
    return b;
    }
    else if((c>d))
    {
    return c;
    }
    else
    { 
    return d;
    }
 }
 

int main() {
    int a, b, c, d;
    scanf("%d\n%d\n%d\n%d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna