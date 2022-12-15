package listaEnquanto;

public class ListaEnquanto_exercicio10 {

	public static void main(String[] args) {
		//um  programa  que  apresente  os  resultados  da  soma  e  da  média  aritmética  dos  valores pares situados na faixa numérica de 50 a 70. 

		int i = 0;
		float media = 0;
		int numeroAtual = 0;
		int numeroNovo = 0;
		float resposta = 0;
		
		numeroAtual = 50;
		
		while(i<=9) {
			resposta += numeroAtual;
			numeroNovo = numeroAtual + 2;
			numeroAtual = numeroNovo;
			i++;
		}
		media = resposta / 11;
		System.out.println("A média dos valores pares entre 50 e 70 é " + media);
		System.out.println("A soma dos valor pares entre 50 a 70 é: " + resposta);
		
	}

}
