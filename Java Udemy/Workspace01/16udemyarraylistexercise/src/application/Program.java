package application;

/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X.
Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme
exemplos. Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode
ser aumentado com base em uma operação de aumento por porcentagem dada.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		int option;

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		do {
			System.out.println();
			System.out.println("Do you want to perform any more operations?\n01 - Yes, Increase Salary\n02 - No, Exit");
			option = sc.nextInt();
			switch (option) {
			case 1:

				System.out.println();
				System.out.print("Enter the employee ID that will have salary increase: ");
				int id = sc.nextInt();
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("This ID does not exist!");
				} else {
					System.out.print("Enter the percentage: ");
					double percentage = sc.nextDouble();
					emp.increaseSalary(percentage);
					System.out.println("Updated data: ID - " + emp.getId() + ", Name - " + emp.getName() + ", Salary - " + emp.getSalary());
				}

				break;
			case 2:
				System.out.println();
				System.out.println("List of employees:");
				for (Employee obj : list) {
					System.out.println(obj);
				}
				System.exit(0);
				break;
			default:
				break;
			}
		} while (option != 2);

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}
}