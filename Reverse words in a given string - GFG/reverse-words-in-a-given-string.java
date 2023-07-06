//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        String[] words = s.split("[.]");
        String[] newStrings = new String[words.length];
        int j=0;
        for(int i = words.length -1; i>=0; i--){
            newStrings[j++] = words[i];
        }
        return String.join(".", newStrings);
    }
}