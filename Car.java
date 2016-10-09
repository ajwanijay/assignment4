
public class Car {

	/*
	 * Design and implement a class called Car. You need to create necessary
	 * attributes for this class, and method if needed Define the Car
	 * constructor to initialize these values (in that order). Include getter
	 * and setter methods for all instance data.
	 */

	private String name;
	private String color;
	private double price;
	private GasTank gt= new GasTank();

	public Car(String n, String c, double p) {
		name = n;
		color = c;
		price = p;
		gt.addGas(100);
	}
	
	public void drive(double amount){
		gt.useGas(amount);
	}
	
	public void addGas(double amount) {
		gt.addGas(amount);
	}

	// getter and setter
	public String getname() {
		return name;
	}

	public String color() {
		return color;
	}

	public double getprice() {
		return price;
	}

	public void setname(String n) {
		name = n;
	}

	public void setcolor(String c) {
		color = c;
	}

	public void setprice(double p) {
		price = p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ca = new Car("bmw", "white", 100);
		System.out.println(ca.getname());

		
	}

}
