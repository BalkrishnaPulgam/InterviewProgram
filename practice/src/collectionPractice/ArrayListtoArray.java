package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtoArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("50");
		list.add("40");
		list.add("30");

		System.out.println("Converting ArrayList to Array");
		String[] item = list.toArray(new String[list.size()]);

		System.out.println(item.toString());

		for (String str : item) {
			System.out.println(str);
		}

		System.out.println("Converting Array to ArrayList");

		List<String> bbb = Arrays.asList(item);
		System.out.println(bbb);

	}

}
