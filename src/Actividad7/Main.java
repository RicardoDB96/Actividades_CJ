package Actividad7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variable para obtener entradas de usario
        Scanner t = new Scanner(System.in);

        // Arreglo que guardara nuestros numeros
        int[] nums = new int[20];

        // Pedimos al usuario los 20
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el #" + (i + 1) + " numero entero: ");
            nums[i] = t.nextInt();
        }

        // Ahora sacamos el cuadrado de cada numero del arreglo
        int[] cuadrado = cuadradoArreglo(nums);

        // Y ahora el cubo de cada numero del arreglo
        int[] cubo = cuboArreglo(nums);

        // Imprimimos los resultados, empezando por el encabezado
        System.out.println("Original\tCuadrado\tCubo");

        // Imprimimos los arreglos
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "\t\t\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }

    static int[] cuadradoArreglo(int[] numeros) {
        int[] cuadrado = new int[numeros.length];

        // Calculamos el cuadrado de cada numero
        for (int i = 0; i < numeros.length; i++) {
            cuadrado[i] = numeros[i] * numeros[i];
        }

        return cuadrado;
    }

    static int[] cuboArreglo(int[] numeros) {
        int[] cubo = new int[numeros.length];

        // Calculamos el cubo de cada numero
        for (int i = 0; i < numeros.length; i++) {
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }

        return cubo;
    }
}