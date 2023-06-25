class Solution {
    public List<String> commonChars(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c='a'; c<='z'; c++){
            map.put(c,Integer.MAX_VALUE);
        }

        for(String word: words){
            
            HashMap<Character, Integer> currentFrequency = new HashMap<>();

            for(int i=0; i<word.length(); i++){
                if(currentFrequency.containsKey(word.charAt(i))){
                    currentFrequency.put(word.charAt(i),currentFrequency.get(word.charAt(i))+1);
                }else{
                    currentFrequency.put(word.charAt(i),1);
                }
                
            }

            for(char c='a'; c<='z'; c++){
                map.put(c,Math.min(map.get(c),currentFrequency.getOrDefault(c, 0)));
            }

        }
        
        List<String> result = new ArrayList<>();

        for(Character c: map.keySet()){
            while(map.get(c)>0){
                result.add(c.toString());
                map.put(c, map.get(c)-1);
            }
        }

        return result;

    }
}
