package br.com.exercicios.rodrigo;

public class Exercicio4_arrayMaiorValor {

	public static void main(String[] args) {

		int[] iniciarValores = { 10, 50, 21, 52, 17, 59, 64, 78, 32, 42, 95, 75, 43, 26 };

		int maior = 0;
		int indiceMaior = 0;
		for (int i = 0; i < iniciarValores.length; i++) {
			if(iniciarValores[i] > maior) {
				maior = iniciarValores[i];
				indiceMaior = i;
			}
		}
		
		System.out.println("Maior numero é " + maior + ", no indice " + indiceMaior);
	}
}