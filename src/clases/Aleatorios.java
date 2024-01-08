package clases;

import java.util.Random;
/**
 * Clase donde se indicara las funciones aleatorias
 * @author diglesias
 * @version 1.0
 */
public class Aleatorios {
/**
 * Función que genera N numeros aleatorios indicados por el usuario
 * @param cantidad numero entero que indica cuantos numeros aleatorios se generará
 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}
/**
 * Funcion que genera N numeros aleatorios indicados por el usuario, teniendo los numeros
 * aleatorios un maximo indicado por el usuario
 * @param cantidad Numero entero que indica cuantos numeros aleatorios se van a generar
 * @param max El numero maximo al que llegara los numeros aleatorios
 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}
/**
 * Funcion que genera N numeros aleatorios indicados por el usuario, teniendo los numeros 
 * aleatorios un numero minimo y un numero maximo
 * @param cantidad la cantidad de numeros aleatorios que se generará
 * @param minimo El numero minimo que generará el numero aleatorio
 * @param maximo El numero maximo que generara el numero aleatorio
 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
