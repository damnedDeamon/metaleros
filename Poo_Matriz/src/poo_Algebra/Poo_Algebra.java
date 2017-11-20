package poo_Algebra;

import java.util.Scanner;

/**
 * @author Matias Diaz
 * @author Daisy Hernandez
 * @author Jose donoso
 */
public class Poo_Algebra {

    public static void main(String[] args) throws InterruptedException {
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
        int opcion = 0;
        int op;
        int cont = 0;

        int fil_1 = 0;
        int colum_1 = 0;
        int fil_2 = 0;
        int colum_2 = 0;
        int fil_3 = 0;
        int colum_3 = 0;

        int fi_1 = 0;
        int co_1 = 0;
        int fi_2 = 0;
        int co_2 = 0;
        int fi_3 = 0;
        int co_3 = 0;
        int fi_4 = 0;
        int co_4 = 0;

        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("  BIENVENIDO AL SISTEMA DE FIGURAS");
        System.out.println("====================================");

        String[][] matriz = new String[20][20];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ".";

            }
        }
        System.out.print("  ");
        for (int f = 0; f < matriz[0].length; f++) {

            // if dejar de poner 0
            if (f >= 10) {
                System.out.print(f + " ");
            } else {
                System.out.print(0);
                System.out.print(f + " ");
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
        while (true) {

            System.out.println("====================================");
            System.out.println("Segun la matriz que muestra el sistema usted");
            System.out.println("debe ingresar los puntos de su figura.");
            System.out.println("Ejemplo: 0,0 - 4,0 - 0,4 - 4,4");
            System.out.println("====================================");
            while (true) {
                try {
                    System.out.print("Cuantas figuras desea ingresar: ");
                    opcion = Integer.parseInt(leer.nextLine());

                    if (opcion <= 0) {
                        System.err.println("Ingrese solo numeros positivos");

                    } else if (opcion >= 1) {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Ingrese solo numeros");
                }
            }

            for (int i = 0; i < opcion; i++) {
                System.out.println("============================================");
                System.out.println("Reglas ");
                System.out.println("Solamente puede ingresar 3 o 4 coordenadas");
                System.out.println("============================================");
                while (true) {
                    try {
                        System.out.print("Cuantos puntos desea ingresar: ");
                        op = Integer.parseInt(leer.nextLine());
                        if (op == 3 || op == 4) {
                            break;
                        } else if (op != 3 || op != 4) {
                            System.err.println("Error de opcion ingrese(3 o 4)!");
                        }
                    } catch (Exception e) {
                        System.err.println("Ingrese solo numeros");

                    }
                }

                if (op == 3) {
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 1: ");
                            String coordenada_1 = leer.nextLine();
                            String[] posicion_1 = coordenada_1.split(",");

                            String fila_1 = posicion_1[0];
                            String columna_1 = posicion_1[1];

                            fil_1 = Integer.parseInt(fila_1);
                            colum_1 = Integer.parseInt(columna_1);

                            matriz[fil_1][colum_1] = "x";
                            break;

                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 2: ");
                            String coordenada_2 = leer.nextLine();

                            String[] posicion_2 = coordenada_2.split(",");

                            String fila_2 = posicion_2[0];
                            String columna_2 = posicion_2[1];

                            fil_2 = Integer.parseInt(fila_2);
                            colum_2 = Integer.parseInt(columna_2);

                            matriz[fil_2][colum_2] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }

                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 3: ");
                            String coordenada_3 = leer.nextLine();
                            String[] posicion_3 = coordenada_3.split(",");

                            String fila_3 = posicion_3[0];
                            String columna_3 = posicion_3[1];

                            fil_3 = Integer.parseInt(fila_3);
                            colum_3 = Integer.parseInt(columna_3);

                            matriz[fil_3][colum_3] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }
                    }
                    Triangulo t = new Triangulo(fil_1, fil_2, colum_1, colum_2, fil_3, colum_3);
                    t.calculoTriangulo();
                    t.perimetro();

                    System.out.println();
                    System.out.print("  ");
                    for (int f = 0; f < matriz[0].length; f++) {
                        if (f >= 10) {
                            System.out.print(f + " ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + " ");
                        }
                    }
                    System.out.println();
                    for (int f = 0; f < matriz.length; f++) {
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        for (int c = 0; c < matriz[f].length; c++) {
                            System.out.print(" " + matriz[f][c] + " ");
                        }
                        System.out.println();

                    }
                    if (true) {
                        matriz[fil_1][colum_1] = ".";
                        matriz[fil_2][colum_2] = ".";
                        matriz[fil_3][colum_3] = ".";
                    }
                    System.out.printf("=============");
                    System.out.printf(" Ingrese vector de traslacion  ");
                    System.out.printf("=============");
                    System.out.println("");
                    String Vec = leer.nextLine();
                    String[] vector = Vec.split(",");

                    String v1 = vector[0];
                    String v2 = vector[1];

                    int vector1 = Integer.parseInt(v1);
                    int vector2 = Integer.parseInt(v2);

                    int v_1 = vector1 + fil_1;
                    int v_2 = vector2 + colum_1;

                    matriz[v_1][v_2] = "x";

                    int v_3 = vector1 + fil_2;
                    int v_4 = vector2 + colum_2;

                    matriz[v_3][v_4] = "x";

                    int v_5 = vector1 + fil_3;
                    int v_6 = vector2 + colum_3;

                    matriz[v_5][v_6] = "x";

                    /**
                     * Nueva idea ingresada. Mostrar la posicion de la
                     * traslacion.
                     */
                    if (vector1 <= -1 & vector2 <= -1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("superior hisquierda");
                        Thread.sleep(5000);

                    } else if (vector1 >= 1 & vector2 >= 1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("inferior derecha");
                        Thread.sleep(5000);

                    } else if (vector1 <= -1 & vector2 >= 1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("superior derecha");
                        Thread.sleep(5000);

                    } else if (vector1 <= 1 & vector2 <= -1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("inferior hisquierda");
                        Thread.sleep(5000);

                    } else if (vector1 == 0 & vector2 == 0) {
                        System.out.println("La figura no sera trasladada");
                        Thread.sleep(3000);
                    }

                    System.out.println();
                    System.out.print("  ");
                    for (int f = 0; f < matriz[0].length; f++) {
                        if (f >= 10) {
                            System.out.print(f + " ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + " ");
                        }
                    }
                    System.out.println();
                    for (int f = 0; f < matriz.length; f++) {
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        for (int c = 0; c < matriz[f].length; c++) {
                            System.out.print(" " + matriz[f][c] + " ");
                        }
                        System.out.println();

                    }
                    System.out.println("===========================");
                    System.out.println("Nuevos puntos de su figura");
                    System.out.println("punto 1: " + v_1 + "," + v_2);
                    System.out.println("punto 2: " + v_3 + "," + v_4);
                    System.out.println("punto 3: " + v_5 + "," + v_6);

                    matriz[v_1][v_2] = ".";
                    matriz[v_3][v_4] = ".";
                    matriz[v_5][v_6] = ".";
                    

                } else if (op == 4) {
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 1: ");
                            String coor_1 = leer.nextLine();
                            String[] pos_1 = coor_1.split(",");

                            String f_1 = pos_1[0];
                            String c_1 = pos_1[1];

                            fi_1 = Integer.parseInt(f_1);
                            co_1 = Integer.parseInt(c_1);

                            matriz[fi_1][co_1] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 2: ");
                            String coor_2 = leer.nextLine();
                            String[] pos_2 = coor_2.split(",");

                            String f_2 = pos_2[0];
                            String c_2 = pos_2[1];

                            fi_2 = Integer.parseInt(f_2);
                            co_2 = Integer.parseInt(c_2);

                            matriz[fi_2][co_2] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 3: ");
                            String coor_3 = leer.nextLine();
                            String[] pos_3 = coor_3.split(",");

                            String f_3 = pos_3[0];
                            String c_3 = pos_3[1];

                            fi_3 = Integer.parseInt(f_3);
                            co_3 = Integer.parseInt(c_3);

                            matriz[fi_3][co_3] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Ingrese fila y columna 4: ");
                            String coor_4 = leer.nextLine();
                            String[] pos_4 = coor_4.split(",");

                            String f_4 = pos_4[0];
                            String c_4 = pos_4[1];

                            fi_4 = Integer.parseInt(f_4);
                            co_4 = Integer.parseInt(c_4);

                            matriz[fi_4][co_4] = "x";
                            break;
                        } catch (Exception e) {
                            System.err.println("Ingresar solo cordenadas positivas ej: (3,4)");
                        }

                    }
                    Paralelógramo p = new Paralelógramo(fi_1, fi_2, co_1, co_2, fi_3, co_3, fi_4, co_4);
                    p.calculoPararelogramo();
                    p.perimetro();

                    System.out.println();
                    System.out.print("  ");
                    for (int f = 0; f < matriz[0].length; f++) {
                        if (f >= 10) {
                            System.out.print(f + " ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + " ");
                        }
                    }
                    System.out.println();

                    for (int f = 0; f < matriz.length; f++) {
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        for (int c = 0; c < matriz[f].length; c++) {
                            System.out.print(" " + matriz[f][c] + " ");
                        }
                        System.out.println();
                    }
                    if (true) {
                        matriz[fi_1][co_1] = ".";
                        matriz[fi_2][co_2] = ".";
                        matriz[fi_3][co_3] = ".";
                        matriz[fi_4][co_4] = ".";

                    }
                    System.out.printf("=============");
                    System.out.printf(" Ingrese vector de traslacion  ");
                    System.out.printf("=============");
                    System.out.println("");
                    String Vec = leer.nextLine();
                    String[] vector = Vec.split(",");

                    String v1 = vector[0];
                    String v2 = vector[1];

                    int vector1 = Integer.parseInt(v1);
                    int vector2 = Integer.parseInt(v2);

                    int v_1 = vector1 + fi_1;
                    int v_2 = vector2 + co_1;
                    matriz[v_1][v_2] = "x";

                    int v_3 = vector1 + fi_2;
                    int v_4 = vector2 + co_2;
                    matriz[v_3][v_4] = "x";

                    int v_5 = vector1 + fi_3;
                    int v_6 = vector2 + co_3;
                    matriz[v_5][v_6] = "x";

                    int v_7 = vector1 + fi_4;
                    int v_8 = vector2 + co_4;
                    matriz[v_7][v_8] = "x";

                    /**
                     * Nueva idea ingresada. Mostrar la posicion de la
                     * traslacion.
                     */
                    if (vector1 <= -1 & vector2 <= -1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("superior hisquierda");
                        Thread.sleep(5000);

                    } else if (vector1 >= 1 & vector2 >= 1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("inferior derecha");
                        Thread.sleep(5000);

                    } else if (vector1 <= -1 & vector2 <= 1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("superior derecha");
                        Thread.sleep(5000);

                    } else if (vector1 <= 1 & vector2 <= -1) {
                        System.out.println("La figura sera ");
                        System.out.println("trasladada a la posicion ");
                        System.out.println("inferior hisquierda");
                        Thread.sleep(5000);

                    } else if (vector1 == 0 & vector2 == 0) {
                        System.out.println("La figura no sera trasladada");
                        Thread.sleep(3000);
                    }

                    System.out.println();
                    System.out.print("  ");
                    for (int f = 0; f < matriz[0].length; f++) {
                        if (f >= 10) {
                            System.out.print(f + " ");
                        } else {
                            System.out.print(0);
                            System.out.print(f + " ");
                        }
                    }
                    System.out.println();
                    for (int f = 0; f < matriz.length; f++) {
                        if (f >= 10) {
                            System.out.print(f);
                        } else {
                            System.out.print(0);
                            System.out.print(f);
                        }
                        for (int c = 0; c < matriz[f].length; c++) {
                            System.out.print(" " + matriz[f][c] + " ");
                        }
                        System.out.println();

                    }
                    System.out.println("===========================");
                    System.out.println("Nuevos puntos de su figura");
                    System.out.println("punto 1: " + v_1 + "," + v_2);
                    System.out.println("punto 2: " + v_3 + "," + v_4);
                    System.out.println("punto 3: " + v_5 + "," + v_6);
                    System.out.println("punto 4: " + v_7 + "," + v_8);

                    matriz[v_1][v_2] = ".";
                    matriz[v_3][v_4] = ".";
                    matriz[v_5][v_6] = ".";
                    matriz[v_7][v_8] = ".";

                }
            }

            System.out.println("Desea ejecutar de nuevo? ");
            System.out.println("1.- Si");
            System.out.println("2.- No");
            int num = Integer.parseInt(leer.nextLine());

            if (num == 2) {
                break;
            }
        }

    }
}
