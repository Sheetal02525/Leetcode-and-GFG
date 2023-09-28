public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
            int maxLength = 0;

       
       
        int start = 0, end = -1;
        long currentSum = 0;

    
        while (start < n) {

           
            while ((end + 1 < n) && (currentSum + a[end + 1] <= k)) {
                currentSum += a[end + 1];
                ++end;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

           
            currentSum -= a[start];
            ++start;
        }

        return maxLength;
    }
}
