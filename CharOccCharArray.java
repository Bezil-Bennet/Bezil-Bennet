package AssString;

public class CharOccCharArray {
public static void main(String[] args) {
	String name = "Malayalam";
	char letter = 'a';
	char[] array = name.toCharArray();
	int count = 0;
	for (int i = 0; i < array.length; i++) {
		if(letter==array[i]) {
			count=count+1;
		}
	}
	System.out.println("Character Occurance:"+letter+" - "+count);
	
}
}
