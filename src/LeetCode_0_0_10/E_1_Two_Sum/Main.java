package LeetCode_0_0_10.E_1_Two_Sum;

public class Main {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    int[] desired = {i,j};
                    return  desired;
                }
            }
        }
    return null;
    }

}
