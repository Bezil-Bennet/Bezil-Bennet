package AssString;

public class ReverseOddIndexToUC {
public static void main(String[] args) {
	String str = "welcome to selenium java";
	//System.out.println(str.length());
	String[] split = str.split(" ");
	//System.out.println(split.length);
	for (int i = 0; i < split.length; i++) {
		if(i%2!=0) {
			String str1 = split[i].toUpperCase();
			System.out.print(str1+" ");
		}
		else {
			System.out.print(split[i]);
		}
		
	}
	
	
	
	String name = "Bezilbennet";
	String[] name1 = name.split("");
	for (int j = 0; j < name1.length; j++) {
		if(j%2!=0) {
			String uc = name1[j].toUpperCase();
			System.out.print(uc);
		}
		else {
			System.out.print(name1[j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
