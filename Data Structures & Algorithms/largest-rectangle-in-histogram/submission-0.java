class Solution {
  public static int[] pse(int[] array){
        int n = array.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && array[st.peek()]>=array[i]){
                st.pop();
            }
            arr[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return arr;
    }

    public static int[] nse(int[] array){
        int n = array.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && array[st.peek()]>=array[i]){
                st.pop();
            }
            arr[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return arr;
    }
    public int largestRectangleArea(int[] heights) {
      int n = heights.length,ans=0;
      int[] left = pse(heights);
        int[] right = nse(heights);
        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea ,heights[i]*(right[i]-left[i]-1));
        }
        return maxArea;
    }
}
