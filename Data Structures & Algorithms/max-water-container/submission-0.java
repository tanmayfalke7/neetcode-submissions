class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1 , maxarea=0;
        while(l<r){
           int height = Math.min(heights[l],heights[r]);
           int width = r-l;
           maxarea = Math.max(maxarea , height*width);
           if(heights[l]<=heights[r]) l++;
           else r--;
        }
        return maxarea;
    }
}
