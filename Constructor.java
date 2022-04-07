package week2.day1;
//anything followed by () ----> function or method
//constructor is a special method inside class, same name as class name
//signature of a method - accessModifier returntype methodName;
//sign. of constructor - accessModifier methodName(); (no need of return type)
//gateway of class - constructor, access non-static methods
//key to class - it will run first
//helps to pass args in class
//JVM will create default constructor;
//heap memory


public class Constructor {
	public Constructor() {
	 System.out.println("Constructor"); // constructor syntax
	}
	String aaa = "Test";
public static void main(String[] args) {
	Constructor obj = new Constructor();
	System.out.println(obj.aaa);

}
}
