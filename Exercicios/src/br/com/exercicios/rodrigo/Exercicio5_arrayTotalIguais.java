package br.com.exercicios.rodrigo;

public class Exercicio5_arrayTotalIguais {

	public static void main(String[] args) {

		int[] valores1 = { 15, 50, 21};
		int[] valores2 = { 50, 15, 69};

		int valoresIguais = 0;
		for (int i = 0; i < valores1.length; i++) {
			for (int j = 0; j < valores2.length; j++) {
				if(valores1[i] == valores2[j]) {
					valoresIguais++;
				}
			}
		}
		
		System.out.println("Os arrays tem um total de " + valoresIguais + " números iguais!");
	}

}