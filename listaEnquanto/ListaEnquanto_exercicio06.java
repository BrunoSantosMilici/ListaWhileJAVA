package listaEnquanto;

import java.util.Scanner;

public class ListaEnquanto_exercicio06 {

	public static void main(String[] args) {
		// esse algorimo exibe o resultado de uma potênciação sem utilizar seu utilizar o operador lógico de exponencia
		int i = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base:");
		int base = sc.nextInt();
		System.out.println("Digite o expoente:");
		int expoente = sc.nextInt();
		
		while (i != (expoente + 1)) {
		resultado *= base;
		if (resultado == 0) {
			resultado++;
			}
			i++;
		}
		System.out.println("A resposta é: " + resultado);
	}
}
