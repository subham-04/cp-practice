//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

      static int isHappy(int n){
        if(n==1 || n==7)
        return 1;
        int sum=n,cur=n;
        while(sum>9)
        {
            sum=0;
            while(cur>0){
                int d=cur%10;
                sum+=d*d;
                cur=cur/10;
            }
            if(sum==1)
            return 1;
            
            cur=sum;
        }
        if(sum==7)
        return 1;
        
        return 0;
    }

    static int nextHappy(int n){
        // code here
        int next=n+1;
        int res=next;
        while(true){
            if(isHappy(next)==1)
            return next;
            next+=1;
            res=next;
        }
    }
}