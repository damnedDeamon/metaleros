package poo_Algebra;

import java.util.Scanner;

/**
 * @author Matias Diaz
 * @author Daisy Hernandez
 * @author Jose donoso
 */
public class Poo_Algebra {

    public static void main(String[] args) {
        /* Se pide:
        • Desarrollar un sistema en Java que permita lo siguiente:
        ◦ Ingresar tres o cuatro puntos (Coordenada x,y).
        ◦ Según los puntos ingresados, el sistema debe identificar qué figura geométrica es.
        ◦ Además el sistema debe calcular el área y perímetro de todas las figuras. Si es necesario,
            pedir más información al usuario después de identificar la figura.
        ◦ Además el usuario debe ingresar un vector de traslación. (Coordenada x,y).
        ◦ El sistema debe mostrar los mismos puntos ingresados al inicio, pero de la figura trasladada.
        ◦ El sistema debe estar ejecutando lo dicho hasta que el usuario quiera salir. Para ello,
        después de realizar lo solicitado, usted debe preguntar si desea ejecutar de nuevo.
        ◦ Al momento de que el usuario no desee ejecutar más el programa, el sistema le debe
            entregar estadísticas, tales como:
        ▪ Cantidad de figuras ingresadas, mostrando un contador por cada una de ellas.
         */

        System.out.println("====================================");
        System.out.println("  BIENVENIDO AL SISTEMA DE FIGURAS");
        System.out.println("====================================");

        String[][] matriz = new String[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " -";

            }
        }
        System.out.print("f/c ");
        for (int f = 0; f < matriz[0].length; f++) {

            // if dejar de poner 0
            if (f >= 10) {
                System.out.print(f + "  ");
            } else {
                System.out.print(0);
                System.out.print(f + "  ");
            }
        }
        System.out.println(); // enter

        // ciclo para las filas de numeros
        for (int f = 0; f < matriz.length; f++) {

            // if dejar de poner 0 y mostrar la columna de numeros
            if (f >= 10) {
                System.out.print(f);
            } else {
                System.out.print(0);
                System.out.print(f);
            }
            // ciclo para las filas de numeros
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(" " + matriz[f][c] + " ");
            }
            System.out.println(); // enter
        }

        System.out.println("====================================");
        System.out.println("Segon la matriz que muestra el sistema");
        System.out.println("usted debe ingresar los pontos de su");
        System.out.println("figura.");
        System.out.println("Ejemplo: 0,0 - 4,0 - 0,4 - 4,4");
        System.out.println("====================================");

        Scanner leer = new Scanner(System.in);

        System.out.println("Reglas ");
        System.out.println("Solamente puede ingresar 3 0 4 coordenadas");
        System.out.println();
        System.out.print("¿Cuantos puntos decea ingresar?");

        int op = Integer.parseInt(leer.nextLine());

        if (op == 3) {
            for (int i = 1; i <= op; i++) {
                System.out.print("Ingrese fila y columna "+i+": ");
                String coordenada_1 = leer.nextLine();
                String[] posicion_1 = coordenada_1.split(",");

                String fila_1 = posicion_1[0];
                String columna_1 = posicion_1[1];

                int fila = Integer.parseInt(fila_1);
                int columna = Integer.parseInt(columna_1);
            }

        }else if (op == 4) {
            for (int i = 1; i <= op; i++) {
                System.out.print("Ingrese fila y columna "+i+": ");
                String coordenada_2 = leer.nextLine();
                String[] posicion_2 = coordenada_2.split(",");

                String fila_2 = posicion_2[0];
                String columna_2 = posicion_2[1];

                int fil = Integer.parseInt(fila_2);
                int colum = Integer.parseInt(columna_2);
            }
        }
        

    }

}
