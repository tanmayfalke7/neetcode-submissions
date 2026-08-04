class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        if(stones.length==2){
            return Math.abs(stones[1]-stones[0]);
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) maxheap.add(i);
        while(maxheap.size()>1){
            int x = maxheap.poll();
            int y = maxheap.poll();
            if(x!=y) maxheap.add(Math.abs(y-x));
        }
        return maxheap.isEmpty()?0:maxheap.poll();
    }
}
