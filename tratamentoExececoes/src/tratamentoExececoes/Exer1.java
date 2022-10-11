package tratamentoExececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

		metodo1();
		
		System.out.println("Fim do programa");

	}
	
	public static void metodo1() {
		System.out.println("*** MÉTODO 1 INÍCIO ***");
		metodo2();
		System.out.println("*** MÉTODO 1 FIM ***");
	}

	public static void metodo2() {
		
		System.out.println("*** MÉTODO 2 INÍCIO ***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace(); // Imprimi na tela o rastreamento do stack
			sc.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}

		sc.close();
		System.out.println("*** MÉTODO 2 FIM ***");

	}

}
