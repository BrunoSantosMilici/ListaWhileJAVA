package listaEnquanto;

public class ListaEnquanto_exercicio07 {

	public static void main(String[] args) {
		int numeroAtual = 1;
		int numeroAnterior = 1;
		int numeroResultante = 0;
		int i = 0;
		System.out.println(numeroAtual);
		while (i<13) {
			numeroResultante = numeroAnterior + numeroAtual;
			System.out.println(numeroResultante);
			numeroAnterior = numeroAtual;
			numeroAtual = numeroResultante;
			i++;
			
		}

	}
// Esse algoritmo exibe a sequ�ncia de fibonacci at� o seu d�cimo quinto n�mero
// achei f�cil
}
