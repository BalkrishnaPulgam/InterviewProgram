package hashmapUse;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {
	
	public static void main(String[] args) {
		
		String str="i love coding and i will do it";
		
		String [] words=str.split("\\s");
		
		
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
			System.out.println(en.getKey()+"-"+en.getValue());
		}
		
	}

}
