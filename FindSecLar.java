package AssArray;

import java.util.Arrays;

public class FindSecLar {
public static void main(String[] args) {
	int[] arr = {1,14,25,78,96,53,4,67,32,89};
	Arrays.sort(arr);
	int length = arr.length;
	System.out.println(arr[length-2]);
}
}
