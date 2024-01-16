package src;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player {
public String getName() {
    Scanner entrada = new Scanner(System.in);
    //  HumanPlayer prueba = new HumanPlayer();
    System.out.println("Escriba su nombre");
    name = entrada.nextLine();
   // System.out.println("Hola " + name);
    return name;
}

    @Override
    public void makeGuess() {
        Scanner number = new Scanner(System.in);
        int saveNumber;
        System.out.println("Digite un numero");
        saveNumber= Integer.parseInt(String.valueOf(number.nextInt()));
        addGuess(String.valueOf(saveNumber));
       // System.out.println(saveNumber);
    }


}