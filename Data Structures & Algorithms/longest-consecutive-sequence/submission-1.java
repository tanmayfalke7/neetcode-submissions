class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int ans=1,count=1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)!=list.get(i)+1){
                ans=Math.max(ans,count);
                count=1;
            }else{
                count++;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}
