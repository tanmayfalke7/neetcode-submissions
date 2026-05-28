class Solution {

    public int binarysearch(int left, int right, int[] nums, int target) {

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return mid;

            else if(nums[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Find pivot (minimum element index)
        while(left < right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        int pivot = left;

        // Search in first half
        int a = binarysearch(0, pivot - 1, nums, target);

        // Search in second half
        int b = binarysearch(pivot, nums.length - 1, nums, target);

        if(a != -1)
            return a;

        return b;
    }
}