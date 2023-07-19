//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        
        
        int dp[] =new int[n];
        int temp=0;//this is used to save from the negative numbers
        dp[0]=Math.max(temp,arr[0]);
        dp[1]=Math.max(arr[1],Math.max(temp,arr[0]));
        int i=2;
        while(i<n){
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
            i++;
        }
        
        return dp[n-1];
    }
}