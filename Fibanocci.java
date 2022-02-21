package assignment;

public class Fibanocci {
public static void main(String[] args) {
	int fir = 1,sec = 2,tir;
	for (int i = 0; i <= 5; i++) {
		//System.out.println(fir);
		tir= fir+sec;
		fir=sec;
		sec=tir;
		System.out.println(tir);
	}
	
}
}
