import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        /*PROBLEMA 2:
        Sacar el promedio dado n califiaciones, el resutado tiene que ser sin decimales y en dado
        caso si el promedio es menor a 6, se tendrá queimprimir que está reprobado

        PSEUDOCÓDIGO:
        Programa Promedio
            Imprimir "Escribe cuantas calificaciones son"
            Leer contadorCalificaciones

            sumatoriaCalificaciones=0;
            conteo=0;

            Mientras (conteo < contadorCalificaciones) Haz

                Imprimir " Escribir la calificacion "+ conteo
                Leer calificacion

                sumatoriaCalificacion*= calificacion
                conteo*=1

             FinMientras

             promedio =sumatoriaCalificacio /contadorCalificaciones

             Si promedio < 6
                Imprimir " Estás REPROBADO"
             Sino
                Imprimir " Estás APROBADO " + promedio
             FinSi

        FinPrograma
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las calificaciones:");

        int contadorCalificaciones = entrada.nextInt();
        int sumatoriaCalificacion = 0;

        /*
        int conteo = 0;

        while (conteo < contadorCalificaciones) {
            System.out.println("Escribe la calificacion " + conteo);
            int calificacion = entrada.nextInt();
            sumatoriaCalificacion += calificacion;
            conteo += 1;
        }
        */

        for (int conteo = 0; conteo < contadorCalificaciones; conteo++) {
            System.out.println("Escribe la calificacion " + conteo);
            int calificacion = entrada.nextInt();
            sumatoriaCalificacion += calificacion;
        }

        int promedio = sumatoriaCalificacion / contadorCalificaciones;

        if (promedio < 6) {
            System.out.println("Estás REPROBADO");
        } else {
            System.out.println("Estás APROBADO " + promedio);
        }

    }
}
