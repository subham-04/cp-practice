
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int k) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap();
        
        int sum = 0;
        int max= Integer.MIN_VALUE;
        
        for(int i=0; i<A.length; i++){
            sum+=A[i];
            
            if(sum==k) max=Math.max(max,i+1);
            if(map.containsKey(sum-k)) max = Math.max(max,i-map.get(sum-k));
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        
        if(max==Integer.MIN_VALUE) return 0;
        
        return max;
    }
    
    
}
