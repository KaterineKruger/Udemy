package application;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
*/

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the current dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollarQuantity = sc.nextDouble();
		System.out.printf("Total amount paid in reais: R$ %.2f", CurrencyConverter.reaisPayment(dollarPrice, dollarQuantity));
		
		sc.close();
		
	}

}