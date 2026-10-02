class Solution {
    public static int gcd(int a, int b) {
        // code here
        int rem;
        int lcm;
        //int h=a,e=b;
        if(a<b)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        while(b!=0)
        {
        
          rem=a%b;
          a=b;
          b=rem;
          //lcm=(h*e)/a;
       
            
            
           //lcm=(h*e)/a;
        }
       
        
       return a; 
    }
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna