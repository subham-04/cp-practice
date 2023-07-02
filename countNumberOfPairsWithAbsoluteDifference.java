class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res=0;
        for(int i:nums){
                res += map.getOrDefault(i-k,0) +  map.getOrDefault(i+k,0);
                map.put(i, map.getOrDefault(i,0)+1);
        }

        return res;
    }
}
