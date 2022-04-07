package AssArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindMissing {
public static void main(String[] args) {
	int arr[] = {2,5,7,4,1,3};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=i+1) {
			System.out.println("Missing Index"+i+"Missing num"+(i+1));
		}
	}
	
}
}
