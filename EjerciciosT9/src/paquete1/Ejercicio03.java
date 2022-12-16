/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int suma = 0;
        double resultado;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }

        resultado = (double) suma / arreglo.length;
        System.out.printf("la media aritmetica es: %.2f\n", resultado);

        for (int i = 0; i < arreglo.length; i++) {

            if ((arreglo[i] > resultado)) {
                elementosArribaMedia = elementosArribaMedia + 1;

            } else {
                if (arreglo[i] < resultado) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;

                }

            }

        }
        System.out.println("Los elementos arriba de la media es: "
                + elementosArribaMedia);
        System.out.println("Los elementos arriba de la media es: "
                + elementosAbajoMedia);

    }// se crea variables para sacar la media luego se procede a agregar 
    // condiciones las cuales nos permiten saber cuantos elementos estan arriba
    // de la media y cuantos abajo

}
