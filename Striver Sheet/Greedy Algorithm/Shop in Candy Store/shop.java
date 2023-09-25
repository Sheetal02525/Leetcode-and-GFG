import java.util.*;
class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        Arrays.sort(candies);
        int mini=0;
        int buy=0;
        int free=N-1;
        
        while(buy<=free){
            mini=mini+candies[buy];
            buy++;
            free=free-K;
        }
        
        int maxi=0;
        buy=N-1;
        free=0;
        
        while(buy>=free){
            maxi=maxi+candies[buy];
            buy--;
            free=free+K;
        }
        ArrayList<Integer> l=new ArrayList<>();
        l.add(mini);
        l.add(maxi);
        return l;
    }
}
