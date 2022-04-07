package assignment;

import java.util.Arrays;

public class Missing {
public static void main(String[] args) {
	int num[] = {0,1,2,3,4,6,8,7,9};
	Arrays.sort(num);
	for (int i = 0; i < num.length; i++) {
		if(i!=num[i]) {
			System.out.println("Missing" +i);
			break;
			
		}
		
	}
	
}
}
