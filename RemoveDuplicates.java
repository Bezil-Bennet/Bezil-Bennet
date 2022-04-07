package AssArray;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	int[] arr = {12,13,14,19,14,16,17,18,19,20};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]!=arr[i+1]) {
			System.out.print(arr[i]+",");
		}
		
	}
		
		
		
}
}
