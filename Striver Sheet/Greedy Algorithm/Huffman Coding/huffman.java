import java.util.*;
class Solution {
    static class Node implements Comparable<Node>{
 
     int data ;
     Node left;
     Node right;
 
     Node(int data){
         this.data = data;
         left = null;
         right = null;
     }
 
     Node(int data, Node left, Node right){
         this.data = data;
         this.left = left;
         this.right = right;
     }
 
     
 
     public int compareTo(Node p){
          if(this.data==p.data)
            return 1;
          return this.data-p.data;
      }
 }
 
     public void traverse(Node root, ArrayList<String> ans, String temp) {
         if (root.left == null && root.right == null) {
             ans.add(temp);
             return;
         }
         
         traverse(root.left, ans, temp + '0');
         traverse(root.right, ans, temp + '1');
     }
      
     public ArrayList<String> huffmanCodes(String S, int f[], int N){
         PriorityQueue<Node> pq = new PriorityQueue<>();
         
         for (int i = 0; i < N; i++) {
             Node temp = new Node(f[i]);
             pq.add(temp);
         }
         
         while (pq.size() > 1) {
             Node left = pq.poll();
             Node right = pq.poll();
             
             Node newNode = new Node(left.data + right.data);
             newNode.left = left;
             newNode.right = right;
             pq.add(newNode);
         }
         
         Node root = pq.poll();
         ArrayList<String> ans = new ArrayList<>();
         String temp = "";
         traverse(root, ans, temp);
         return ans;
     }
 }