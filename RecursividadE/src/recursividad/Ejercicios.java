package recursividad;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
      /*
    Factorial de un numero
    5!=5*4*3*2*1
    4!=4*3*2*1
    5!=5*4!
    4!=4*3!
    2!=2*1!
    */

    public static int factorial(int n){
        int factorial;

        if (n == 1) {
            //caso base
            factorial = n;
        }
        else {
            factorial = n * factorial(n-1);
        }

        return factorial;
    }
    /*
    --COMPARAR DOS VECTORES CON RECURSIVIDAD--
    vector1 = {5, 6, 2}
    vector2 = {2, 9, 2}
    resultado = 3 + 3 + 0 = 6
     */
    private static int compararVectores(int[] vector1, int[] vector2, int indice) {
        int sumaDiferencias;

        if (indice == vector1.length - 1) { //caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        } else { //llamada recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }

        return sumaDiferencias;
    }

    /*
    Metodo auxiliar que realiza la llamada al metodo recursivo
     */
    public static boolean compararVectores(int[] vector1, int[] vector2) {
        return compararVectores(vector1, vector2, 0) == 0;
    }

/*
--FIBONACI--
 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        for (int i = 0; i < limite; i++) {
            System.out.print(funcionFibonacci(i) + ", ");
        }
    }

    private static int funcionFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
    }

    /*
    Metodo recursivo para calcular el maximo valor de un vector
    vector = {2, 9, 6, 7, 6, 3, 4, 3}
     */
    private static int maximoVector(int[] vector, int indice, int maximo) {
        if (indice == vector.length - 1) { //caso base
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
        } else { //llamada a la recursividad
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }

            maximo = maximoVector(vector, indice + 1, maximo);
        }

        return maximo;
    }

    /*
    Metodo auxiliar que llama al metodo recursivo
     */
    public static int maximoVector(int[] vector) {
        return maximoVector(vector, 0, 0);
    }

    /*
    --INDICE DE UN VECTOR--
    */
    public static int indiceVector(int[] vector, int indice) {
        int contador = 0;
        if (indice == vector.length - 1) {//caso base
            if (indice == vector[indice]) {
                contador++;
            }
        } else {//llamada recursiva

            if (indice == vector[indice]) {
                contador++;
            }
            contador = contador + indiceVector(vector, indice + 1);

        }
        return contador;

    }

    public static boolean indiceVector(int[] vector) {
        return indiceVector(vector, 0) > 0;

    }

    /*
    --INDICE VECTOR--

     */
    private static class main {
        static Scanner entrada = new Scanner(System.in);
        static int GetInt(String cadena) {
            int numero;
            do{
                try {
                    System.out.printf(cadena + "\n");
                    numero = entrada.nextInt();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("¡Cuidado! Solo puedes insertar números. \\n");
                    entrada.next();
                }
            }while(true);
            return numero;
        }
        static int BusquedaRecursiva(int [] vec, int n, int dato) {
            if (n ==0 && vec[n]== dato)
                return n;
            else if( n==0)
                return -1;
            else if (vec[n]==dato)
                return n;
            else
                return BusquedaRecursiva(vec, n-1,dato);
        }
        public static void main(String[] args) {

            int n,dato,retorno;
            n= GetInt("por favor ingresar el tamano del vector:");
            int [] vec= new int [n];
            for(int i=0; i<n; i++) {
                vec[i] = GetInt("Introduzca número " + i + ":");
            }
            dato= GetInt("Por favor ingresar el dato a buscar:");
            retorno=BusquedaRecursiva(vec, n-1,dato);
            if(retorno==dato)
                System.out.println("El dato se encuentra en el vector y en el indice concide");
            else if (retorno>-1)
                System.out.println("El dato se encuentra en el vector pero el indice no concide");
            else
                System.out.println("El dato no se encuentra:");
        }
    }
}
