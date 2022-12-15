package listaEnquanto;

public class ListaEnquanto_exercicio08 {

	public static void main(String[] args) {
		float celsius = 10;
		float fahrenheit = 0;
		
		while(celsius<=100) {
			System.out.println("===========================");
			System.out.println("A temperatura em Celsius é de " + celsius + "C");
			fahrenheit = (9 * celsius + 160) / 5;
			System.out.println("A temperatura concertida é de " + fahrenheit + "F");
			System.out.println("============================");
			celsius += 10;
		}
	}
}
//um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius