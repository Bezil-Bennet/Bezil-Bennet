package assignment;

import java.util.Iterator;

public class PalindromeInt {
public static void main(String[] args) {
	int num = 121;
	
	int rev=0,rem,quo=0;
	while (num!=0) {
		rem=num%10;
		quo=num/10;
		rev=rev*0 +rem;
		//System.out.print(rev);
		num=quo;
	}
	
	System.out.println(num+","+ rev);
	if(num==rev) {
	
		System.out.println("Palindrome");
	}
	else {
		System.out.println("NotPalindrome");
	}
	
}
}
