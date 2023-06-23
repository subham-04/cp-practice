//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int pairs=0;
        
        for(int i=0; i<n; i++){
            
            // int element = arr[i];
            // int subtractedElement = k - element;
            
            // pairs += map.get(subtractedElement);
            
            // map.put(element,map.get(element)+1);
            
            int element = arr[i];
            int subtractedElement = k - element;

            if (map.containsKey(subtractedElement)) {
                pairs += map.get(subtractedElement);
            }

            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
            
        }
        
        return pairs;
    }
}
