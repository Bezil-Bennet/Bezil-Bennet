package AssString;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str= "stops";
	String str1= "posts";
	char[] stra = str.toCharArray();;
	char[] str1a = str1.toCharArray();
	Arrays.sort(stra);
	Arrays.sort(str1a);
	str= String.valueOf(stra);
	str1= String.valueOf(str1a);
	if(str.equals(str1)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
		}
}
