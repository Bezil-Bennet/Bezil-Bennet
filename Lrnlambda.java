package week4.day1;
//lambda exp- java 8 version

//functional interface -only 1 method interface without implementation class
interface Mobile {
	public void makePay(long cardno);
}
public class Lrnlambda {
public static void main (String[] args) {
	//creating obj for interface
		/*
		 * Mobile obj = new Mobile() { public void makePay(long cardno) {
		 * System.out.println("cardno:" +cardno); } };
		 * obj.makePay(1234678634234122235L);
		 */
	
	//Method inside method
	//implement lambda expressions - 3 components
	//syntax: (lambda operator) -> {body}   lambdaoperator-args of function
//no need constructor for implementation and remove method name since only one method
	
	
	Mobile obj = (long cardno) -> {   System.out.println("Card:" +cardno);   };
	obj.makePay(89865533436557878L);
   //NotLooksLikeMethod-anonymous function-no clue of existence 
   //single line of implementation
	}
}
