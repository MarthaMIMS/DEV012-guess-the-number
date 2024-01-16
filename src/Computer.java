package src;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
    public String getName() {
        name= "computadora";
        return name;
    }
   @Override
    public void makeGuess(){
        Random random = new Random();
       int guessComputer = random.nextInt(100)+1;
       addGuess(String.valueOf(guessComputer));
       // System.out.println( guessComputer);

    }
}
