class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                flag1 = false;
            } else if (nums[i] < nums[i - 1]) {
                flag2 = false;
            }

            if (flag1==false && flag2==false) {
                return false;
            }
        }

        return true;
    }
}
