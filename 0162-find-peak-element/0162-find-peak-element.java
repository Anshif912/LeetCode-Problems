class Solution {
    public int findPeakElement(int[] nums) {
         int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is smaller than its right neighbor,
            // we are on an upward slope. The peak must be on the right side.
            if (nums[mid] < nums[mid+1]) {
                left = mid + 1;
            } 
            // Otherwise, we are on a downward slope. 
            // The middle element itself could be the peak, or it's on the left side.
            else {
                right = mid;
            }
        }
        
        // 'left' and 'right' converge to the index of a peak element
        return left;
        
    }
}