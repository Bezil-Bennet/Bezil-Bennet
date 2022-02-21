package assignment;

public class Prime {
	//given num prime or non-prime
public static void main(String[] args) {
	int num = 71;
	int count=0;
	for (int i = 1; i <= num; i++) {
		if(num%i==0) {
			count=count+1;
		}
		}
	if (count==2) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Non Prime");
	}
	
}
}
