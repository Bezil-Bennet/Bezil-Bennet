package oopsConcept;

public class OverLoading {
public void addNum() {
	int x = 10;
	int y= 20;
	System.out.println("Sum"+(x+y));
}
public void addNum(int x, int y) {
	
	System.out.println("Sum "+(x+y));
}
public void addNum(int x, int y, int z) {
	
	System.out.println("Sum "+(x+y+z));
}
public static void main(String[] args) {
	OverLoading obj = new OverLoading();
	obj.addNum();
	obj.addNum(30, 20);
	obj.addNum(10,20, 20);
}
}
