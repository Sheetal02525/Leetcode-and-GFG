import java.util.*;
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long sum=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long i:arr){
            pq.add(i);
        }
        while(pq.size()>1){
            long y=pq.remove()+pq.remove();
            pq.add(y);
            sum=sum+y;
        }
        return sum;
    }
}
