package recursividad;

public class Ejercicios {
    /*

    Factorial de un numero
5! = 5 * 4 * 3 * 2 * 1
4! = 4 * 3 * 2 * 1
3! = 3 * 2 * 1
2! = 2 * 1
1! = 1
5!= 5*4
4!=4*3
3!=3*2
2!=2*1
1!=1
    */

    public static int factorial(int n) {
        int factorial;
        if (n == 1) {
            //caso base
            factorial = n;
        } else {
            factorial = n * factorial(n - 1);

        }
        return factorial;
    }

    /*
    Maximo comun divisor(mcd), algoritmo de Euclides
    a = 412 y b = 184
    */
    public static int mcd(int a, int b) {
        int mcd;
        if (a == b) {
            //caso base
            mcd = b;

        } else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;

            }
            mcd = mcd(a, b);
        }
        return mcd;
    }


    /*
     * Metodo recursivo para comparar dos vectores de elementos por elemento
     * vector1 = {5,6,2}
     * vector2 = {2,9,2}
     * diferencia=3-3+0=6
     * */
    private static int compararVectores(int[] vector1, int[] vector2, int indice) {
        int sumaDiferencias;
        if (indice == vector1.length - 1) {// caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);

        } else {// llamada recursiva

            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }
        return sumaDiferencias;

    }

    /*
     * Metodo auxiliar que realiza la llamada al metodo recursivo*/
    public static boolean compararVectores(int[] vector1, int[] vector2) {
        return compararVectores(vector1, vector2, 0) == 0;
    }
}