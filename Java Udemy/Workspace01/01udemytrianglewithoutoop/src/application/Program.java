package application;

/*
Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas v�lidas).
Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea.
A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a f�rmula de Heron.
--> Sem Programa��o Orientada a Objetos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the Triangle X measures:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the Triangle Y measures:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("The triangle X has the largest area.");
		}else {
			System.out.println("The triangle Y has the largest area.");
		}
		
		sc.close();
		
	}

}