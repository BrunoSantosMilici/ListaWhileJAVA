package listaEnquanto;

public class ListaEnquanto_exercicio02 {

	public static void main(String[] args) {
		int valor = 0;
		int soma = 0;
		
		while (valor <= 100) {
			soma += valor;
			valor++;
		}
		System.out.println("O resultado é: " + soma);
	}

}
