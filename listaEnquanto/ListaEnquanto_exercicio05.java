package listaEnquanto;

public class ListaEnquanto_exercicio05 {

	public static void main(String[] args) {
		// este � um algoritmo que exibe todos os n�meros de 1 a 15 elevados ao cubo mas sem utilizar o operador de exponencia��o
		int expoente = 3;
		int i = 0;
		int resultado = 0;
		
		while (i<16) {
			resultado *= expoente;
			if (resultado == 0) {
				resultado = 1;
				System.out.println(expoente + " elevado � " + i + " � igual a " + resultado);
				i++;
			}	if (resultado == 1) {
				resultado = 3;
				System.out.println(expoente + " elevado � " + i + " � igual a " + resultado);
				i++;
			}   else {
				System.out.println(expoente + " elevado � " + i + " � igual a " + resultado);
				i++;
			}
			
		}

	}

}
