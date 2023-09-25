import java.util.*;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    list.get(i+1).add(j+1);
                }
            }
        }
        int count=0;
        boolean[] vis=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(vis[i]==false){
                count++;
                dfs(i,vis,list);
            }
        }
        return count;
    }
    public static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> list){
        vis[node]=true;
        
        for(int i:list.get(node)){
            if(vis[i]==false){
                dfs(i,vis,list);
            }
        }
    }
}
