package algoritmos;

import java.util.Scanner;

/**
 * @Problema -
 * <p>
 * El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
 * asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios:
 * <p>
 * Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de $2000.00; con promedio mayor o
 * igual a 7.5, de $1000.00; para los promedios menores de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás
 * se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar.
 * <p>
 * A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 9, se les dará $3000; con
 * promedios menores a 9 pero mayores o iguales a 8, $2000; para los alumnos con promedios menores a 8 pero
 * mayores o iguales a 6, se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
 * invitación. Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo.
 */

/*
    Programa Beca
    Imprimir "Ingrese la cantidad de alumnos de la universidad"
    Leer alumnos

    Repita (contador = 0 ; contador < alumnos ; Aumenta contador 1) Haz
        Imprimir "Ingresa el nombre del alumno"
        Leer nombre

        Imprimir "Ingresa la edad del alumno"
        Leer edad

        Imprimir "Ingresa el promedio del alumno"
        Leer promedio

        beca = 0

        Si edad > 18
            Si promedio >= 9
                beca = 2000.0
            Sino promedio < 9 && promedio >= 7.5
                beca = 1000.0
            Sino promedio < 7.5 && promedio <= 6.0
                beca = 500.0
            Sino
                beca = 0.0
            FinSi
        SiNo
            Si promedio >= 9
                beca = 3000.0
            Sino promedio < 9 && promedio >= 8.0
                beca = 2000.0
            Sino promedio < 8 && promedio <= 6.0
                beca = 100.0
            Sino
                beca = 0.0
            FinSi
        FinSi

        Si beca != 0
            Imprimir "Nombre: " + nombre + ", Beca: " + beca
        Sino
            Imprimir "Nombre: " + nombre + " esfuerzate más crack"

        FinRepite
    FinPrograma
 */
public class Beca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de alumnos de la universidad");
        int alumnos = Integer.parseInt(input.nextLine());

        for (int conteo = 0; conteo < alumnos; conteo++) {
            double beca;

            System.out.println("Ingresa el nombre del alumno");
            String nombre = input.nextLine();
            System.out.println("Ingresa la edad del alumno");
            int edad = Integer.parseInt(input.nextLine());
            System.out.println("Ingresa el promedio del alumno");
            double promedio = Double.parseDouble(input.nextLine());

            if (edad > 18) {
                beca = (promedio >= 9) ? 2000.0 :
                       (promedio < 9 && promedio >= 7.5) ? 1000.0 :
                       (promedio < 7.5 && promedio >= 6) ? 500.0 :
                       0.0;
            } else {
                beca = (promedio >= 9) ? 3000.0 :
                       (promedio < 9 && promedio >= 8) ? 2000.0 :
                       (promedio < 8 && promedio >= 6) ? 100.0 :
                       0.0;
            }

            if (beca > 0.0) {
                System.out.println("Nombre: " + nombre + ", Beca: " + beca);
            } else {
                System.out.println(nombre + " esfuérzate más crack");
            }

            System.out.println("\n");
        }

    }
}
