package AssArray;

import java.util.Arrays;

public class SmallDupNum {
public static void main(String[] args) {
	int[] arr = {2,5,3,7,7,2,1};
	Arrays.sort(arr);
	boolean flag=false;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				flag=true;
			}
			
		}
		
	}
}
}
