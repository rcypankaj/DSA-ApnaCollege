package Arrays;

import java.util.Scanner;
// Question URL: https://www.interviewbit.com/problems/repeat-and-missing-number-array/
// Start
public class RepeatAndMissingNumberArray {
    public static int[] findNumber(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++)
            xor ^= arr[i];

        for (int i = 1; i <= n; i++)
            xor ^= i;

        //find most set bit
        int pos = 0, mostSetBit = 0;
        int bitMask = 1;
        while (xor >= bitMask) {
            bitMask = 1 << pos;
            pos++;
            int number = bitMask & xor;
            if (number != 0)
                mostSetBit = number;
        }

        int x = 0, y = 0;

        // separate the on bit and off bit
        for (int i = 0; i < n; i++) {
            int currBit = mostSetBit & arr[i];

            if (currBit != 0)
                x ^= arr[i];
            else y ^= arr[i];
        }

        for (int i = 1; i <= n; i++) {
            int currBit = mostSetBit & i;

            if (currBit != 0)
                x ^= i;
            else y ^= i;
        }

        // for finding repeating
        for (int i = 0; i < n; i++) {
            if (y == arr[i]) {
                int temp = y;
                y = x;
                x = temp;
            }
        }
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] arr2 = findNumber(arr, n);
        System.out.println(arr2[0]+" "+arr2[1]);

    }
}
// End