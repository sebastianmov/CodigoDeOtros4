package com.generation;

/*
 * El programa simula el juego piedra, papel o tijeras, entre dos jugadores.
 * Se inicia el metodo main y se instancia la clase Scanner para poder ingresar datos en la consola.
 * Se piden los datos de entrada del jugador 1 y se guarda en la variable j1.
 * Se piden los datos de entrada del jugador 2 y se guarda en la variable j2.
 * Se comparan los valores con equalsIgnoreCase para evaluar si son iguales o diferentes y saber cual es el ganador con respecto a las condiciones establecidas.
 * Se imprime en consola el ganador.
 * Se cierra el Scanner.
 */

import java.util.Scanner; // Se tiene que importar el paquete para poder hacer uso de Scanner

public class Codigo4 {

	public static void main(String[] args) { // faltaba invocar el metodo main

		Scanner s = new Scanner(System.in); // hace falta System.in dentro de Scanner para iniciarlo

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // el numero de jugador es el 2 en lugar del 1
		String j2 = s.nextLine();

		if (j1.equalsIgnoreCase(j2)) {// se implementa el metodo equalsIgnoreCase, para comparar dos cadenas en busca de igualdad, sin tener en cuenta las diferencias de mayúsculas y minúsculas
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equalsIgnoreCase("tijeras")) { // se implementa el metodo equalsIgnoreCase
					g = 1;
				}
				break; // se coloca un break para terminar la funcion en caso de no concretarlo con la condicion
			case "papel":
				if (j2.equalsIgnoreCase("piedra")) {
					g = 1;
				} // falta una llave de cierre
				break; // se coloca un break
			case "tijeras": // faltaba una s
				if (j2.equalsIgnoreCase("papel")) {
					g = 1;
				}
				break;
			default:
				break; // se coloca un break
			}
			System.out.println("Gana el jugador " + g);
		}
		s.close(); // se coloca un cierre del scanner
	} // faltaba una llave de cierre
}