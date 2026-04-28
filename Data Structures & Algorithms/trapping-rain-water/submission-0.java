class Solution {
    public int trap(int[] height) {
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        int n = height.length;
        left_max[0] = height[0];
        int temp1 = left_max[0];
        for(int i=1;i<n;i++){
            left_max[i] = Math.max(temp1,height[i]);
            temp1 = left_max[i];
        }
        right_max[n-1] = height[n-1];
        int temp2 = right_max[n-1];
        for(int j=n-2;j>=0;j--){
            right_max[j] = Math.max(temp2,height[j]);
            temp2 = right_max[j];
        }
        int water=0;
        for(int k=0;k<n;k++){
            int t = Math.min(left_max[k],right_max[k]);
            int tempwater = t-height[k];
            if(tempwater<0) water+=0;
            else water+=tempwater;
        }
        return water;
    }
}
