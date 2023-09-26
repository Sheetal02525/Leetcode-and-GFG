import java.util.*;
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
     Arrays.sort(arr, (a,b) -> b.profit-a.profit);

        int maxdeadline = 0;
        for (Job j : arr) {
            maxdeadline = Math.max(maxdeadline, j.deadline);
        }

        int schedule[] = new int[maxdeadline + 1];
        Arrays.fill(schedule, -1);
        int count = 0;
        int totalmaxprofit = 0;

        for (Job j : arr) {
            for (int k = j.deadline; k > 0; k--) {
                if (schedule[k] == -1) {
                    schedule[k] = j.id;
                    count++;
                    totalmaxprofit += j.profit;
                    break;
                }
            }
        }
        return new int[] { count, totalmaxprofit };
    }
}


class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

