class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> numbers = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        //return min;
        numbers.add(min);
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        numbers.add(max);
        return numbers;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna