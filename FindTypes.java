package AssString;

public class FindTypes {
public static void main(String[] args) {
	String word = "@!$ Wel 345";
	int let = 0,num = 0, spe = 0,spa= 0;
	char[] array = word.toCharArray();

	for (int i = 0; i < array.length; i++) {
		if(Character.isLetter(array[i])) {
			let=let+1;
		}
		if(Character.isDigit(array[i])) {
			num=num+1;
		}
		if(Character.isSpaceChar(array[i])) {
			spa=spa+1;
		}
		else{
			spe=spe+1;
		}
	}
	System.out.println("No.ofLetter:"+let+"; No.ofDigits:"+num+"; No.ofSpecialChar:"+spe+"; No.ofSpace:"+spa);
	
}
}
