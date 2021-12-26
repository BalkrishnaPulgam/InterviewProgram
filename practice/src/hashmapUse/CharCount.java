package hashmapUse;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void main(String[] args) {
		
		String str="picture perfect";
		
		str=str.replaceAll(" ", "");
		
		char [] words=str.toCharArray();
		
		int count;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character word:words) {
			if(map.containsKey(word)) {
				count=map.get(word);
				map.put(word,count+1);
			}else {
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> en:map.entrySet()) {
			System.out.println(en.getKey()+"-"+en.getValue());
		}
		
	}

}
