package listaEnquanto;

import java.util.Scanner;

public class ListaEnquanto_exercicio01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número para visualizar a sua tabuada");
		int numero = sc.nextInt();
		int multiplicador = 1;

		while (multiplicador<11) {
			int resposta = numero * multiplicador;
			System.out.println(multiplicador + " X " + numero + " = " + resposta);
			multiplicador++;
		}
		
	}

}
