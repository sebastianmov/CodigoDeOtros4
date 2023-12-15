package com.generation;

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
