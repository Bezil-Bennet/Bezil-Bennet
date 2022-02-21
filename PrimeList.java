package assignment;

public class PrimeList {
public static void main(String[] args) {
	int num =20;
	int count=0;
	for (int i = 0; i <= num; i++) {
		count=0;
		for (int j = 1; j <=num; j++) {
			if (i%j==0) {
				count= count+1;
			}
		}
		if(count==2) {
			System.out.print(i+",");
		}
		
	}
	
	
}
}
