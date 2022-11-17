package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/trapping-rain-water/submissions/
// Start
public class TrappingRainWater {
    public static int countTrapWater(int[] arr) {
        int totalWater = 0;
        // pointers of the array
        int l = 0, r = arr.length-1;
        int leftMax = 0, rightMax = 0;

        while (r > l) {
            // water could potentially fill everything from left to right, if nothing in between.
            if (arr[l] <= arr[r]) {
                // if the current elevation is greater than maxLeft than water can noy occupy that point at all;
                // however we know that everything is optimally filled from maxLeft to current index.
                // as we've adding water to the brim of the maxLeft;
                if (leftMax <= arr[l])
                    leftMax = arr[l];
                else totalWater += (leftMax - arr[l]);
                l++;
            }
            else {
                if (arr[r] >= rightMax)
                    rightMax = arr[r];
                else totalWater += (rightMax - arr[r]);
                r--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int totalWater = countTrapWater(arr);
        System.out.println(totalWater);
    }
}
// End