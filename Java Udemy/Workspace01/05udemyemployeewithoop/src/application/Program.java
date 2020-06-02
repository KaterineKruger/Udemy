package application;

/*
Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido).
Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada
(somente o sal�rio bruto � afetado pela porcentagem) e mostrar novamente os dados do funcion�rio.
Use a classe projetada abaixo. 
 */

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter the employee's salary: ");
		employee.name = sc.nextLine();
		System.out.print("Enter the employee's gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Enter the tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Enter the percentage of salary increase: ");
		double percentage = sc.nextDouble();
		employee.increasesSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
		
	}

}