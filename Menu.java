package com.cursoceat.calculadora;
import java.util.*;
public class Menu {
	static double num1, num2;
	static public void miMenu() {
			  Scanner scn = new Scanner(System.in); 
	    	  Numeros num = new Numeros();
		int opcion = 0;
		do {
			System.out.println();
			System.err.println("      |===================================|");
			System.out.println("\t\u2744        CALCULADORA        \u2744");
			System.out.println("\t¿Qué operación desea realizar?");
			System.err.println("      |===================================|");
			System.out.println("\t\t1\u27A1  Suma");
			System.out.println("\t\t2\u27A1  Resta");
			System.out.println("\t\t3\u27A1  Multiplicar");
			System.out.println("\t\t4\u27A1  Dividir");
			System.out.println("\t\t5\u27A1  Resto");
			System.out.println("\t\t6\u27A1  Exponencial");
			System.out.println("\t\t7\u27A1  ¡Hasta luego!");
			System.err.println("      |===================================|");
			opcion = new Scanner(System.in).nextInt();
			 
	           if (opcion >= 1 && opcion <= 6) {
	               System.out.print("\t\t1\u27A1 Ingrese el primer operando >> ");
	               num1 = new Scanner (System.in).nextDouble();
	               num.setNum1(num1);
	              
	               System.out.print("\t\t2\u27A1 Ingrese el segundo operando >> ");
	               num2 = new Scanner (System.in).nextDouble();
	               num.setNum2(num2);
	           }
			switch (opcion) {
			case 1: System.out.print("\t\t1\u27A1 Resultado >> "+ num.suma(num1,num2));
				break;
			case 2: System.out.print("\t\t2\u27A1 Resultado >> "+ num.resta(num1,num2));
				break;
			case 3: System.out.print("\t\t3\u27A1 Resultado >> "+ num.multiplicar(num1,num2));
				break;
			case 4: System.out.print("\t\t4\u27A1 Resultado >> "+ num.dividir(num1,num2));
				break;
			case 5: System.out.print("\t\t5\u27A1 Resultado >> "+ num.resto(num1,num2));
				break;
			case 6: System.out.print("\t\t6\u27A1 Resultado >> "+ num.exponencial(num1,num2));
				break;
			case 7: System.err.print("\t\t7\u27A1 ¡Hata luego! >> ");
				break;
			default: System.err.print("\t\t8\u27A1 ERROR. Tu seleccion es incorrecta...");
				break;
				
			}
			System.out.println();
				
		}while(opcion!=8);
		
	}
}

