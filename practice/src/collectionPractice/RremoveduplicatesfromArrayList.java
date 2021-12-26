package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RremoveduplicatesfromArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(20);
		
		
		LinkedHashSet<Integer> newList=new LinkedHashSet<Integer>(list);
		System.out.println(newList);
		
		
		list.clear();
		list.addAll(newList);
		
		System.out.println("Arraylist :"+list);
		
		HashSet<Integer> hs=new HashSet<Integer>(list);
		System.out.println(hs);
		
		
		for (Integer integer : hs) {
			System.out.println("for"+integer);
		}
		
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
