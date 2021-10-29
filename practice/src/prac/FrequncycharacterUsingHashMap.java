package prac;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequncycharacterUsingHashMap {

	public static void main(String[] args) {
		String str = "Balkrishnavishal";

		char[] ch = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> set = hm.entrySet();

		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times.");

		}

	}

}
