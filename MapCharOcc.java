package AssCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapCharOcc {

	public static void main(String[] args) {
     String name ="Bezil Bennet";
     char[] array = name.toCharArray();
     Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
     for (int i = 0; i < array.length; i++) {
		
		if(map.containsKey(array[i])) {
			Integer value = map.get(array[i]);
			map.put(array[i], value+1);
			
		}
		else {
			map.put(array[i], 1);
		}
		
	}
     System.out.println(map);
	}

}
