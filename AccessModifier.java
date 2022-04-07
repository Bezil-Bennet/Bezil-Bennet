package week1.day1;
//Access Modifiers

public class AccessModifier {

// private - accessed only within particular class 
private int model = 8;
 
//public - accessed everywhere
 public long imei = 687878578L;
 
//default/no modifier - acccessed within package
String mobileBrand = "Apple";
boolean charged = false;
// GlobalVariable - mentionedClassLevelNotInMethod&Public 

public static void main(String[] args) {
	Mobile obj = new Mobile();
	System.out.println(obj.charged);
	System.out.println(obj.imei);
	System.out.println(obj.mobileBrand);
	System.out.println(obj.model);
}





}
