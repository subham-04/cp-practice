class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[A.length];
        int count =0;
    
        for(int i=0;i< A.length; i++){
            
            if(A[i]==B[i]){
                count++;
            }else{
                if(map.containsKey(A[i])) count++;
                if(map.containsKey(B[i])) count++;
                
            }
            
            result[i]=count;
            
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
        }
        
        return result;
        
    }
}