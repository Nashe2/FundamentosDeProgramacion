import java.util.Scanner;

public class Beca {

    /*
El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la asignación
de becas mensuales, para esto se tomarán en consideración los siguientes criterios:

    Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de $2000.00;
    con promedio mayor o igual a 7.5, de $1000.00;
    para los promedios menores de 7.5 pero mayores o iguales a 6.0, de $500.00;
    a los demás se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar.


    A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 9, se les dará $3000;
    con promedios menores a 9 pero mayores o iguales a 8, $2000;
    para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará $100,
    y a los alumnos que tengan promedios menores a 6 se les enviará carta de invitación.

    Programa Beca
        Imprimir "Ingresé la edad del alumno"
        Leer edad

        Imprimir "Ingresé promedio"
        Leer promedio

        Si (edad > 18)
            Si (promedio>=9) Haz
                Imprimir "La beca es de $2000.00"
            sino ((promedio <9 && promedio >=7.5))
                Imprimir "La beca es de $1000.00"
            Sino (((promedio <7.5 && promedio >= 6)))
                Imprimir "La beca es de $500.00"
            Sino
                Imprimir " Carta Invitación: Estudien más en el próximo ciclo escolar"

          Sino (edad <=18)
            Si (promedio>=9)
                 Imprimir "La beca es de $3000.00"
            Sino ((promedio<9 && promedio>=8))
                 Imprimir "La beca es de $2000.00
            Sino (((promedio<8 && promedio>=6)))
                Imprimir "La beca es de $100.00"
            Sino
                Imprimir "Te Invitamos a mejorar tu promedio para participar en la beca..."
        FinSi

    FinPrograma

    Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de $2000.00;
    con promedio mayor o igual a 7.5, de $1000.00;
    para los promedios menores de 7.5 pero mayores o iguales a 6.0, de $500.00;
    a los demás se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar.


    A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 9, se les dará $3000;
    con promedios menores a 9 pero mayores o iguales a 8, $2000;
    para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará $100,
    y a los alumnos que tengan promedios menores a 6 se les enviará carta de invitación.

    Programa Beca

        Imprimir "Ingresé la cantidad de alumnos de la universidad"
        Leer alumnos

        Para conteo=0; alumnos<conteo; conteo++

            Imprimir "Ingresé la edad del alumno"
            Leer edad

            Imprimir "Ingresé promedio"
            Leer promedio

            Si (edad > 18)
                Si (promedio>=9) Haz
                    Imprimir "La beca es de $2000.00"
                sino ((promedio <9 && promedio >=7.5))
                    Imprimir "La beca es de $1000.00"
                Sino (((promedio <7.5 && promedio >= 6)))
                    Imprimir "La beca es de $500.00"
                Sino
                    Imprimir " Carta Invitación: Estudien más en el próximo ciclo escolar"

          Sino (edad <=18)
                Si (promedio>=9)
                     Imprimir "La beca es de $3000.00"
                Sino ((promedio<9 && promedio>=8))
                     Imprimir "La beca es de $2000.00"
                Sino (((promedio<8 && promedio>=6)))
                    Imprimir "La beca es de $100.00"
                Sino
                    Imprimir "Te Invitamos a mejorar tu promedio para participar en la beca..."
            FinSi
        FinPara
    FinPrograma
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresé la cantidad de alumnos de la universidad");
        int alumnos = entrada.nextInt();

        for (int conteo = 0; conteo < alumnos; conteo++) {
            System.out.println("Ingresé la edad del alumno");
            int edad = entrada.nextInt();
            System.out.println("Ingresé el promedio del alumno");
            float promedio = entrada.nextFloat();

            if (edad > 18) {
                if (promedio >= 9) {
                    System.out.println("La beca es de $2000.00");
                } else if (promedio < 9 && promedio >= 7.5) {
                    System.out.println("La beca es de $1000.00");
                } else if (promedio < 7.5 && promedio >= 6) {
                    System.out.println("La beca es de $500.00");
                } else {
                    System.out.println(" Carta Invitación: Estudien más en el próximo ciclo escolar");
                }
            } else if (edad <= 18 && edad>0)  {
                if (promedio >= 9) {
                    System.out.println("La beca es de $3000.00");
                } else if (promedio < 9 && promedio >= 8) {
                    System.out.println("La beca es de $2000.00");
                } else if (promedio < 8 && promedio >= 6) {
                    System.out.println("La beca es de $100.00");
                } else {
                    System.out.println("Te Invitamos a mejorar tu promedio para participar en la beca...");
                }
            }else {
                System.out.println("Error");
            }
        }

    }
}
