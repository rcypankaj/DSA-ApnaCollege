package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
// Start
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;

        while (l <= h) {
            int mid = l + (h-l)/2;

            if (nums[mid] == target)
                return mid;
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid])
                    h = mid-1;
                else l = mid+1;
            }
            else {
                if (target > nums[mid] && target <= nums[h])
                    l = mid+1;
                else h = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
    }
}
// ENd