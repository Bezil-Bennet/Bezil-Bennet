package assignment;

public class SumOfDigit {
public static void main(String[] args) {
	int num = 123;
	int quo=0,rem,sum=0;
	while(num!=0) {
		rem=num%10;
		quo=num/10;
		sum= sum+rem;
		num=quo;
	}
System.out.println(sum);
	
}
}
