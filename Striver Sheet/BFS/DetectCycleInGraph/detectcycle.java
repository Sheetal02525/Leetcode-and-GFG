import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class Solution {
    static class Graph {
        boolean detectCycle(int V, List<List<Integer>> adj) {
            // Write your code here.
            boolean vis[]=new boolean[V];
            // vis[0]=true;
            for(int i=0;i<V;i++){
                if(vis[i]==false){
                    if(checkforcycle(i,V,adj,vis)){
                        return true;
                    }
                }
            }
            return false;
        }

      public boolean checkforcycle(int src,int V,List<List<Integer>> adj,boolean[] vis)  {
          vis[src]=true;
          Queue<Pair> q=new LinkedList<>();
          q.add(new Pair(src,-1));
          while(!q.isEmpty()){
              int first=q.peek().first;
              int second=q.peek().second;
              q.remove();

              for(int i:adj.get(first)){
                  if(vis[i]==false){
                      vis[i]=true;
                      q.add(new Pair(i,first));
                  }
                  else if(second!=i){
                      return true;
                  }
              }
          }
          return false;
      }
    };
}
