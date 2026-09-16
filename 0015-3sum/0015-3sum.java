import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // Step 1: Sort the array. This allows us to use pointers 
        // and easily skip duplicate numbers.
        Arrays.sort(nums);

        // Fix the first element (nums[i]) and look for the other two
        for (int i = 0; i < n - 2; i++) {
            
            // Optimization: If the current number is greater than 0, 
            // the sum can never be 0 since the array is sorted.
            if (nums[i] > 0) {
                break;
            }

            // CRUCIAL: Skip duplicate values for 'i' to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 2: Use two pointers for the remaining parts of the array
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet!
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // CRUCIAL: Skip duplicate values for 'left' and 'right'
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after finding a match
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    // Sum is too small, make it bigger by moving the left pointer right
                    left++;
                } 
                else {
                    // Sum is too large, make it smaller by moving the right pointer left
                    right--;
                }
            }
        }

        return ans;
    }
}
