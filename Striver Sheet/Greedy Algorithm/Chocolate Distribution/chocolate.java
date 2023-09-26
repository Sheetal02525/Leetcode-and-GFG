import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int i=0;
        int j=m-1;
        int min=Integer.MAX_VALUE;
        while(j<n){
            int diff=a.get(j)-a.get(i);
            min=Math.min(diff,min);
            j++;
            i++;
        }
        return min;
    }
}
