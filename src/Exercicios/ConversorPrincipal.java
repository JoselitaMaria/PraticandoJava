package Exercicios;

import java.util.Scanner;

public class ConversorPrincipal {

	public static void main(String[] args) {
						
				Scanner sc = new Scanner(System.in);
				System.out.print("Qual o valor do dolar? ");
				double precoDolar = sc.nextDouble();
				System.out.print("quantos dolares voc� vai comprar?");
				double montante = sc.nextDouble();
				double result = Conversor.dollaReal(precoDolar, montante);
				System.out.printf("voc� vai paga em reais = " + result);
			

	}

}
