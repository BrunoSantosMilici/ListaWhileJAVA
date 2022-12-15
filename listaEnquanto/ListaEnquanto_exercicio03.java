package listaEnquanto;

public class ListaEnquanto_exercicio03 {

	public static void main(String[] args) {
		int numero = 1;
		int soma = 0;
		
		while (numero<=500) {
			if (numero % 2 ==0) {
				soma += numero;
				numero++;
			} else {
				numero++;
			}
		}
		System.out.println("O resultado da soma de todos os números pares entre 1 e 500 é: " + soma);
	}

}
