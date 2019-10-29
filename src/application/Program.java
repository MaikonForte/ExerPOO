package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X:");
		
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		double sx = x.area();

		System.out.println("Digite as medidas do triangulo Y");
		
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		
		double sy = y.area();
		
		System.out.printf("A area do triangulo é %.3f \n", sx);
		System.out.printf("A area do triangulo Y é %.3f\n", sy);
		
		
		if (sx > sy) {
			System.out.println("Maior area: X ");
		}
		else {
			System.out.println("Maior area: Y ");
		}
		

	}
	


}
