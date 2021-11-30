package recursividad;


public class fibonacciConRecursividad {

    private static Object fibonacciConRecursividad;

    public static void main(String[] args) {
        fibonacciConRecursividad = new  fibonacciConRecursividad();
        System.out.println("La sucesion de fibonacci de 12 mediante Recursividad es" + fibonacciConRecursividad (12));
        fibonacciConRecursividad = new  fibonacciConRecursividad();
        System.out.println("La sucesion de fibonacci de 12 mediante Ciclo es" + fibonacciCiclo (12));

    }

    public static int fibonacciConRecursividad(int n) {
        if ( n==1 || n==2){
            // Caso base (Respuesta Explicita)
            return 1;
        }
        else {
            //Dominio (problema -1)
            return  fibonacciConRecursividad(n-1) + fibonacciConRecursividad(n-2);

        }
    }
    public static int fibonacciCiclo(int n){
        int fibo = 0, primero = 1, segundo = 0;
        while (n > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;

        }
        // n=4-1=3-1=2-1=1-1=0 fibo=0=1=1=3 primero=1=0=1=2 segundo=0=1=1=3
        return fibo;
    }
}

