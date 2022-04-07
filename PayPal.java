package assignment;

import java.util.ArrayList;
import java.util.List;
//P,a,y,P,a,l, ,I,n,d,i,a
//y,l,I,n,d,i


public class PayPal {
public static void main(String[] args) {
	String word = "PayPal India";
	char[] array = word.toCharArray();
	for (int i = 0; i < array.length; i++) {
			System.out.println(+array[i]+",");
	}
	List<Object> list1 = new ArrayList<Object>(); 
	List<Object> list2 = new ArrayList<Object>(); 
	List<Object> list3 = new ArrayList<Object>(); 
	List<Object> list4 = new ArrayList<Object>();
	for (int i = 0; i < array.length; i++) {
		list1.add(array[i]);
	}
	System.out.println("List1:" +list1);
	for (int i = 0; i < array.length; i++) {
		boolean added = list2.contains(array[i]);
		if (added==false) {
			list2.add(array[i]);
		}
		else {
			list3.add(array[i]);
		}
	}
	System.out.println("List2 Unique:"+list2);
	System.out.println("List3 duplicates:" +list3);
	
	boolean removeAll = list2.removeAll(list3);
	System.out.println("Output:"+list2);
	list4.addAll(list2);
	list4.remove(2);
	System.out.println(list4);
	
	}
	
}
