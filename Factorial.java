package assignment;

public class Factorial {
public static void main(String[] args) {
	int num = 5;
	int ans = 1;
	for(int i = 1; i<=num; i++) {
		ans= ans*i;
	}
	System.out.println("Factorial:" +ans);
}
}
