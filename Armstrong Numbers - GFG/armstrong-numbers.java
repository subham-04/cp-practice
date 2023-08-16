//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int l = len(n);
        int sum=0;
        int originalNum= n;
        
        while(n>0){
            sum=sum+power((n%10),l);
            n=n/10;
        }
        
        if(originalNum==sum){
            return "Yes";
        }
        
        return "No";
    }
    
    static int power(int n, int p){
        return (int)Math.pow(n,p);
    }
    
    static int len(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        
        return count;
    }
}