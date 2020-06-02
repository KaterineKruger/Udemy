package application;

/*
	Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta e o valor de
depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não
tiver dinheiro para depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será zero.
	Uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma
pessoa pode mudar de nome em uma ocasião de casamento, por exemplo).
	O saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de
depósitos e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de R$ 5,00. A conta pode ficar com saldo negativo
se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
	Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial.
Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
 */

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		int option;

		System.out.print("Enter the number of the Bank Account: ");
		int number = sc.nextInt();
		System.out.print("Enter the name of the Account owner: ");
		sc.nextLine();
		String owner = sc.nextLine();
		System.out.print("There will be initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);

		if (answer == 'y') {
			System.out.print("Enter the amount of the initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, owner, initialDeposit);

		} else {
			account = new Account(number, owner);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		do {

			System.out.println();
			System.out.println("Do you want to perform more operations?\n1 - Statement\n2 - Deposit\n3 - Withdrawal\n4 - Exit");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Account data:");
				System.out.println(account);
				break;
			case 2:
				System.out.println();
				System.out.print("Enter the deposit value: ");
				double depositValue = sc.nextDouble();
				account.deposit(depositValue);
				System.out.println();
				System.out.println("Updated data:");
				System.out.println(account);
				break;
			case 3:
				System.out.println();
				System.out.print("Enter the withdrawal value: ");
				double withdrawalValue = sc.nextDouble();
				account.withdrawal(withdrawalValue);
				System.out.println();
				System.out.println("Updated data:");
				System.out.println(account);
				break;
			case 4:
				System.out.println("Thank you for your preference!");
				System.exit(0);
				break;
			default:
				break;
			}
		} while (option != 4);

		sc.close();

	}

}