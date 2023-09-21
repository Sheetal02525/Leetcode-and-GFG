class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double mid=0;
        int l=0;
        int k[]=new int[m+n];
        int i=0;
        int j=0;
        int s=0;
          while(i!=m && j!=n){
              if(nums1[i]<nums2[j]){
                  k[s++]=nums1[i++];
              }
              else{
                  k[s++]=nums2[j++];
              }
          }
          while(i!=m){
              k[s++]=nums1[i++];
          }
          while(j!=n){
              k[s++]=nums2[j++];
          }
        int h=m+n;
        int v=h-1;
        int r=(l+v)/2;
        if(h%2==0){
            mid=(k[r]+k[r+1])/2.0;
        } 
        else{
            mid=k[r];
        }
        return mid;
    }
}
