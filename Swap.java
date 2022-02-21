package assignment;

public class Swap {
public static void main(String args[]) {
int a=56;
int b=67;
System.out.println("Before Swaping" +"a="+a+"b="+b);
a= a+b;
b=a-b;
a=a-b;
System.out.println("After swaping"+"a="+a+"b="+b);
	}
}
