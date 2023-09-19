import java.util.*;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[V];
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            list.add(node);
            
            for(int i:adj.get(node)){
                if(!vis[i]){
                    q.offer(i);
                    vis[i]=true;
                }
            }
        }
        return list;
    }
}
