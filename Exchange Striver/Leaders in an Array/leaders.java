import java.util.*;
class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        int n=a.length;
        List<Integer> list=new ArrayList<>();
        int max=a[n-1];
        list.add(a[n-1]);
        for(int i=n-2;i>=0;i--){
            if(a[i]>max){
                list.add(a[i]);
                max=a[i];
            }
        }
        return list;
    }
}