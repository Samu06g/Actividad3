package git.conversortemperaturas;

import java.util.Scanner;
public class ConversorTemperaturas {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al convertidor de temperatura\n");
	System.out.print("Ingrese el valor que desea convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Ingrese 1 para el convertidor de Celsius a Fahrenheit....");
	System.out.println("  Ingrese 2 para el convertidor de Fahrenheit a Celsius....");
	System.out.print("\nnIngrese su valor aquí...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversión está aquí.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversión está aquí.. "+value3+"�C");
		}
	System.out.println("\n\t¡¡Gracias!!..");
	}
}
