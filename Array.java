package week1.day2;

import java.util.Iterator;
//Array-MoreThanOneValuesCanBeStored

//type1 int[] userdefinedVar = {};
//type 2 String[] UserDefinedVar = new String[no.];
//for ...ctrl+space+enter

public class Array {
public static void main(String[] args) {
	
	//Type1
	int [] matrix = {1,2,3,4,5};
	System.out.println(matrix.length);

	for (int i = 0; i < matrix.length; i++) {
		System.out.println(matrix[i]);
	}
	
	//Type2- CreateEmptyArray
	String [] names = new String[4];
	names [0]="AAAA";
	names [1]="BBBB";
	names [2]="cccc";
	names [3]="dddd";
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		
	}
	System.out.println("---------");
	
	//foreach---ctrl+space+enter
	for (String UDV : names) {
		System.out.println(UDV);
	}
	
	
	
}
   
}
