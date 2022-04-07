package assignment;

public class Concat {
public static void main(String[] args) {
	String str = "Java";
	String str1 = "is";
	String str2 = "Good";
	String str3 = "language";
	String concat = str.concat(str1).concat(str2).concat(str3);
	System.out.println(concat);
	
	// Result-------JavaisGoodlanguage
}
}
