import java.util.HashMap;
import java.util.Map;

public class AA {
	public static void main(String[] args) {
		String str = "aaa bbb ccc ddd aaa bbb ccc";

		int count ;
		String[] words = str.split("\\s");
		
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
	
		
		for(String word:words) {
			if(map.containsKey(word)) {
				count=map.get(word);
				map.put(word, count+1);
			}else {
				map.put(word,1);
			}
		}
		
		
		for(Map.Entry<String, Integer> entery:map.entrySet()) {
			System.out.println(entery.getKey()+" - "+entery.getValue());
		}
	}
}
