package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double salarioLiquido() {
		return grossSalary - tax;
	}
	
	public void increasesSalary(double percentage) {
		this.grossSalary += (grossSalary * (percentage / 100.0));
	}

	@Override
	public String toString() {
		return name + ", R$ " + String.format("%.2f", salarioLiquido());
	}
	
	
	
}