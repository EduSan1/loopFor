package loopFor;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {

		// looping while
		/*
		 * int i1 = 0;
		 * 
		 * while (i1 < 10) {
		 * 
		 * System.out.println(i1 + " - SENAI"); i1++;
		 * 
		 * } // looping for
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * System.out.println(i + " - SS");
		 * 
		 * }
		 * 
		 * // outras condicionais no for
		 * 
		 * 
		 * Scanner leitor = new Scanner(System.in); String resposta = "s";
		 * 
		 * for (int k = 0; resposta.equalsIgnoreCase("s");k= k ) { System.out.println(k
		 * + " - SENAI"); System.out.println("Deseja imprimir novamente?(s/n)");
		 * resposta = leitor.next(); System.out.println(" "); }
		 */

		// tabuada do 8 usansdo for

		System.out.println("Tabuada do oito!");

		for (int contador = 0; contador <= 10; contador++) {

			System.out.printf("8 X %d = %d \n", contador, 8 * contador);

		}

	}

}
