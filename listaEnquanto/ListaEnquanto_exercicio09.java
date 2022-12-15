package listaEnquanto;

import java.util.Scanner;

public class ListaEnquanto_exercicio09 {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		float valor2 = 0;
		double media = 0;
		float resultado = 0;
		while (i<=10) {
			System.out.println("Por favor, escreva um valor (" + i + "/10)");
			int valor1 = sc.nextInt();
			resultado = valor1 + valor2;
			valor2 = resultado;
			i++;
		}
			media = resultado / 10;
			System.out.println("A média aritmética é: " + media);
	}

}
//um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média aritmética dos valores lidos.