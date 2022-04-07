package week2.day1;

public class LearnString {
public static void main(String[] args) {
	
	//Type 1 ------> String Literal
	String var = "String Literal";
	String var2 = "Type 1";
	
	// Type 2 ----> String Using Object
			String var1 = new String("Type 2");
					System.out.println(var1);
	
	
	// Functions 
	System.out.println(var.toLowerCase());
	System.out.println(var.toUpperCase());
	System.out.println(var.toCharArray());
	System.out.println(var.length());
	System.out.println(var.concat(var2));
	System.out.println(var.equals(var2));
	System.out.println(var.trim());
	System.out.println(var.replace('i', 'x'));
	System.out.println(var.substring(3, 5));
	System.out.println(var.charAt(7));
	System.out.println("-------------");
	
	for (int i = 0; i < var.length(); i++) {
		System.out.println(var.charAt(i));
		
		
	}
}
}
