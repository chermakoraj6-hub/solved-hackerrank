class Solution {
    int factorial(int n) {
        // code here
        int fact=1;
        if(n==0)
        {
            return 1;
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
            fact=fact*i;
            }
            return fact;
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna