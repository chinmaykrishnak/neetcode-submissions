class Solution {
    public int[] productExceptSelf(int[] nums) {

        //Addressing edge cases
        if (nums == null || nums.length == 0) {
            System.out.println("The array is null or empty.");
        }


        //Array to store multiplications of the left.
        int[] left = new int[nums.length];

        //Array to store multiplications of the right.
        int[] right = new int[nums.length];
    
 // keeping first index of left array as 1 because there is no element to the left of the first index
        left[0] = 1;
        for(int i = 1; i < nums.length;i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        // keeping last index of right array as 1 because there is no element to its right
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i > -1; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }


        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
}
}