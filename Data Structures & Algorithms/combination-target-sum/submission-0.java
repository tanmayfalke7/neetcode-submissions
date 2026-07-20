class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int n , int[] nums,int sum,int target,List<Integer>list){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>target) return;
        for(int i=n;i<nums.length;i++){
           list.add(nums[i]);
           sum+=nums[i];
           backtrack(i,nums,sum,target,list);
           sum-=nums[i];
           list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(0,nums,0,target,new ArrayList<>());
        return ans;
    }
}
