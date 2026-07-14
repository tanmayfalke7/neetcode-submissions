class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combo = new int[nums1.length+nums2.length];
        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                combo[k++] = nums1[i++];
            }else{
                combo[k++] = nums2[j++];
            }
        }
        while(i<m){
            combo[k++] = nums1[i++];
        }
        while(j<n){
            combo[k++] = nums2[j++];
        }
        int t = m+n;
        if(t%2==1) return combo[t/2];
        return (combo[t/2]+combo[t/2-1])/2.0;
    }
}
