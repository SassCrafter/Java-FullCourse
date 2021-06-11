
public class Car {
	
	String make;
	String model;
	int year;
	String color;
	double price;
	
	
	Car(String make, String model, int year, String color, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	
	void drive() {
		System.out.println("You drive the " + this.model);
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}
	
	
	public String toString() {
		return this.make + "\n" + this.model + "\n" + this.year + "\n" + this.color + "\n" + this.price;
	}

}
