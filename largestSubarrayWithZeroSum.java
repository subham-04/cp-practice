import java.util.HashMap;
import java.util.Map;

public class largestSubarrayWithZeroSum{
    public static void main(String[] args) {
		int[] arr = {2,3,-1,4};

        Map<Integer,Integer> prefixSumIndex= new HashMap<>();

        int maxLength =0;
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

            if(sum==0)   maxLength = i+1;
            else{
                if(prefixSumIndex.containsKey(sum)){
                    maxLength = Math.max(maxLength, i-prefixSumIndex.get(sum));
                }else{
                    prefixSumIndex.put(sum, i);
                }
            } 
        }

        System.out.println(maxLength);
        
    }
}