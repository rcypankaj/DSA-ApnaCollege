package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
// Question URL: https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
// Start
public class ChocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i+m-1 < a.size(); i++) {
            minDiff = Math.min(minDiff, a.get(i+m-1) - a.get(i));
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // input
        for (int i = 0; i< n; i++)
            list.add(sc.nextInt());

        System.out.println(findMinDiff(list, n, m));
    }
}
// ENd