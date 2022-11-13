package Arrays;// Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.Scanner;


class MaximumAndMinimumElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            System.out.println(ob.findSum(a, n));
        }
    }
}
// Driver Code Ends

//User function Template for Java
    class Solution
{
    public static int findSum(int[] A, int N)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        return max+min;
    }
}
