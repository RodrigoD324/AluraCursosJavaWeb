package br.com.exercicios.rodrigo;

import java.util.Scanner;

public class Exercicio1_length {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um texto qualquer: ");
		String texto = input.nextLine();
		
		System.out.println("Este texto tem " + texto.length() + " caracteres!");
		
	}
}