package AssString;

public class CharacterOccurance {
public static void main(String[] args) {
	String str = "Bezil Prishkel";
	int count = 0;
	char a = 'P';
	for (int i = 0; i < str.length(); i++) {
		char ar = str.charAt(i);
		if(ar == a) {
			count = count+1;
		}
	}
	System.out.println("Character Occurance of: " +a+" "+ count);
}
}
