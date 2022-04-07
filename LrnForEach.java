package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LrnForEach {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("hi");
	list.add("wel");
	list.add("come");
	list.add("here");
	for (String eachString : list) {
		System.out.println(eachString);
	}
	System.out.println("-----------------------------");

//Consumer<? super String> eachList;
//list.forEach(eachList) -> {System.out.println(eachList);};


}
}
