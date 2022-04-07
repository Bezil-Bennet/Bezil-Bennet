package AssString;

public class SumOfDigitsInString {
public static void main(String[] args) {
	String word = "12Welcome31R5";
	String word1 = word.replaceAll("\\D", "");
	System.out.println("Replaced Word:"+word1);
	int num = Integer.parseInt(word1);
	System.out.println(num);
	int quo=0,rem,sum=0;
	
	while(num!=0) {
		rem=num%10;
		quo=num/10;
		sum=sum+rem;
		num=quo;
	}
	System.out.println("sum:" +sum);
}
}
