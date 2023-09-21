import java.util.*;
class Pair{
    int first;
    int second;
    int third;
    Pair(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] dis=new int[n][m];
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    q.add(new Pair(i,j,0));
                }
                else {
                    vis[i][j]=0;
                }
            }
        }
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            dis[row][col]=steps;
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol,steps+1));
                }
            }
        }
        return dis;
    }
}
