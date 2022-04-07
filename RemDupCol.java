package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//remove duplicates using list
public class RemDupCol {
public static void main(String[] args) {
	int arr[] = {14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20};
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer> ();
	List<Integer> list3 = new ArrayList<Integer> ();
	for (int i = 0; i < arr.length; i++) {
		list1.add(arr[i]);
	}
			
	System.out.println("List1:" +list1);
	System.out.println("Size:" +list1.size());
	for (int i = 0; i < arr.length; i++) {
		boolean added = list2.contains(arr[i]);
		if(added==false) {
			list2.add(arr[i]);
		}
		else {
		 list3.add(arr[i]);
		}

	}
		System.out.println("List2 after removing duplicates:" +list2);
		System.out.println("List2 Size:" +list2.size());
		System.out.println("List3 Duplicates:" +list3);
		System.out.println("List3 Size:" +list3.size());
		
		Set<Integer> set1 = new TreeSet <Integer> (list1);
		for (Integer remDup : set1) {
			System.out.print(remDup+",");
		}
		
	}

}
