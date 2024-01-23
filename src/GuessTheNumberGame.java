package src;

import java.util.ArrayList;
import java.util.Random;

public class GuessTheNumberGame {
    private Player player;
    private Random random;
    private static int targetNumber;
    // private  static String playerName;
    private static ArrayList<String> userNumber;

    public static void setTargetNumber(int number) {
        targetNumber = number;
    }

    public static void main(String[] args) {
        targetNumber = generatorNumber();
        System.out.println(targetNumber);

        HumanPlayer usuario = new HumanPlayer();//Llame a humanPlayer y captura el nombre
        Computer computerPlayer = new Computer();
        boolean humanTurn = true;


        while (true) {
            //  System.out.println("Turno de " + playerName);
            if (humanTurn) {
                if (!checkGuess(usuario)) {
                    break;  //
                }
            } else {
                if (!checkGuess(computerPlayer)) {
                    break;
                }
            }

            humanTurn = !humanTurn;  // Cambia el turno
        }
    }
    public static  int generatorNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(100)+1;
        //System.out.println(number);
        return targetNumber;
    }
    public static boolean checkGuess(Player player){

        ArrayList<String> playerGuesses = player.getGuesses();
        String playerName = player.getName();

        System.out.println("Turno de " + playerName);

        int lastGuess = player.makeGuess();
        System.out.println(playerName + ": Supuso " + lastGuess);

        if (lastGuess > targetNumber) {
            System.out.println("Digite un número menor");
        } else if (lastGuess < targetNumber) {
            System.out.println("Digite un numero mayor");
        } else {
            System.out.println("¡Felicidades, " + playerName + "! Has adivinado el número.");
            System.out.println("Historial de suposiciones:");
            for (String guess : playerGuesses) {
                System.out.println(guess);
            }
            return false;  //  terminado
        }

        return true;  // continua
    }

}

