package es.Studium.PulsarF;

import java.util.Scanner;

public class PulsarF 
{

	public static void main(String[] args) 
	{
		char letra;
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	
		do //Repetir
			{
				System.out.println("Introduzca una letra");
				letra = teclado.next().charAt(0);
				System.out.println("La letra introducida es "+letra);
			}
		while(letra != 'f');// pone la condicion para dejar el bucle
		teclado.close();
		System.out.println("Fin del programa");
	}

}
	