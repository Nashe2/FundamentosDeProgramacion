package algoritmos;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Ahorro {

    /**
     * @Problema -
     * <p>
     * Se requiere un algoritmo para determinar cuánto ahorrará en pesos
     * una persona diariamente, y en un año, si ahorra 3¢ el primero de
     * enero, 9¢ el dos de enero, 27¢ el 3 de enero y así sucesivamente
     * todo el año.
     */

    /*
        Programa Ahorro
            ahorro = 3

            //Imprimir "Escribir el año que es"
            //Leer año

            año = NOW().year
            dias = 0

            Si (año % 4 == 0 && año % 100 != 0) || año % 400 == 0
                dias = 366
            Sino
                dias = 365
            FinSi

            Para (contador = 0 ; contador < dias ; contador++)
                ahorro *= 3
            FinPara

            Imprimir "El ahorro del año fue " + ahorro

        FinPrograma
     */
    public static void main(String[] args) {
        BigInteger ahorro  = new BigInteger("1");
        int        anio    = LocalDateTime.now().getYear();
        int        dias    = dias(anio);
        System.out.println("Año: " + anio + " Dias: " + dias);

        for (int conteo = 0; conteo < dias; conteo++) {
            ahorro = ahorro.multiply(BigInteger.valueOf(3));
            System.out.println("dia: " + (conteo + 1) + " ahorro: " + ahorro);
        }

        System.out.println("El ahorro es: " + (ahorro.divide(BigInteger.valueOf(100))));

    }

    public static int dias(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) ? 366 : 365;
    }
}
