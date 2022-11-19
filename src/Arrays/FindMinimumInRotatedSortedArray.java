package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Start
public class FindMinimumInRotatedSortedArray {
    public static int findMin (int[] arr) {
        int l = 0, h = arr.length-1;
        if (arr[l] <= arr[h])
            return arr[0];

        // time complexity O(logn)
        while (l <= h) {
            int mid = l + (h-l)/2;
            if (arr[mid] > arr[mid+1])
                return arr[mid+1];
            else if (arr[mid] < arr[mid-1])
                return arr[mid];
            else if (arr[l] <= arr[mid])
                l = mid+1;
            else h = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(findMin(arr));
    }
}
// End