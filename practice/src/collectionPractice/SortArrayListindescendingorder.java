package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortArrayListindescendingorder {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(20);

		Comparator<Integer> cmp = Collections.reverseOrder();

		Collections.sort(list, cmp);

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
