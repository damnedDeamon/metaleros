package poo_Algebra;

public class Triangulo {

    private int fil_1, fil_2;
    private int colum_1, colum_2;
    private int fil_3, colum_3;

    public Triangulo(int fil_1, int fil_2, int colum_1, int colum_2, int fil_3, int colum_3) {
        this.fil_1 = fil_1;
        this.fil_2 = fil_2;
        this.colum_1 = colum_1;
        this.colum_2 = colum_2;
        this.fil_3 = fil_3;
        this.colum_3 = colum_3;
    }

    public void equilatero() {
        // Calculo de las figuras
        double resta_1, resta_2, suma_1;
        double multi_1, multi_2, raiz_cuadrada = 0, potencia_1, potencia_2, exponente = 2;

        resta_1 = fil_1 - fil_2;
        resta_2 = colum_1 - colum_2;

        potencia_1 = Math.pow(resta_1, exponente);
        potencia_2 = Math.pow(resta_2, exponente);

        suma_1 = potencia_1 + potencia_2;

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

        int absoluto_1 = (int) Math.abs(raiz_cuadrada);
        int absoluto_2 = (int) Math.abs(raiz_cuad);
        int absoluto_3 = (int) Math.abs(raiz);

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
}
