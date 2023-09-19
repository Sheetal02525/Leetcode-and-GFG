import java.util.*;
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] vis=new boolean[V];
        dfs(0,vis,list,adj);
        return list;
    }
    public static void dfs(int node,boolean[] vis,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        list.add(node);
        
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs(i,vis,list,adj);
            }
        }
    }
}
