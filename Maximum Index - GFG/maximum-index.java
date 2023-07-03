//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
         int nums[]= new int [n];
        for(int i =0;i<n;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        int k =n-1;
        int maxi=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int x = j-i;
            if(arr[i]<=arr[j]){
                maxi = Math.max(x,maxi);
                i++;
                j = n-1;
            }
            else if(arr[i]==nums[k]){
                k--;
                i++;
            }
            else{
                j--;
            }
        }
        
        return maxi;
    }
}