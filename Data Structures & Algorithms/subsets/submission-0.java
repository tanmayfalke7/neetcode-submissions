class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int n,int[] nums,List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=n;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return ans;
    }
}
