import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i:nums){
            hs.add(i);
        }
        for(int i:nums){
            if(hs.contains(i)){
                hs.remove(i);
            }
            else {
                count=i;
                break;
            }
        }
        return count;
    }
}
