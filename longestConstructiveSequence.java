import java.util.HashMap;
import java.util.Map;

public class longestConstructiveSequence{

	public static void main(String[] args){
		int[] arr = {2,3,1,4,5,6,8,9,10,11,12,14,15};
		
		int longestSequence = 0;
		Map<Integer,Boolean> map = new HashMap<>();
		for(int i:arr){
			map.put(i,true);
		}
		
		Map<Integer,Boolean> checked = new HashMap<>();
		
		for(int i:arr){
			if(!checked.containsKey(i) && !map.containsKey(i-1)){
				int currentChain = 0;
				int start = i;
				while(map.containsKey(start)){
					currentChain++;
					checked.put(start,true);
					start++;
				}
				longestSequence = Math.max(currentChain,longestSequence);
			}
		}
		
		System.out.println(longestSequence);
		
	}
}
