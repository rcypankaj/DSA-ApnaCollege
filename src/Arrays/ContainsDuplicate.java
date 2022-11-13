package Arrays;

import java.util.Scanner;
import java.util.HashSet;
// Question URL: https://leetcode.com/problems/contains-duplicate/
// Start
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (!set.contains(val))
                set.add(val);
            else return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(containsDuplicate(arr));
    }
}
// End