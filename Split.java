package assignment;

public class Split {

public static void main(String[] args) {
	String str1 = "Java,is,good,language";
	String[] array = str1.split(",");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
}
//result
//Java
//is
//good
//language



}
