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
			System.out.println("A m�dia aritm�tica �: " + media);
	}

}
//um programa que efetue a leitura de 10 valores num�ricos e apresente no final o total do somat�rio e a m�dia aritm�tica dos valores lidos.