package AssArray;

import org.checkerframework.checker.signature.qual.InternalForm;

public class MoveZerosToRight {
public static void main(String[] args) {
	int[] num= {4,0,3,0,10,12,0};
	int count = 0;
	for (int i = 0; i < num.length; i++) {
		if(num[i]!=0) {
			num[i]=num[count];
			
		}
		count=count+1;
		System.out.println(num[count]);
	}
	while(count<num.length) {
		num[count]=0;
		count=count+1;
		System.out.println(num[count]);
	}
}
}
