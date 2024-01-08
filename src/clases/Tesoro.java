package clases;

import java.util.Random;
/**
 * Clase donde se indicara la funciones del juego del tesoro
 */
public class Tesoro {
	/**
	 * Atributo que indica el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;
	/**
	 * Atributo donde indica el tesoro en el eje X
	 */
	static int xTesoro;
	/**
	 * Atributo donde indica el tesoro en el eje Y
	 */
	static int yTesoro;
	/**
	 * Atributo que indica el jugador en el eje X
	 */
	int xJugador = 1;

	/**
	 * 
	 * Atributo que indica el jugador en el ejeY
	 */
	int yJugador = 1;

	/**
	 * Funcion que genera un tesoro en el eje X e Y teniendo en cuenta el tamaño del tablero
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Funcion que imprime en consola el tablero y donde esta posicionado el jugador
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}
	/**
	 * Funcion que permite al jugador moverse por el tablero tener que salir del tablero
	 * @param movimiento Cadena que indica donde se moverá el jugador (Arriba,Abajo,Derecha,Izquierda)
	 * @return Numero entero que indica si ha hecho un buen movimiento 
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}
	/**
	 * Funcion que indica si el jugador esta en la misma posicion que el tesoro
	 * @return Devuelve booleano cuando el jugador esta o no en la misma posicion que el tesoro
	 */
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
