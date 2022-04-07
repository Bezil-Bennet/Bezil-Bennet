package week2.day1;

import java.util.Arrays;

public class ReplaceString {
public static void main(String[] args) {
	String word = "good life";
	//charAt ---> print single character
	//charArray ----> return sequence of charcter
	System.out.println(word.charAt(6));
	System.out.println("----");
	for (int j = 0; j < word.length(); j++) {
		System.out.print(word.charAt(j)+" ");
	}
	System.out.println("------------");
	System.out.println(word.toCharArray());
	System.out.println("------------");
	
	
	//single word --->charArray
	//Arrays.toString ---->array into string
	char[] var = word.toCharArray();
	String var1 = Arrays.toString(var);
	System.out.println(var1);
	
	//sentence --->split
	//Arrays.toString ---->array into string
	
	String sentence = "I love Biriyani";
	//.split ----> split sentence to words
	String[] split = sentence.split(" ");
	System.out.println(Arrays.toString(split));
	
	//Replace function ----> single letter/no.
	//regex --->regular expression
	//replaceAll -----> replace set of numbers/words/letters
	String aaa = "Born on 2020";
	System.out.println(aaa.replace('0', '1'));
	//remove no.
	System.out.println(aaa.replaceAll("[0-9]", " "));
	//remove non numbers(alphabets)
	System.out.println(aaa.replaceAll("[^0-9]", " "));
	//extract only captital letters
	System.out.println(aaa.replaceAll("[a-z,0-9]", " "));
	//extract only small letters
	System.out.println(aaa.replaceAll("[A-Z,0-9]", " "));
	
	//sequences to remove ---> 
	// \\D - remove NonNumbers/alphabets
	// \\d - remove numbers/digits
	
	
		
	}
}

