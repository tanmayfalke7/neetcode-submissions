class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
               }
            int left = i+1;
            int right = n;
            while(left<right){
            int sum = nums[left]+nums[right];
            int target = -nums[i];
            if(target == sum){
               list.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
               while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                  } 

               while (left < right && nums[right] == nums[right - 1]) {
                  right--;
                }
               left++;
               right--;
            }else if(sum < target){
                 left++;
            }else{
                right--;
            }
            }
        }
        return list;
    }
}
