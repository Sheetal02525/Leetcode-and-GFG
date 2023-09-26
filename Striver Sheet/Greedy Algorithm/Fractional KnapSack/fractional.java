import java.util.*;
class Pair{
    double weight;
    double val;
    double perkg;
    
    Pair(double weight,double val){
        this.weight=weight;
        this.val=val;
        this.perkg=val/weight;
        
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        ArrayList<Pair> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(new Pair(arr[i].weight,arr[i].value));
        }
        Collections.sort(list,(a,b)->Double.compare(b.perkg,a.perkg));
        double total=0;
        
        for(int i=0;i<n;i++){
            if(list.get(i).weight<=W){
                total=total+list.get(i).val;
                W=(int)(W-list.get(i).weight);
            } else{
                total=total+W*list.get(i).perkg;
                W=0;
            }
        }
        return total;
    }
}

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
