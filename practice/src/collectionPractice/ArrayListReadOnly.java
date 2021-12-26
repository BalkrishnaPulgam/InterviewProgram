package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnly {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(20);
		
	List<Integer>	unmodi=Collections.unmodifiableList(list);
		
		list.add(90);             // you can add in previous list but not in new list
		System.out.println(list);
		
		unmodi.add(788);  /// java.lang.UnsupportedOperationException
		
		
	}

}
