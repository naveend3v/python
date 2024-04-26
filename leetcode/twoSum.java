package code.leetcode;

import java.util.Arrays;
class SolutionTwoSum {
    public int[] twosum(int[] nums, int target) {
        for(int i=0;i < nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

public class twoSum {
    public static void main (String[] args) {
        SolutionTwoSum s = new SolutionTwoSum();
        int[] testCase1 = s.twosum(new int[]{2,5,5,11},10);
        System.out.println(Arrays.toString(testCase1));
    }
}
