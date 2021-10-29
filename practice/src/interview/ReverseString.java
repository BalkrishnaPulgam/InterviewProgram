package interview;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello Balkrishna";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		////------------------------------///////
		System.out.println("\n Using Collection");
		
		String input = "Hello Vishal";
		char[] c = input.toCharArray();

		List<Character> rev = new LinkedList<Character>();

		for (char d : c) {
			rev.add(d);
		}

		Collections.reverse(rev);

		Iterator<Character> it = rev.iterator();
		while(it.hasNext()) {
			
			System.out.print(it.next());
		}

	}

}
