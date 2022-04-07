package assignment;

public class SumOfDigits {


public static void main(String[] args) {
	int quo=0,rem,sum=0;
	int num= 345;
	while(num!=0) {
	quo=num/10;
	rem=num%10;
	sum=rem+sum;
	num=quo;
	}
	System.out.println(+sum);
}
}
