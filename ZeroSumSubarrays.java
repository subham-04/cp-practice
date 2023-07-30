
// GFG QS LINK (HASHMAP SOLUTION WORKS IN GFG BUT NOT IN LEETCODE )

// GFG QS LINK --> https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

// LEETCODE QS LINK --> https://leetcode.com/problems/number-of-zero-filled-subarrays


class Solution{
    // THIS SOLUTION HAS
    // TC --> O(N)
    // SC --> O(N)
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


// LEETCODE SOLUTION 

// HASHMAP SOLUTION IS NOT WORKING HERE 
class Solution {
    // THIS SOLUTION HAS
    // TC --> O(N)
    // SC --> O(1)

    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count++;

            }else{
                ans= ans + getAllSubArray(count);
                count=0;
            }
        }

        if(count!=0) ans= ans + getAllSubArray(count);

        return ans;
    }

    public long getAllSubArray(long count){
            return count*(count+1)/2;
    }
}