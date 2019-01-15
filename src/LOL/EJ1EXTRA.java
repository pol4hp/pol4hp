package LOL;

import java.util.Scanner;
//Elaborar un programa java que, dado un número positivo, escriba en pantalla el doble del numero entero
//resultante de invertir sus cifras. EJEMPLO: 123 A 642(EL DOBLE DE 321)




public class EJ1EXTRA {

	public static void main(String[] args) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Introduce un numero del que quieres que te devuelva el doble del numero invertido introducido que sea mayor que 0: ");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt(), numdelrevesdoble, numreves;
		if (num <= 0) {
			System.out.println("Introduce un número mayor que 0");
		}

		while (num > 0) {
			numreves = num % 10;
			num = num / 10;

			numdelrevesdoble = numreves * 2;

			System.out.print(+numdelrevesdoble);

		}

	}

}
