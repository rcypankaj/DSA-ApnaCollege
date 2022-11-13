package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Start
public class BestTimeToBuyAndSellStock {
    public static int findMaxProfit(int[] arr, int n) {
        int maxProfit = 0;
        int x = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > x)
                maxProfit = Math.max(maxProfit, arr[i]-x);
            else x = arr[i];
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxProfit(arr, n));

    }
}
// End