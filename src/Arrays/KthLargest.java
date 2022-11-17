package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/kth-largest-element-in-an-array/
// Start
public class KthLargest {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static int quickSort(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pidx = partition(arr, low, high);
            if (k == pidx)
                return arr[pidx];
            if (k < pidx)
                return quickSort(arr, low, pidx - 1, k);
            return quickSort(arr, pidx+1, high, k);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
       // input kth value
        int k = sc.nextInt();
        System.out.println(quickSort(arr, 0, n-1,arr.length-k));
    }
}
// End