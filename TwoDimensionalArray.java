package week1.day2;

import java.util.Iterator;

public class TwoDimensionalArray {
public static void main(String[] args) {
	
	
	//TwoDimArray
	int [][] TwDiAr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	System.out.println("Actual Matrix");
	for (int i = 0; i < TwDiAr.length; i++) {
		for (int j = 0; j < TwDiAr[i].length; j++) {
			System.out.print(TwDiAr [i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("Transpose Matrix");
	for (int i = 0; i < TwDiAr.length; i++) {
		for (int j = 0; j < TwDiAr.length; j++) {
			System.out.print(TwDiAr [j][i]+" ");
		}
		System.out.println();
	}
	
	
	//Type2 
	/*
	 * int [][] TDA = new int [3][4]; TDA [][]=
	 */
	
	
}
}
