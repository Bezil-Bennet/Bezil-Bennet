package week2.day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {
public static void main(String[] args) {
	String str  = "Apple Keeps an Doctor Away";
	Map<Character, Integer> map = new LinkedHashMap<Character,Integer> ();
	for (int i = 0; i < str.length(); i++) {
		char name = str.charAt(i);
		//System.out.print(name +",");
		if(map.containsKey(name)) {
			Integer value = map.get(name);
			map.put(name, value+1);
		}
		else {
			map.put(name, 1);
		}
	}
	System.out.println(map);
}
}
