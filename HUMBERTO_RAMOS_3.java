/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta3;

/**
 *
 * @author Humberto Ramos
 */
public class Pregunta3 {

    public static void Pregunta3(int[] a) {
        int suma_pares = 0;
        int suma_impares = 0;
        int resultado = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { //es par
                suma_pares += a[i];
            } else { //es impar
                suma_impares += a[i];
            }
        }

        resultado = suma_pares - suma_impares;

        System.out.println("Suma de pares: " + suma_pares + "\n"
                + "suma de impares:" + suma_impares + "\n"
                + "Resultado: " + resultado);
    }

    public static void main(String[] args) {
        int[] ejemplo1 = {2, 3, 4, 5};
        int[] ejemplo2 = {10, 15, 20, 25, 30};
        int[] ejemplo3 = {1, 2, 3, 4, 5, 6};

        System.out.println("--- Ejemplo 1 ---");
        Pregunta3(ejemplo1);

        System.out.println("\n--- Ejemplo 2 ---");
        Pregunta3(ejemplo2);

        System.out.println("\n--- Ejemplo 3 ---");
        Pregunta3(ejemplo3);
    }

}
