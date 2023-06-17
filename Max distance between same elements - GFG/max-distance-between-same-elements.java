//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.maxDistance(arr,n));
		
		t--;
		}
	}
}
// } Driver Code Ends


// your task is to complete this function
class Solution
{
    int maxDistance(int arr[], int n)
    {
	// Your code here
	Map<Integer, Integer> map = new HashMap<>();
	int maxDistance = 0;
	for(int i=0; i<n; i++){
	    
	    if(!map.containsKey(arr[i])){
	        map.put(arr[i],i);
	    }else{
	        int distance = i - map.get(arr[i]);
	        maxDistance = Math.max(maxDistance, distance);
	    }
	}
	
	return maxDistance;
    }
}
