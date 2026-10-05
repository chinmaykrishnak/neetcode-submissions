class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Store product of all elements to the left
        int[] left = new int[nums.length];

        // Store product of all elements to the right
        int[] right = new int[nums.length];

        // First element has nothing on its left
        left[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Last element has nothing on its right
        right[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Answer = left product × right product
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}