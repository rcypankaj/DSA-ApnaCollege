package Arrays;

import java.util.Scanner;
// Question URL: https://leetcode.com/problems/product-of-array-except-self/submissions/
// Start
public class ProductOfArrayExceptSelf {
    public static void productExceptSelf(int[] arr) {
        int[] newArr = new int[arr.length];
        newArr[0] = 1;
        int product = 1;
        for (int i = 0; i < arr.length-1; i++) {
            product *= arr[i];
            newArr[i+1] = product;
        }

        product = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            newArr[i] *= product;
            product *=  arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        productExceptSelf(arr);
    }
}
// End
