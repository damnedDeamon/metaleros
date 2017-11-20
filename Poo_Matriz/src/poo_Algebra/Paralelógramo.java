package poo_Algebra;

public class Paralelógramo {

    private int fila_1;
    private int columna_1;
    private int fila_2;
    private int columna_2;
    private int fila_3;
    private int columna_3;
    private int fila_4;
    private int columna_4;
    private int absoluto_1;
    private int absoluto_2;
    private int absoluto_3;
    private int absoluto_4;
    
    public Paralelógramo(int fila_1, int columna_1, int fila_2, int columna_2, int fila_3, int columna_3, int fila_4, int columna_4) {
        this.fila_1 = fila_1;
        this.columna_1 = columna_1;
        this.fila_2 = fila_2;
        this.columna_2 = columna_2;
        this.fila_3 = fila_3;
        this.columna_3 = columna_3;
        this.fila_4 = fila_4;
        this.columna_4 = columna_4;
    }

    public void calculoPararelogramo() {
        double resta_1, resta_2, resta_3, resta_4, resta_5, resta_6, resta_7, resta_8;
        double suma_1, suma_2, suma_3, suma_4;
        double multi_1, multi_2, multi_3, multi_4, multi_5, multi_6, multi_7, multi_8;
        double raiz_cuadrada_1 = 0, raiz_cuadrada_2 = 0, raiz_cuadrada_3 = 0, raiz_cuadrada_4 = 0;
        
        /**
         * Calculo del punto 1
         */
        resta_1 = fila_1 - fila_2;
        resta_2 = columna_1 - columna_2;

        multi_1 = resta_1 * resta_1;
        multi_2 = resta_2 * resta_2;

        suma_1 = multi_1 + multi_2;

        raiz_cuadrada_1 = Math.sqrt(suma_1);
        
        /**
         * Calculo del punto 2
         */
        resta_3 = fila_2 - fila_3;
        resta_4 = columna_2 - columna_3;

        multi_3 = resta_3 * resta_3;
        multi_4 = resta_4 * resta_4;

        suma_2 = multi_3 + multi_4;

        raiz_cuadrada_2 = Math.sqrt(suma_2);
        
        /**
         * Calculo del punto 3
         */
        resta_5 = fila_3 - fila_4;
        resta_6 = columna_3 - columna_4;

        multi_5 = resta_5 * resta_5;
        multi_6 = resta_6 * resta_6;

        suma_3 = multi_5 + multi_6;

        raiz_cuadrada_3 = Math.sqrt(suma_3);
        
        /**
         * Calculo del punto 4
         */
        resta_7 = fila_4 - fila_1;
        resta_8 = columna_4 - columna_1;

        multi_7 = resta_7 * resta_7;
        multi_8 = resta_8 * resta_8;

        suma_4 = multi_7 + multi_8;

        raiz_cuadrada_4 = Math.sqrt(suma_4);
        /**
         * Modificar la variable double a int 
         */
        absoluto_1 = (int) Math.abs(raiz_cuadrada_1);
        absoluto_2 = (int) Math.abs(raiz_cuadrada_2);
        absoluto_3 = (int) Math.abs(raiz_cuadrada_3);
        absoluto_4 = (int) Math.abs(raiz_cuadrada_4);
        
        System.out.println("Valor del punto 1 y 2: " + absoluto_1);
        System.out.println("Valor del punto 2 y 3: " + absoluto_2);
        System.out.println("Valor del punto 3 y 4: " + absoluto_3);
        System.out.println("Valor del punto 4 y 1: " + absoluto_4);

        if (absoluto_1 == absoluto_2 &
            absoluto_2 == absoluto_3 &
            absoluto_3 == absoluto_4 & 
            absoluto_4 == absoluto_1 &
            fila_1 == fila_2 &
            fila_3 == fila_4 &
            columna_1 != columna_2 &
            columna_3 != columna_4) {
            
            System.out.println();
            System.out.println("Cuadrado");
        
        }else if(absoluto_1 == absoluto_2 &
                 fila_1 < fila_2 &
                 columna_1 > columna_2 &
                 fila_3 > fila_4 &
                 columna_3 < columna_4 ){
            
                 System.out.println();
                 System.out.println("Rombo");
        
        }

    }
    public void perimetro(){
        int perimetro =  absoluto_1 + absoluto_2 + absoluto_3 + absoluto_4;
        System.out.println("Perimetro de su figura: "+perimetro);
    }
    
    

    public int getFila_1() {
        return fila_1;
    }

    public void setFila_1(int fila_1) {
        this.fila_1 = fila_1;
    }

    public int getColumna_1() {
        return columna_1;
    }

    public void setColumna_1(int columna_1) {
        this.columna_1 = columna_1;
    }

    public int getF_2() {
        return fila_2;
    }

    public void setF_2(int f_2) {
        this.fila_2 = f_2;
    }

    public int getC_2() {
        return columna_2;
    }

    public void setC_2(int c_2) {
        this.columna_2 = c_2;
    }

    public int getFil_3() {
        return fila_3;
    }

    public void setFil_3(int fil_3) {
        this.fila_3 = fil_3;
    }

    public int getColumn_3() {
        return columna_3;
    }

    public void setColumn_3(int column_3) {
        this.columna_3 = column_3;
    }

    public int getF_4() {
        return fila_4;
    }

    public void setF_4(int f_4) {
        this.fila_4 = f_4;
    }

    public int getC_4() {
        return columna_4;
    }

    public void setC_4(int c_4) {
        this.columna_4 = c_4;
    }

    public void calculo() {
        System.out.println("Test");
    }

}
