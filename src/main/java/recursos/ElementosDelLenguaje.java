package recursos;

public class ElementosDelLenguaje {

    /**
     * @Referencia -
     * - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */

    public static void main(String[] args) {
        // Java es un lenguaje de tipado estático

        System.out.println("\n- - - - Tipos - - - - \n");

        System.out.println("tipo: byte");
        System.out.println("Mínimo: " + Byte.MIN_VALUE);
        System.out.println("Máximo: " + Byte.MAX_VALUE);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Size: " + Byte.SIZE);
        System.out.println("");

        System.out.println("tipo: short");
        System.out.println("Mínimo: " + Short.MIN_VALUE);
        System.out.println("Máximo: " + Short.MAX_VALUE);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Size: " + Short.SIZE);
        System.out.println("");

        System.out.println("tipo: short");
        System.out.println("Mínimo: " + Integer.MIN_VALUE);
        System.out.println("Máximo: " + Integer.MAX_VALUE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Size: " + Integer.SIZE);
        System.out.println("");

        System.out.println("tipo: long");
        System.out.println("Mínimo: " + Long.MIN_VALUE);
        System.out.println("Máximo: " + Long.MAX_VALUE);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Size: " + Long.SIZE);
        System.out.println("");

        System.out.println("tipo: float");
        System.out.println("Mínimo: " + Float.MIN_VALUE);
        System.out.println("Máximo: " + Float.MAX_VALUE);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Size: " + Float.SIZE);
        System.out.println("");

        System.out.println("tipo: double");
        System.out.println("Mínimo: " + Double.MIN_VALUE);
        System.out.println("Máximo: " + Double.MAX_VALUE);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Size: " + Double.SIZE);
        System.out.println("");

        System.out.println("tipo: boolean");
        System.out.println("True: " + Boolean.TRUE);
        System.out.println("False: " + Boolean.FALSE);
        System.out.println("");

        System.out.println("tipo: char");
        System.out.println("Mínimo: " + Character.MIN_VALUE);
        System.out.println("Máximo: " + Character.MAX_VALUE);
        System.out.println("Bytes: " + Character.BYTES);
        System.out.println("Size: " + Character.SIZE);
        System.out.println("");

        System.out.println("\n- - - - Literales - - - - \n");

        System.out.println("Base 10: " + 12);
        System.out.println("Base 16: " + 0x1a);
        System.out.println("Base 2: " + 0b1010);
        System.out.println("Decimales: " + 123.4);
        System.out.println("Notación científica: " + 12134e2);
        System.out.println("Identificando que es un tipo flotante: " + 1234f);
        System.out.println("Caracteres unicode: " + '\u0108');
        System.out.println("Caracteres normales: " + 'a');
        System.out.println("Caracteres especiales:");
        System.out.println("\t" + "Espacio: " + "\b ...");
        System.out.println("\t" + "Tab: " + "\t ...");
        System.out.println("\t" + "Salto de linea: " + "\n ...");
        System.out.println("\t" + "Dobles comillas: " + "\"");
        System.out.println("\t" + "Comilla simple: " + "\'C\'");
        System.out.println("\t" + "Slash invertido: " + "\\");
        System.out.println("Nulo: " + null);
        System.out.println("Separador de números: " + 123_456);

        System.out.println("\n- - - - Comentarios - - - - \n");
        // Simple comentario

        /*
            Comentario de bloque
         */

        /**
         * Comentarios de documentación
         */

        System.out.println("\n- - - - Variables - - - - \n");

        byte    byteValue    = 0;
        short   shortValue   = 1;
        int     intValue     = 2;
        long    longValue    = 3L;
        float   floatValue   = 3.0f;
        double  doubleValue  = 4.0;
        boolean booleanValue = true;
        char    charValue    = 'a';

        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue + " " +
                           floatValue + " " + doubleValue + " " + booleanValue + " " + charValue + "\n");

        System.out.println("\n- - - - Constantes & Estáticos - - - - \n");

        final int CONST_VALUE = 123456789;
        System.out.println("Constante: " + CONST_VALUE + "\n");
        // CONST_VALUE = 123 ERROR !!!

        System.out.println("Estático antes: " + StaticConst.staticValue);
        StaticConst.staticValue = -1;
        System.out.println("Estático después: " + StaticConst.staticValue + "\n");

        System.out.println("Constante & Estático: " + StaticConst.STATIC_CONST_VALUE + "\n");

        System.out.println("\n- - - - Operadores - - - - \n");

        System.out.println(" 1 > 2 = " + (1 > 2));
        System.out.println(" 1 < 2 = " + (1 < 2));
        System.out.println(" 1 >= 2 = " + (1 >= 2));
        System.out.println(" 1 <= 2 = " + (1 <= 2));
        System.out.println(" 1 == 2 = " + (1 == 2));
        System.out.println(" 1 != 2 = " + (1 != 2));

        System.out.println("\n Puertas lógicas \n");

        System.out.println("AND (&&)");
        System.out.println("false · false   = " + (false && false));
        System.out.println("false · true    = " + (false && true));
        System.out.println("true  · false   = " + (true && false));
        System.out.println("true  · true    = " + (true && true));
        System.out.println("");

        System.out.println("OR (||)");
        System.out.println("false + false   = " + (false || false));
        System.out.println("false + true    = " + (false || true));
        System.out.println("true  + false   = " + (true || false));
        System.out.println("true  + true    = " + (true || true));
        System.out.println("");

        System.out.println("NOT (!)");
        System.out.println("!false   = " + !false);
        System.out.println("!true    = " + !true);
        System.out.println("");

        System.out.println("XOR (^)");
        System.out.println("false ⊕ false   = " + (false ^ false));
        System.out.println("false ⊕ true    = " + (false ^ true));
        System.out.println("true  ⊕ false   = " + (true ^ false));
        System.out.println("true  ⊕ true    = " + (true ^ true));
        System.out.println("");

        System.out.println("\n- - - - recursos.Funciones - - - - \n");

        Funciones funciones = new Funciones();
        System.out.println("Llamada desde la función: " + funciones.getRandom());
        System.out.println("Llamada desde la función con parámetros: ");
        funciones.setRandom(79);
        System.out.println("Llamada de la función estática: " + Funciones.mathRandom());
        System.out.println("No se puede llamar variables o funciones con private" /*+ funciones.random*/);
        System.out.println("\n Tabla de modificadores de acceso \n ");
        Funciones.imprimirModificadoresAcceso();

        System.out.println("Contexto");
    }
}

class StaticConst {
    static       int staticValue        = 0;
    static final int STATIC_CONST_VALUE = 987654321;
}

class Funciones {
    private int random = 321;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    protected static double mathRandom() {
        return Math.random();
    }

    public static void imprimirModificadoresAcceso() {
        System.out.println(
                "Modificador: private - Misma clase: Si - Mismo paquete: No - SubClase: No - Otro Paquete: No");
        System.out.println(
                "Modificador: default - Misma clase: Si - Mismo paquete: Si - SubClase: No - Otro Paquete: No");
        System.out.println(
                "Modificador: protected - Misma clase: Si - Mismo paquete: Si - SubClase: Si/No - Otro Paquete: No");
        System.out.println("Modificador: public - Misma clase: Si - Mismo paquete: Si - SubClase: Si - Otro Paquete: Si");
        System.out.println("");
    }
}

