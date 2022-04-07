package week1.day1;

public class Operators {
	public static void main(String[] args) {
		int a = 2000;
		a = a+2000;
		System.out.println(a);
		
		// postIncremental-ResultInNextLine
		System.out.println(a++);
	    System.out.println(a);
	    
	    //PreIncremental-ResultInSameLine
		System.out.println(++a);
		
		//ShortHandOperator (a=a+2000)
		System.out.println(a+=2000);
		
	}

}
