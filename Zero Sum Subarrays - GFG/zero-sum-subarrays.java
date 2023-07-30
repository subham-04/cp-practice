//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
       
         HashMap<Long,Integer> hm = new HashMap<>();


        long ans = 0;
        long sum = 0;
        hm.put(0L,1);


        for(long x:arr){
            sum+=x;
            if(hm.containsKey(sum)){
                ans+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
//       sum=0  sum=0  sum=5  sum=10  sum=10   sum=10
//       ans=1  ans=3  ans=3  ans=3   ans=4    ans=6
// 0,1 -> 0,2 -> 0,3 -> 5,1 -> 10,1 -> 10,2 -> 10,3              

    
    
}