package src;

import java.util.ArrayList;

public abstract class Player {
    String name;
    ArrayList<String> guesses;
    public Player() {
        guesses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public abstract int makeGuess();

    public ArrayList<String> getGuesses(){
     return guesses;
    }
    public void addGuess(String guess) {
        guesses.add(guess);
    }
}
