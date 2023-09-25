import java.util.*;
class MyComparator implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return a.second - b.second;
    }
}
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
    ArrayList<Pair> list=new ArrayList<>();
    
    for(int i=0;i<n;i++){
        list.add(new Pair(start[i],end[i]));
    }
      MyComparator mc = new MyComparator();
      Collections.sort(list,mc);
      int endpoint=list.get(0).second;
      int count=1;
      for(int i=1;i<n;i++){
          if(list.get(i).first>endpoint){
              endpoint=list.get(i).second;
              count++;
          }
      }
      return count;
    }
}
