
package Estudiante;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
/*
Algoritmo que calcula
el promedio de edad de estudiantes de ingenieria
el numero de estudiantes que estudian ingenieria
el porcentaje de hombres de la universidad
el porcentaje de las mujeres que estudian ingenieria
el numero de hombres de la universidad
numero de mujeres que estudian ingenieria:1
*/
public class Estudiante {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner buscar = new Scanner(System.in);

        int n, edad;
        String sexo;
        String carrera;
        int estudiantesIng = 0, hombresUniversidad = 0, mujeresIngenieria = 0, porcentajeHombresUniversidad = 0, porcentajeMujeresIng = 0;
        double suma = 0, promedioEdadIng, promedioEdad = 0;
        System.out.println("ingrese el numero de estudiantes");
        n = buscar.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese la edad del estudiante "+i);
            edad = buscar.nextInt();
            System.out.println("ingrese f si sexo es femenino O m si es masculino");
            sexo = buscar.next().intern();
            System.out.println("ingrese  ing si estudia ingenieria O otras si no estudia ingenieria");
            carrera = buscar.next().intern();

            if (carrera == "ing") {
                suma = suma + edad;
                estudiantesIng++;
                promedioEdadIng = suma / estudiantesIng;
                promedioEdad = Math.round(promedioEdadIng);
            }
            if (sexo == "m") {
                hombresUniversidad++;
                porcentajeHombresUniversidad = (100 * hombresUniversidad) / n;
            }
            if (sexo == "f") {
                mujeresIngenieria++;
                porcentajeMujeresIng = (100 * mujeresIngenieria) / n;

            }
        }
        System.out.println("la suma de edades es :" + suma);
        System.out.println("el promedio de edad de estudiantes de ing es:" + promedioEdad);
        System.out.println("el numero de estudiantes que estudian ingenieria es:" + estudiantesIng);
        System.out.println("el porcentaje de hombres de la universidad es:" + porcentajeHombresUniversidad);
        System.out.println("el porcentaje de las mujeres que estudian ingenieria es:" + porcentajeMujeresIng);
        System.out.println("el numero de hombres de la universidad es:" + hombresUniversidad);
        System.out.println("numero de mujeres que estudian ingenieria:" + mujeresIngenieria);

    }

}

