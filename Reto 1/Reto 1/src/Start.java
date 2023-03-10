/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
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
        String text1 = "amor";
        String text2 = "roma";
        boolean checkAnagrama;

        checkAnagrama= checkAnagramaMethod(text1,text2);
        System.out.println("Resultado de la valoración: "+ checkAnagrama);
        if(checkAnagrama){
            System.out.println("Las palabras -" + text1+ "- y -"+ text2+ "- son anagramas");
        }else{
            System.out.println("Las palabras -" + text1+ "- y -"+ text2+ "- NO son anagramas");
        }



    }
    public static boolean checkAnagramaMethod(String t1, String t2) {
        int i=0;
        String textReverse="";

        for (i = t1.length() - 1; i >= 0; i--) {
            textReverse = textReverse + t1.charAt(i);
        }
        if (textReverse.equalsIgnoreCase(t2)) {
            return true;
        } else {
            return false;
        }

    }






}
