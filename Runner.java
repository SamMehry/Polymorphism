package PolymorphismConcept;

public class Runner {

	public static void main(String[] args) {

		// Upcasting

		Car x = new BMW("car", "new", 2020, 4, 6, "Good");// declared parent class and initialized it by a child class

		x = new Benz(); // x is object variable for car and Benz is child class.

		// Down casting

		Car x2 = new BMW();// up casting

		BMW y = (BMW) x2;// down casting

		// objects are not inheriting but class do inherit.

		System.out.println(y.getModel());

		Car[] arrayofCars = new Car[10];

		arrayofCars[0] = new BMW();
		arrayofCars[1] = new BMW();

		Object[] data = new Object[10];

		data[0] = "String";
		data[2] = data[3] = 10;
		data[4] = 10.25;
		data[5] = true;
		data[6] = new Car();
		data[7] = new BMW();
System.out.println(data[4]);
	}

}
