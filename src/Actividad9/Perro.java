package Actividad9;

public class Perro {

    // Atributos del metodo Perro
    private String nombre, raza, color;
    private int edad;

    // Metodos getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo para comer
    public void comer(String comida, double gramos) {
        System.out.println(this.nombre + " esta comiendo " + gramos + " gramos de " + comida);
    }

    // Metodo para ladrar
    public String ladrar() {
        return "¡Guau, guau!";
    }
}
