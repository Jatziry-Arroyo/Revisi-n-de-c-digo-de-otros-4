package com.generation;
import java.util.Scanner;

  public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //se agrego System.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        if (j1.equals(j2)) { //se cambio equals en lugar de ==
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { //se cambio equals en lugar de ==
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) { //se cambio equals en lugar de ==
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) { //se cambio equals en lugar de ==
                        g = 1;
                    }
                    break; //se agregaron los break 
                default:
                    System.out.println("Entrada no válida");
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close();
    }
  }



