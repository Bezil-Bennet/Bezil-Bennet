package week1.day1;
//to do job again and again under conditions
public class Loops {
public static void main(String[] args) {
	// for iterator - if starting and ending point known
	// Run10Rounds
	//for(iterator initialization;condition;incre/decre)
	for(int i = 0; i<=10;i++) {   
		System.out.println("1");
	System.out.println(i);
	}
	
	
	
	//while-ToRunInfiniteTime&OnlyConditionsKnown
	     // - starting and ending not known
	     // -RunEntireDay
	
	int i = 1;
	
	// while (condition) {condition true - block will run}
	while(i<100) {
	System.out.println(i++);
	}
	
	int j = 10;
	//dowhile-WontCheckConditionFirst,ItWillRunFirst
	//do {} while(condition)
	do {
		System.out.println(j++);
	}
	while(j>20);
}
}



