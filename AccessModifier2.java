package week1.day1;

public class AccessModifier2 {
	// To communicate between classes
	// using reference variable or object
	
public static void main(String[] args) {
	//classname obj(UserDefinedVariable) = new constructor(classname) ();
	AccessModifier obj = new AccessModifier();
	System.out.println(obj.mobileBrand);
	System.out.println(obj.charged);
	System.out.println(obj.imei);
	
	//model - error ...because model variable under private in mobile class
		//System.out.println(obj.model);
	
	
}
}
