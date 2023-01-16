package br.com.exercicios.rodrigo;

public class Exercicio3_arrayPares {

	public static void main(String[] args) {

		int[] iniciarValores = {10,50,21,52,17,59,64,78,32,42,95,75,43,26};
		
		int numerosPar = 0;
		for (int i = 0 ; i<iniciarValores.length ; i++) {
			if (iniciarValores[i]%2 == 0) {
				numerosPar++;
				System.out.println(iniciarValores[i]);
			}
		}
		System.out.println("Essa array possui " + numerosPar + " numeros pares!");
		
	}

}