package AssString;



public class Palindrome {
public static void main(String[] args) {
	String name = "Malayalam";
	String reverse ="";
	for (int i = name.length()-1; i >=0; i--) {
    	char array = name.charAt(i);
		reverse= reverse+ array;
		}
    
   if(name.equalsIgnoreCase(reverse)) {
	   System.out.println("palindrome");
   }
   else {
	   System.out.println("Not palindrome");
   }
	
}
}
