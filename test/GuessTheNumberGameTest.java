import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.GuessTheNumberGame;
import src.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


class GuessTheNumberGameTest {

    @Test
    @DisplayName("Prueba cuando la suposición es mayor que el objetivo")
    public void testGreaterThanTarget() {
        Player playerMock = Mockito.mock(Player.class);
        Random randomMock = Mockito.mock(Random.class);
        ArrayList<Integer> guessesList = new ArrayList<>();
        int targetNumber = 80;
        when(randomMock.nextInt(100)).thenReturn(targetNumber);
        System.out.println(targetNumber);
        // comportamiento esperado del jugador
        when(playerMock.getGuesses()).thenReturn((ArrayList<String>) guessesList.stream().map(String::valueOf).collect(Collectors.toList()));
        when(playerMock.getName()).thenReturn("Irene");
        //  devolver un número mayor que el objetivo
        when(playerMock.makeGuess()).thenReturn(90);
        // Ejecutar
        assertFalse(GuessTheNumberGame.checkGuess(playerMock));
    }
    @Test
    @DisplayName("Prueba cuando la suposición es menor que el objetivo")
    public void testSmallerThanTarget() {
        Player playerMock = Mockito.mock(Player.class);
        Random randomMock = Mockito.mock(Random.class);
        ArrayList<Integer> guessesList = new ArrayList<>();
        int targetNumber = 80;
        when(randomMock.nextInt(100)).thenReturn(targetNumber);
        System.out.println(targetNumber);
        //  comportamiento esperado del jugador
        when(playerMock.getGuesses()).thenReturn((ArrayList<String>) guessesList.stream().map(String::valueOf).collect(Collectors.toList()));
        when(playerMock.getName()).thenReturn("Irene");
        //  devolver un número menor que el objetivo
        when(playerMock.makeGuess()).thenReturn(70);
        // Ejecutar
        assertTrue(GuessTheNumberGame.checkGuess(playerMock));

    }
    @Test
    @DisplayName("Prueba cuando la suposición es igual que el objetivo")
    public void testEqualThanTarget() {
         Player playerMock = Mockito.mock(Player.class);
    Random randomMock = Mockito.mock(Random.class);

    ArrayList<Integer> guessesList = new ArrayList<>();

    int targetNumber = 80;
    when(randomMock.nextInt(100)).thenReturn(targetNumber);
    System.out.println(targetNumber);

    when(playerMock.getGuesses()).thenReturn((ArrayList<String>) guessesList.stream().map(String::valueOf).collect(Collectors.toList()));
    when(playerMock.getName()).thenReturn("Irene");
    when(playerMock.makeGuess()).thenReturn(80);

    assertTrue(GuessTheNumberGame.checkGuess(playerMock));
    }
}

