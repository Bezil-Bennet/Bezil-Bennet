package week1.day2;

public class Calculator {
	String fo = "Calci";
	//ToDoActionRepetatively-CreateMethod
	//MethodCanBeCreatedInClass,NotInsideOtherMethod
	
	// Class-public,default;Methods&Variable-All4
	
	//AccessModifier ReturnType methodName(args if needed){}
	public int calciSum(int a, int b) {
		int sum = (a+b);
		return sum;
	
		
	}
	public static void main(String[] args) {
		Calculator res = new Calculator();
		System.out.println(res.fo);
		System.out.println(res.calciSum(100,45));
		System.out.println(res.calciSum(3000,6000));
		
		
	
		
	
}
  


}
