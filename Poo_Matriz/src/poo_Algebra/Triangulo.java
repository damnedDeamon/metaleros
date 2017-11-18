package poo_Algebra;

public class Triangulo {

    private int fil_1, fil_2;
    private int colum_1, colum_2;
    private int fil_3, colum_3;
    private int absoluto_1;
    private int absoluto_2;
    private int absoluto_3;
    private int dividir = 0;
    private int vector1;
    private int vector2;
    
    public Triangulo(int fil_1, int fil_2, int colum_1, int colum_2, int fil_3, int colum_3) {
        this.fil_1 = fil_1;
        this.fil_2 = fil_2;
        this.fil_3 = fil_3;
        this.colum_1 = colum_1;
        this.colum_2 = colum_2;
        this.colum_3 = colum_3;
    }
    public Triangulo(int vector1, int vector2){
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public void calculoTriangulo() {
        // Calculo de las figuras
        double resta_1, resta_2, suma_1;
        double multi_1, multi_2, raiz_cuadrada = 0;

        resta_1 = fil_1 - fil_2;
        resta_2 = colum_1 - colum_2;

        multi_1 = resta_1 * resta_1;
        multi_2 = resta_2 * resta_2;

        suma_1 = multi_1 + multi_2;

        raiz_cuadrada = Math.sqrt(suma_1);

        double rest_1, rest_2, sum_1;
        double mul_1, mul_2, raiz_cuad = 0;

        rest_1 = fil_2 - fil_3;
        rest_2 = colum_2 - colum_3;

        mul_1 = rest_1 * rest_1;
        mul_2 = rest_2 * rest_2;

        sum_1 = mul_1 + mul_2;

        raiz_cuad = Math.sqrt(sum_1);

        double res_1, resta, su_1;
        double mu_1, mu_2 = 0, raiz = 0;

        res_1 = fil_3 - fil_1;
        resta = colum_3 - colum_1;

        mu_1 = res_1 * res_1;
        mul_2 = resta * resta;

        su_1 = mu_1 + mu_2;
        raiz = Math.sqrt(su_1);

        absoluto_1 = (int) Math.abs(raiz_cuadrada);
        absoluto_2 = (int) Math.abs(raiz_cuad);
        absoluto_3 = (int) Math.abs(raiz);

        double resta_0_1 = colum_2 - colum_1;
        double resta_1_0 = fil_2 - fil_1;
        double div = resta_0_1 / resta_1_0;

        double resta_2_2 = colum_3 - colum_2;
        double resta_2_0 = fil_3 - fil_2;
        double div_2 = resta_2_2 / resta_2_0;

        double resta_3_3 = colum_3 - colum_1;
        double resta_3 = fil_3 - fil_1;
        double div_3 = resta_3_3 / resta_3;

        int resultado = (int) Math.abs(div);
        int resultado_1 = (int) Math.abs(div_2);
        int resultado_2 = (int) Math.abs(div_3);
        
        System.out.println("Valor del punto 1 y 2: " + absoluto_1);
        System.out.println("Valor del punto 2 y 3: " + absoluto_2);
        System.out.println("Valor del punto 3 y 1: " + absoluto_3);
        

        if (absoluto_1 == absoluto_2 && absoluto_2 == absoluto_3) {
            System.out.println();
            System.out.println("Equilatero");

        } else if (absoluto_1 == absoluto_2 || absoluto_2 == absoluto_3 || absoluto_1 == absoluto_3) {
            System.out.println();
            System.out.println("Isosceles");

        } else if (absoluto_1 != absoluto_2 && absoluto_2 != absoluto_3 && absoluto_1 != absoluto_3) {
            System.out.println();
            System.out.println("Escaleno");

        }
        
        
        
        
    }

    public void perimetro() {
        int perimetro = absoluto_1 + absoluto_2 + absoluto_3;
        
        System.out.println("Perimetro de su figura: " + perimetro);
    }
    
    
    public void setFil_1(int fil_1) {
        this.fil_1 = fil_1;
    }

    public void setFil_2(int fil_2) {
        this.fil_2 = fil_2;
    }

    public void setColum_1(int colum_1) {
        this.colum_1 = colum_1;
    }

    public void setColum_2(int colum_2) {
        this.colum_2 = colum_2;
    }

    public void setFil_3(int fil_3) {
        this.fil_3 = fil_3;
    }

    public void setColum_3(int colum_3) {
        this.colum_3 = colum_3;
    }

    public int getFil_1() {
        return fil_1;
    }

    public int getFil_2() {
        return fil_2;
    }

    public int getColum_1() {
        return colum_1;
    }

    public int getColum_2() {
        return colum_2;
    }

    public int getFil_3() {
        return fil_3;
    }

    public int getColum_3() {
        return colum_3;
    }
}
