package abstraction;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 2, 7, 3 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Output is :[" + result[0] + "," + result[1] + "]");
    }
}