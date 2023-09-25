class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
      String[] ans=S.split("\\.");
      StringBuilder sb=new StringBuilder();
      for(int i=ans.length-1;i>=0;i--){
          if(i!=0){
              sb.append(ans[i]+".");
          }
          else{
              sb.append(ans[i]);
          }
      }
      return sb.toString();
    }
}
