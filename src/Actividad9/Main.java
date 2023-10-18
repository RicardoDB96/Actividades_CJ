package Actividad9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciación de los dos perros
        Perro dogo1 = new Perro();
        Perro dogo2 = new Perro();

        // Petición de datos al usuario sobre los perros
        ingresoDatos(dogo1, 1);
        ingresoDatos(dogo2, 2);

        // Impresión del uso de metodos para el perro 1
        usoMetodos(dogo1);
        usoMetodos(dogo2);
    }

    // Metodo para ingresar los datos de los perros
    static void ingresoDatos(Perro p, int num) {
        // Variable para obtener entradas de usario
        Scanner t = new Scanner(System.in);

        System.out.print("\nIngrese el nombre para el perro #" + num + ": ");
        p.setNombre(t.nextLine());

        System.out.print("Ingrese el raza para el perro #" + num + ": ");
        p.setRaza(t.nextLine());

        System.out.print("Ingrese el color para el perro #" + num + ": ");
        p.setColor(t.nextLine());

        boolean error;

        do {
            // Manejo de la excepción del ingreso de la edad para el perro
            try {
                System.out.print("Ingrese la edad para el perro #" + num + ": ");
                p.setEdad(t.nextInt());
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error al ingresar la edad, ingrese un dato valido");
                error = true;
                t.next();
            }
        } while (error);
    }

    // Metodo para imprimir del uso de metodos para el perro 1
    static void usoMetodos(Perro p) {
        // Variable para obtener entradas de usario
        Scanner t = new Scanner(System.in);

        // Variables para el metodo comer
        String comida;
        double gramos;

        // Pedir datos al usuario sobre que y cuanto comio el perro
        System.out.print("\n¿Que comió " + p.getNombre() + "?: ");
        comida = t.nextLine();

        boolean error;

        do {
            // Manejo del error al ingresar los gramos
            try {
                System.out.print("¿Cuantos gramos comio " + p.getNombre() + "?: ");
                gramos = t.nextDouble();

                p.comer(comida, gramos);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error al ingresar los gramos de la comida, ingrese un dato valido");
                error = true;
                t.next();
            }
        } while (error);

        // Impresión de los demas metodos
        System.out.println(p.getNombre() + " es un " + p.getRaza() + " es de color " + p.getColor() + " y tiene una edad de " + p.getEdad());
        System.out.println(p.getNombre() + ": " + p.ladrar());
    }
}
