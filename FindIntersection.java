package AssArray;

import java.util.Iterator;

public class FindIntersection {
public static void main(String[] args) {
	int array[] = {12,13,14,15,16,17};
	int array1[]= {18,23,19,17,15,11};
for (int i = 0; i < array1.length; i++) {
	for (int j = 0; j < array1.length; j++) {
		if(array[i]==array1[j]) {
			System.out.println(array[i]);
		}
	}
}
	}
}

