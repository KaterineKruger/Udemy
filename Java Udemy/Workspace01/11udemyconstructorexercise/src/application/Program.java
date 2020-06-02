package application;

/*
	Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do titular da conta e o valor de
dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito inicial, entretanto, � opcional, ou seja: se o titular n�o
tiver dinheiro para depositar no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser� zero.
	Uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome do titular pode ser alterado (pois uma
pessoa pode mudar de nome em uma ocasi�o de casamento, por exemplo).
	O saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger isso. O saldo s� aumenta por meio de
dep�sitos e s� diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de R$ 5,00. A conta pode ficar com saldo negativo
se o saldo n�o for suficiente para realizar o saque e/ou pagar a taxa.
	Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o informado o valor de dep�sito inicial.
Em seguida, realizar um dep�sito e depois um saque, sempre mostrando os dados da conta ap�s cada opera��o.
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