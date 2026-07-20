class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int n , int[] nums,int target,List<Integer>list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;

        }
        if(target<0) return;
        for(int i=n;i<nums.length;i++){
            if(i>n && nums[i]==nums[i-1]) continue;
           list.add(nums[i]);
           backtrack(i+1,nums,target-nums[i],list);
           list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(0,nums,target,new ArrayList<>());
        return ans;
    }
}

