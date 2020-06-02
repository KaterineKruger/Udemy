package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many heights are going to be registered: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the height value: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("Average heights: %.2f%n", avg);
		
		sc.close();
		
	}

}