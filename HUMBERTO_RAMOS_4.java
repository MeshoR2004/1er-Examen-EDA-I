/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta4;

/**
 *
 * @author Humberto Ramos
 */
public class Pregunta4 {

    public static void Pregunta4(String[] L) {
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < alfabeto.length; i++) {
            int suma_alfabeto = 0;
            for (int j = 0; j < L.length; j++) {
                if (L[j] == alfabeto[i]) {
                    suma_alfabeto++;
                }
            }
            if (suma_alfabeto != 0) {
                System.out.println(alfabeto[i] + ": " + suma_alfabeto);
            }
        }
    }

    public static void main(String[] args) {
        String[] ejemplo1 = {"a", "b", "c", "a", "a", "a", "d", "b", "f",
            "a", "c", "c", "c", "f", "c", "a", "a", "a", "b", "c"};
        String[] ejemplo2 = {"x", "y", "z", "x", "y", "x", "x", "z"};
        String[] ejemplo3 = {"m", "n", "o", "p", "m", "o", "o", "n", "m", "p"};

        System.out.println("--- Ejemplo 1 ---");
        Pregunta4(ejemplo1);

        System.out.println("\n--- Ejemplo 2 ---");
        Pregunta4(ejemplo2);

        System.out.println("\n--- Ejemplo 3 ---");
        Pregunta4(ejemplo3);
    }
}
