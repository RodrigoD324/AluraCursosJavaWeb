package br.com.exercicios.rodrigo;

import java.util.Scanner;

public class Exercicio2_replace {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma frase qualquer: ");
		String texto = input.nextLine();
		
		System.out.println("Agora escolha uma palavra desta frase, para ser substituida por outra!");
		String palavra = input.next();
		System.out.println("Agora escolha a nova palavra para alocarmos na frase!");
		String troca = input.next();
		
		texto = texto.replaceAll(palavra, troca);
		
		System.out.println("A nova frase é agora: " + texto);
		
	}

}