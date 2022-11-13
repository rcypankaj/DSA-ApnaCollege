package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/maximum-subarray/
// Start
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum+nums[i], nums[i]);
            largestSum = Math.max(currSum, largestSum);
        }

        return largestSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}
// End