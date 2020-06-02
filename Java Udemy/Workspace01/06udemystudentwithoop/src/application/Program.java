package application;

/*
Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano (primeiro trimestre vale 30 e
o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer tamb�m se o aluno est� aprovado (PASS)
ou n�o (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o m�nimo para ser aprovado (que � 60% da nota).
Voc� deve criar uma classe Student para resolver este problema.
 */

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Student's name: ");
		student.name = sc.nextLine();
		System.out.println("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Third grade: ");
		student.grade3 = sc.nextDouble();

		System.out.printf("Final grade: %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n", student.missingPoints());
		} else {
			System.out.println("Pass");
		}

		sc.close();

	}

}