package src;

import java.util.Random;

public class Computer extends Player {
    public String getName() {
        name= "computadora";
        return name;
    }
   @Override
    public int makeGuess(){
        Random random = new Random();
       int guessComputer = random.nextInt(100)+1;
       addGuess(String.valueOf(guessComputer));
       // System.out.println( guessComputer);

       return guessComputer;
   }
}
