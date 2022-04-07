package week4.day1;
//string- immutable
//if we update new value in string, it will store in new memory location not in same memory
public class LrnStringBuilderBuffer {
public static void main(String[] args) {
	String str = "testleaf";
System.out.println(str);
System.out.println(str.hashCode());//gives memory location
String concat = str.concat("hello");
System.out.println(concat);
System.out.println(concat.hashCode());

//String mutable - how? --update in same memory --string buffer
//available from java version 1
//run sequentially but not parallely
//syncorinized thread
//after java 1.5 string builder - multithread-parallel operation - faster
StringBuffer buf = new StringBuffer("testleaf");
buf.append(" in chennai "); //add/concat
System.out.println(buf+"," +buf.hashCode());



}
}
