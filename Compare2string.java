package AssString;

public class Compare2string {
public static void main(String[] args) {
	String text1 = "I am learning java";
	String text = new String("I am learning java");
	if(text1==text) {
		System.out.println("equal");
	}
	else {
		System.out.println("Not Equal");
	}
	boolean equals = text.equals(text1);
	System.out.println(equals+"=Equals");
	boolean equalsIgnoreCase = text.equalsIgnoreCase(text1);
	System.out.println(equalsIgnoreCase+"=EqualsIgnoreCase");
}
}
