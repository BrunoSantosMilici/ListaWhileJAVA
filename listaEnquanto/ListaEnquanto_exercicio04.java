package listaEnquanto;

public class ListaEnquanto_exercicio04 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		while(numero<=20){
			if (numero % 2 == 0) {
				numero += 1;
			} else {
				System.out.println(numero + " É ÍMPAR");
				numero += 1;
			}
		}
	}
}
// esse é um algoritmo que lista todos os números ímpares entre 1 e 20