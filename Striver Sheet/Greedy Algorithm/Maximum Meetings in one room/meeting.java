import java.util.*;
class MyComparator implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        return a.second-b.second;
    }
}
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
    public static ArrayList<Integer> maxMeetings(int n, int[] S, int[] F) {
        // code here
        
        ArrayList<Pair> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(S[i],F[i],i+1));
        }
        MyComparator mc=new MyComparator();
        Collections.sort(list,mc);
        int endpoint=list.get(0).second;
        l.add(list.get(0).third);
        for(int i=1;i<n;i++){
            if(list.get(i).first>endpoint){
                endpoint=list.get(i).second;
                l.add(list.get(i).third);
            }
        }
        Collections.sort(l);
        return l;
    }
}
