package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/maximum-product-subarray/
// Start
public class MaximumProductSubarray {
    public static int findMaxProduct(int[] arr) {
        int res = arr[0];
        int imax = res, imin = res;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(arr[i], imax*arr[i]);
            imin = Math.min(arr[i], imin*arr[i]);

            res = Math.max(res, imax);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(findMaxProduct(arr));
    }
}
// End