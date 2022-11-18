package Hashing;

import java.util.Scanner;
import java.util.HashMap;
// Question URL: https://leetcode.com/problems/split-array-into-consecutive-subsequences/submissions/
// Start
public class SplitArrayIntoConsecutiveSubsequences {
    public static boolean isPossible(int[] arr) {
        // create map for storing frequency and availability;
        HashMap<Integer, Integer> freq = new HashMap<>(), available = new HashMap<>();
        for (int i : arr) freq.put(i, freq.getOrDefault(i, 0)+1);

        for (int i : arr) {
            if (freq.get(i) == 0)
                continue;
            else if (available.getOrDefault(i, 0) > 0) {
                available.put(i, available.get(i)-1);
                available.put(i+1, available.getOrDefault(i, 0)+1);
            }
            else if (freq.getOrDefault(i+1, 0) > 0 && freq.getOrDefault(i+2, 0) > 0) {
                freq.put(i+1, freq.getOrDefault(i+1, 0) - 1);
                freq.put(i+2, freq.getOrDefault(i+2, 0) - 1);
                available.put(i+3, available.getOrDefault(i+3, 0)+1);
            }
            else return false;
            freq.put(i, freq.get(i) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isPossible(arr))
            System.out.println("true");
        else System.out.println("false");
    }
}
// End