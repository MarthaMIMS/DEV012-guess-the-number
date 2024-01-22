package src;

import java.util.Scanner;

public class HumanPlayer extends Player {
public HumanPlayer() {
    Scanner entrada = new Scanner(System.in);
    //  HumanPlayer prueba = new HumanPlayer();
    System.out.println("Escriba su nombre");
    name = entrada.nextLine();
   // System.out.println("Hola " + name);
}

    @Override
    public int makeGuess() {
        Scanner number = new Scanner(System.in);
        System.out.println("Digite un numero");
        int saveNumber = number.nextInt();
        addGuess(String.valueOf(saveNumber));
        return saveNumber;
    }


}