class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1 , sum=0;
        while(l<r){
          sum = numbers[l]+numbers[r];
          if(sum==target) return new int[]{l+1,r+1};
          if(sum<target) l++;
          else r--;
        }
        return new int[]{};
    }
}
