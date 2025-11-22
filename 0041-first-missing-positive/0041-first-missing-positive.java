class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            // Skip negative numbers and zero
            if (nums[i] <= 0) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // If current number does not match expected count
            if (nums[i] != count) {
                return count;
            }

            count++; // Found the number we expect
        }

        // If everything matched, missing number is next
        return count;
    }
}
