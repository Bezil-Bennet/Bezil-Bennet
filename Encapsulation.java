package oopsConcept;

public class Encapsulation {
private int pin = 1234;

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = 2345;
	System.out.println(pin);
}
}
