package ar.edu.unju.fi.ejercicio11;

/**
 * 11. Uso de <code>for</code>.
 *
 * @author Gutierrez Angel Gonzalo
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int i, j, number = 80;
        for (i = 2, j = 40; j > 0; i++, j--) {
            System.out.print(number + " ");
            number += (j-i-1);
        }
    }
}
