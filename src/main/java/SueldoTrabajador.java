import java.util.Scanner;

public class SueldoTrabajador {
    /*PROBLEMA SUELDOTRABAJADOR:
    Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en las horas trabajadas
    y el pago por hora, considerando que después de las 40 hrs cada hora se considera como excedente y se paga doble.

    PSEUDOCÓDIGO:

  Programa SueldoTrabajador
        Imprimir "Ingrese horas trabajadas"
        Leer horas

        Imprimir "Ingresa Costo por hora"
        Leer costo
        sueldo=0

        Si (horas<=40)
            sueldo= horas*costo
        Sino
            doble= costo*2
            horasExtra=horas-40
            sueldo= horaExtra*doble
            sueldonormal= 40*costo
            sueldo+=sueldonormal
        FinSi

        Imprimir "El sueldo es: " + sueldo
    FinPrograma
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresé horas trabajadas");
        int horas = entrada.nextInt();

        System.out.println("Ingresé el Costo por hora");
        int costo = entrada.nextInt();
        int sueldo = 0;

        if (horas <= 40) {
            sueldo = horas * costo;
        } else {
            int doble = costo * 2;
            int horasExtra = horas - 40;
            sueldo = horasExtra * doble;
            int sueldoNormal = 40 * costo;
            sueldo += sueldoNormal;
        }

        System.out.println("El sueldo es: " + sueldo);
    }
}
