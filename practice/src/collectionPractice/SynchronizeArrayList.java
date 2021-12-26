package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {
	
	 // Non Synchronized ArrayList   
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Pineapple");
		
		
		 // Synchronizing ArrayList in Java  
		list=Collections.synchronizedList(list);
		
		
		 // we must use synchronize block to avoid non-deterministic behavior  
		synchronized(list) {
			Iterator<String> itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
	}

}
