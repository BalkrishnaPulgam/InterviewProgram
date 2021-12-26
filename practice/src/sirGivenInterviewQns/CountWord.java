package sirGivenInterviewQns;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
	public static void main(String[] args) {

		String str = "aaa bbb aaa ccc aaa bbb";

		String[] words = str.split("\\s");
		
	int count;
	
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	for(String word:words) {
		if(map.containsKey(word)) {
			count=map.get(word);
			map.put(word,count+1);
		}else {
			map.put(word, 1);
		}
	}
	
	
	for(Map.Entry<String, Integer> en:map.entrySet()) {
		System.out.println(en.getKey()+" _ "+en.getValue());
	}
		
		
	}

}
