package AssString;

public class FindIndexOfAllChar {
public static void main(String[] args) {
	String str = "Bezil bennet";
	int indexOf = str.indexOf("i");
	System.out.println(indexOf);
	for (int i = 0; i < str.length(); i++) {
		char array = str.charAt(i);
		System.out.println(i+"-"+array );
	}
}
}
