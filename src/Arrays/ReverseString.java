package Arrays;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;

class ReverseString
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String str2 = "";

        for(int i = str.length()- 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }
}
