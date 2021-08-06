

import java.util.Scanner;

public class tipoDeCadeana {
    public static void main(String args[]) {
        char caracter;
        caracter = new Scanner(System.in).nextLine().charAt(0);

        if (Character.isDigit(caracter)) {
            System.out.println("Es un número");
        } else if (Character.isLetter(caracter)) {
            System.out.println("Es una letra");
        } else {
            System.out.println("Es un simbolo");
        }
    }
}