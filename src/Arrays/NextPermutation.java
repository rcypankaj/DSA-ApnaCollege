package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/next-permutation/
// Start
public class NextPermutation {
    public static void reverse(int[] arr, int i, int j) {
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void findNextPerm(int[] arr, int n) {
        if (arr == null && arr.length == 1) return;
        int i = arr.length-2;
        while (i >= 0 && arr[i] >= arr[i+1]) i--;
        if (i >= 0) {
            int j = arr.length-1;
            while (j >= 0 && arr[i] > arr[j]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1, arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        findNextPerm(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }
}
// End