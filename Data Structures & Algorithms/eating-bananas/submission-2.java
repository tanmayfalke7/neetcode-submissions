class Solution {

    public int func(int[]arr, int boundry){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil((double)arr[i]/(double)boundry);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1,right=0;
        for(int pile : piles){
            right = Math.max(right,pile);
        }
        int ans = right;
        while(left<=right){
            int mid = left+(right-left)/2;
            int totalhours = func(piles,mid);
            if(totalhours<=h){
                ans = mid;
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}
