class Solution {
    public int rob(int[] nums) {
        int total_zero = 0;
        int total_one = 0;
        for(int i = 0; i < nums.length;i++) {
            total_zero += nums[i];
            i += 1;
        }
        for(int i = 1; i < nums.length;i++) {
            total_one += nums[i];
            i += 1;
        }
        return Math.max(total_zero,total_one);
    }
    public static void main(String[] args) {
        Solution myObj = new Solution();
        int array[] = {10,15,20};
        System.out.println(myObj.rob(array));
    }
}