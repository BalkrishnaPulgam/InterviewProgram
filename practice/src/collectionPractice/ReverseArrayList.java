package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(20);
		
		Collections.reverse(list);
		
		for(Integer integer:list) {
			System.out.println(integer);
		}
	}
	
	
	
	

}
