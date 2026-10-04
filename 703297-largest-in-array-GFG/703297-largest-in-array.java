class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna