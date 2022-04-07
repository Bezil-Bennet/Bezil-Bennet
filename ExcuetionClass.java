package oopsConcept;

public class ExcuetionClass {
public static void main(String[] args) {
	Audi obj = new Audi();
	int wheel = obj.wheels;
	obj.accellerate();
	obj.applybrake();
	obj.applygear();
	System.out.println("***********Auto**********");
	Auto aut = new Auto();
	int wheel2 = aut.wheels;
	aut.accellerate();
	aut.applybrake();
	aut.applygear();
	System.out.println("*************Nissan**********");
	Nissan nis = new Nissan();
	nis.accellerate();
	nis.applybrake();
	nis.applygear();
}
}
