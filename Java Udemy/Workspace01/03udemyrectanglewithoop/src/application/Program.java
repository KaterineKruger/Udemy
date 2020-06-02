package application;

/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
*/

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter the Rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter the Rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rectangle.area());
		System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());

		sc.close();
		
	}

}