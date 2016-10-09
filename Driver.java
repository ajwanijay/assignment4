
public class Driver {

	
	
public void drive(Car car){
	car.drive(20);
	
}
public void addGas (Car car, double amount) {
	car.addGas(amount);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver roy = new Driver();
		Car ca = new Car("bmw", "white", 100);
		roy.drive(ca);
		roy.addGas(ca, 30);
		System.out.println(ca);
	}

}
