package AssArray;

import java.util.Iterator;

public class FindDuplicates {
public static void main(String[] args) {
	int[] arr = {12,13,14,19,14,16,17,18,19,20};
	for (int i = 0; i < arr.length; i++) {
		for (int j=i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println("Duplicates"+arr[i]);
			}
		}
	}
}
}
