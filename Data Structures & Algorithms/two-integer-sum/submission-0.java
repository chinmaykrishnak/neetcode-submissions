class Solution {
    public int[] twoSum(int[] nums, int target) {
        int max = 0;
   

    for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){

            max = nums[i] + nums[j];
            if (max == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{};
    } 
}
