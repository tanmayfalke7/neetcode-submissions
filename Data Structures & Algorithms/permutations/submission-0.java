class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void backtrack(int[] nums,List<Integer>list,boolean[] visited){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            list.add(nums[i]);
            backtrack(nums,list,visited);
            list.remove(list.size()-1);
            visited[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited,false);
        backtrack(nums , new ArrayList<>() , visited);
        return ans;
    }
}
