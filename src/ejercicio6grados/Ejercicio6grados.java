/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6grados;

/**
 *
 * @author evaren
 */
public class Ejercicio6grados {

    /**
     * Método que convierte grados Farenheit a Celsius.
     *
     * @param faren Grados Farenheit introducidos por el usuario.
     * @return Devuelve el resultado de convertir grados Farenheit a Celsius.
     */
    public static double farenheittocelsius(double faren) {
        double celsius;
        celsius = (faren - 32) * 5 / 9;
        return celsius;
    }

    /**
     * Método que convierte grados Celsius a Farenheit.
     *
     * @param celsius Grados Celsius introducidos por el usuario.
     * @return Devuelve el resultado de convertir grados Celsius a Farenheit.
     */
    public static double celsiustufarenheit(double celsius) {
        double faren;
        faren = (0 * 9 / 5) + 32;

        return faren;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EVA - EJERCICIO 6 - ENTORNOS DE DESARROLLO

    }

}
