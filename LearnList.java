package collections;

import java.util.ArrayList;
import java.util.List;
//list - same as array but dynamic increase in size/elements

public class LearnList {
public static void main(String[] args) {
	//Create empty list
	//list - interface; arraylist - implementation class;<WrapperClass>--->Generics
	//<WrapperClass>-to restrict the data type
	//Allow duplicates, index
	List<String> list1 = new ArrayList<String> ();
	List<String> list0 = new ArrayList<String> ();
	
	List<Integer> list2 = new ArrayList<Integer> ();
	List<Boolean> list3 = new ArrayList<Boolean> ();
	
	//without wrapper class - we can add all datatypes
	List anydata = new ArrayList();
	List<Object> listobj = new ArrayList<Object> ();
	
	//Add elements
	list1.add("APPLE");
	list1.add("ORANGE");
	list1.add("KIWI");
	list1.add("GRAPES");
	list1.add("PINEAPPLE");
	list1.add("SAPOTA");
	list1.add("banana");
	
	list0.add("FRUITS");
	list0.add("Colour");
	
	list2.add(1);
	list2.add(15);
	list2.add(32);
	list2.add(45);
	list2.add(56);
	
	
	
	//print list
	System.out.println(list1);
	
	System.out.println("List1 Size" +list1.size());
	list1.addAll(list0);
	System.out.println("After adding list0:" +list1);
	
	
	
	
}
}
