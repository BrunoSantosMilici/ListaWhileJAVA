package listaEnquanto;

public class ListaEnquanto_exercicio10 {

	public static void main(String[] args) {
		//um  programa  que  apresente  os  resultados  da  soma  e  da  m�dia  aritm�tica  dos  valores pares situados na faixa num�rica de 50 a 70. 

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
		System.out.println("A m�dia dos valores pares entre 50 e 70 � " + media);
		System.out.println("A soma dos valor pares entre 50 a 70 �: " + resposta);
		
	}

}
