import java.util.*;
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int[][] ans=image;
       int initialcolor=image[sr][sc];
       int drow[]={-1,0,1,0};
       int dcol[]={0,1,0,-1};
       dfs(sr,sc,initialcolor,ans,image,color,drow,dcol);
       return ans;
        
    }
    public static void dfs(int row,int col,int inic,int[][] ans,int[][] image,int newcolor,int[] drow,int[] dcol){
        ans[row][col]=newcolor;
        int n=image.length;
        int m=image[0].length;
        
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m &&
              image[nrow][ncol]==inic && ans[nrow][ncol]!=newcolor){
                dfs(nrow,ncol,inic,ans,image,newcolor,drow,dcol);
            }
        }
    }
}
