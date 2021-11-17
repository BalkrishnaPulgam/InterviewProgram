package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortArrayListIndescendingorder {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");

		System.out.println(list.toString());
		
		//How to sort ArrayList in descending order?
		System.out.println("How to sort ArrayList in descending order?");
		
		Comparator<String> comp=Collections.reverseOrder();	
		
		Collections.sort(list,comp);
		
		 System.out.println("printing list in descending order...."); 
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		//How to convert ArrayList to Array 
		System.out.println("Converting ArrayList to Array" ); 
		
	String[] item=list.toArray(new String[list.size()]);
		
	
	//printing array 1) using Arrays.toString()
	System.out.println(Arrays.toString(item));
		
	//printing array 2) using for loop
		for (String string : item) {
			System.out.print(string+" ");
		}
		
		System.out.println();
		//printing array 2) using for each loop
		for(int i=0; i<item.length;i++) {
			System.out.print(item[i]+" ");
		}
		
		//How to convert Array to ArrayList?
	System.out.println("\nConverting Array to ArrayList" );  

		List<String> ArrayToArrayList=Arrays.asList(item);
		
		System.out.println(ArrayToArrayList);
		
		
		
		
		
		
	//	How to reverse ArrayList?
		System.out.println("How to reverse ArrayList?");
		
		Collections.reverse(list);
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		// removing duplicates by using LinkedHashSet
		Set<String> s = new LinkedHashSet<String>(list);
		System.out.println(s);

		// removing duplicates by using HashSet
		Set<String> s1 = new HashSet<String>(list);
		System.out.println(s1);

		//to make ArrayList Read Only
		
		List<String> unmodi=Collections.unmodifiableList(list);
//		unmodi.add("E");      //not able to add if tried we get exception java.lang.UnsupportedOperationException  
		
		//We can still change the list with list reference like;
		list.add("R");
		System.out.println(list);
		
		
		
	}

}
