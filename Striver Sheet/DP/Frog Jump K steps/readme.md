Minimal Cost

Sample Input 1:
4 2
10 40 30 10
Sample Output 1:
40
Explanation Of Sample Output 1:
For ‘n’ = 4, 'k' = 2, height = {10, 40, 30, 10}

Answer is 40.

Initially, we are present at stone 1 having height 10. We can reach stone 3 as ‘k’ is 2. So, cost incurred is |10-30| = 20. 

Now, we are present at stone 3, we can reach stone 4 as ‘k’ is 2. So, cost incurred is |30-10| = 20. So, the total cost is 40. We can show any other path will lead to greater cost.
Sample Input 2:
5 3
10 40 50 20 60
Sample Output 2:
50
Constraints:
1 <= n <= 10^4
1 <= k <= 100
1 <= height[i] <= 10^4
Time Limit: 1 sec
