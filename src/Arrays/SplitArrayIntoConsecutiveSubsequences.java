package Arrays;

import java.util.Scanner;

// Question URL: https://leetcode.com/problems/split-array-into-consecutive-subsequences/description/
// Start
public class SplitArrayIntoConsecutiveSubsequences {
    public static boolean isPossible(int[] arr) {
        int pre = Integer.MIN_VALUE;

        int id1 = 0, id2 = 0, id3 = 0;
        int cur, count;
        int c1, c2, c3;

        for (int i = 0; i < arr.length; pre = cur, id1 = c1, id2 = c2, id3 = c3) {
            for (cur = arr[i], count = 0; i < arr.length && cur == arr[i]; i++) {
                count++;
            }

            if (cur != pre+1) {
                if (id1 != 0 || id2 != 0) {
                    return false;
                }

                c1 = count;
                c2 = 0;
                c3 = 0;
            } else {
                if (count < id1 + id2) {
                    return false;
                }

                c1 = Math.max(0, count - (id1 + id2 + id3));
                c2 = id1;
                c3 = id2 + Math.min(id3, count - (id1 + id2));
            }
        }

        return (id1 == 0 && id2 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isPossible(arr));
    }
}

// End
