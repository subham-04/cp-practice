

// LEETCODE QS LINK --> https://leetcode.com/problems/number-of-zero-filled-subarrays


    // THIS SOLUTION HAS
    // TC --> O(N)
    // SC --> O(1)


class Solution {


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

// INTUTION
// FOR CONSICUTIVE 3 ZEROS 000 THE SUB ARRAYS ARE 
// ans=n*(n+1)/2 
// ans=3*4/2 = 6

//  FOR 2 CONSICUTIVE ZERO 00 THE SUB ARRAYS ARE
// ans =  2*3/2 = 3

// In the loop first we count the number of consicutive 0's and if the next number is not 0 then calculate the ans and set the counter for consicutive 0's is 0

// If we again encounter consicutive 0's then count it and then add it with the ans and then at the end if count is still greater than 0 then calculate ans return  the ans



// Lets perform a dry run

// [0,0,0,2,0,0]
// count =0 , ans=0

// for loop starts
// arr[0]=0 count=1 ans=0
// arr[1]=0 count=2 ans=0
// arr[2]=0 count=3 ans=0
// arr[3]=2 count=0 ans=6 (cause for 3 consicutive 0's we have total sub arrays as 6)
// arr[4]=0 count=1 ans=6
// arr[5]=0 count=2 ans=6

// now count > 0 so calculate the ans 
// ans = ans + ((2*3)/2)
// ans = 6 + 3
// ans =  9

// Our final ans is 9