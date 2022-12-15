package listaEnquanto;

import java.util.Scanner;

public class ListaEnquanto_exercicio11 {

	public static void main(String[] args) {
		
		float areaTotal = 0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite o nome do cômodo:");
		String nome = sc.next();
		
		System.out.println("Digite a largura do cômodo:");
		float largura = sc.nextFloat();
		
		System.out.println("Digite o comprimento do cômodo:");
		float comprimento = sc.nextFloat();
		
		float area = largura * comprimento;
		System.out.println("A área desse cômodo é de " + area + "m²");
		areaTotal += area;
		System.out.println("=========================================");
		System.out.println("Você deseja continuar? (SIM OU NÃO)");
		String i = sc.next();
		if (i.equals("NÃO")) {
			break;
			}
		}
		System.out.println("A área total é de " + areaTotal +"m²");
	}
	
}
