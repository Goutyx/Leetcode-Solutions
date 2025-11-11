class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int totalProduct = 1;
        int zeroCount = 0;

        // Step 1: Calculate product and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            totalProduct *= num;
        }

        // Step 2: Handle zero cases
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) res[i] = 0;
            else if (zeroCount == 1) {
                res[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                res[i] = totalProduct / nums[i];
            }
        }

        return res;
    }
}
