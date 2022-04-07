package AssString;

public class RevEvenWords {
public static void main(String[] args) {
	String sen = "Learn Selenium Java Course";
	String[] split = sen.split(" ");
	for (int i = 0; i < split.length; i++) {
		if(i%2==0) {
			String string = split[i].toUpperCase();
			System.out.println(string+" ");
		}
		else {
		System.out.println(split[i]);
		}
	}
}
}
