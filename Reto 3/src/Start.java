/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Start {
    public static void main(String[] args) {

        int numero = 8;
        boolean checkPrimo = false;

        checkPrimo = esPrimo(numero);

        System.out.println(checkPrimo);

        mostrarPrimeros100Primos();


    }

    public static boolean esPrimo(int num) {
        if(num <= 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        int limite = (int)Math.sqrt(num);
        for(int i = 3; i <= limite; i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarPrimeros100Primos() {
        int i = 0;
        int num = 2;
        while(i < 100) {
            if(esPrimo(num)) {
                System.out.print(num + " ");
                i++;
            }
            num++;
        }
    }





    /*
-Comprobar si el número es menor o igual a 1, si es así, no es primo. Si el número es igual a 2, es primo.
-Si el número es par y diferente de 2, no es primo.
-Comprobar si hay algún número entero entre 2 y la raíz cuadrada del número que lo divide exactamente. Si se encuentra algún divisor, el número no es primo.
-Si no se encuentra ningún divisor, el número es primo.
     */


}
