package algoritmos;

import java.util.Scanner;

public class Calculator {

    /*
    Problema:


    Pseudocodigo:

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.println("First input");
        int firstInput = input.nextInt();
        System.out.println("Second input");
        int secondInput = input.nextInt();
        System.out.println("Write the operation");
        String operation = input.next();

        switch (operation) {
            case "+":
                result = firstInput + secondInput;
                break;
            case "-":
                result = firstInput - secondInput;
                break;
            case "*":
                result = firstInput * secondInput;
                break;
            case "/":
                result = firstInput / secondInput;
                break;
            default:
                try {
                    throw new Exception("Invalid operation");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
        }


        System.out.println("The result is: " + result);
    }
}
