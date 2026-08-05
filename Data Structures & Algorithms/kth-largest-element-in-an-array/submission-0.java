class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) maxheap.add(i);
        for(int i=1;i<=k;i++){
            if(i==k) return maxheap.poll();
            else
            {
                 int temp = maxheap.poll();
            }
        }
        return -1;
    }
}
