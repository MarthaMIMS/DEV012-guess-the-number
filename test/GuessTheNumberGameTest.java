import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.GuessTheNumberGame;
import src.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class GuessTheNumberGameTest {

    @Test
    @DisplayName("Prueba cuando la suposición es mayor que el objetivo")
    public void testGreaterThanTarget() {
        Player playerMock = mock(Player.class);
        Random randomMock = mock(Random.class);

        GuessTheNumberGame.setTargetNumber(40);
        when(playerMock.getName()).thenReturn("Irene");

        when(randomMock.nextInt(100)).thenReturn(50);
        when(playerMock.makeGuess()).thenReturn(50);

        assertTrue(GuessTheNumberGame.checkGuess(playerMock));
    }
    @Test
    @DisplayName("Prueba cuando la suposición es menor que el objetivo")
    public void testSmallerThanTarget() {
        Player playerMock = mock(Player.class);
        Random randomMock = mock(Random.class);
//Establecer el numero objetivo
        GuessTheNumberGame.setTargetNumber(40);
        when(playerMock.getName()).thenReturn("Irene");

        when(randomMock.nextInt(100)).thenReturn(30);

        // Realizar la suposición
        when(playerMock.makeGuess()).thenReturn(30);

        // Utilizar el número objetivo configurado en la lógica del juego
        assertTrue(GuessTheNumberGame.checkGuess(playerMock));
    }
    @Test
    @DisplayName("Prueba cuando la suposición es igual que el objetivo")
    public void testEqualThanTarget() {
        Player playerMock = mock(Player.class);
        Random randomMock = mock(Random.class);

        GuessTheNumberGame.setTargetNumber(40);
        when(playerMock.getName()).thenReturn("Irene");

        when(randomMock.nextInt(100)).thenReturn(40);
        when(playerMock.makeGuess()).thenReturn(40);

        assertFalse(GuessTheNumberGame.checkGuess(playerMock));
    }
/*@Test
    @DisplayName("Random")
    public void Randomtest(){
    Random randomMock = Mockito.mock(Random.class);


    when(randomMock.nextInt(100)).thenReturn(40);

    // Utilizar el mock en la clase GuessTheNumberGame
    GuessTheNumberGame randomGame = new GuessTheNumberGame();
    int result = randomGame.generatorNumber();


    assertEquals(40, result);
}*/

}

