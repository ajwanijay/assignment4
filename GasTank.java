
public class GasTank {
	/* Write a class named GasTank containing:
	 An instance variable named amount of type double, initialized to 0.
	 A method named addGas that accepts a parameter of type double .
	 The value of the amount instance variable is increased by the value of the parameter.
	 A method named useGas that accepts a parameter of type double .
	 The value of the amount instance variable is decreased by the value of the parameter.
	 A method named getGasLevel that accepts no parameters. getGasLevel returns
	 the value of the amount instance variable.*/

private double amount=0;



public double addGas(double a) {
	 amount += a;
	 System.out.println("Gas after addition" + "= " + amount);
	 return amount;
}

public double useGas(double u) {
	amount -= u;
	System.out.println("Gas remaining" +"= "+ amount);
	return amount;
}
	
	
	
public double getGasLevel() {
	return amount;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GasTank ag = new GasTank();
		ag.addGas(10);
		
		
		ag.useGas(5);

		System.out.println();
		
	}

}
