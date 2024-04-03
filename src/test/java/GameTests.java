import org.junit.jupiter.api.Test;

import org.example.Game;

import static org.junit.jupiter.api.Assertions.*;

public class GameTests {
    private static final Game GAME = new Game();
    private static final String WORD = "Окошко";

    @Test
    public void InitGameTest(){
        assertNotNull(GAME.getPlayer());
        assertNotNull(GAME.getWordList());
        assertNotNull(GAME.getCurrentWord());
        assertNotNull(GAME.getGuessedLetters());
    }

    @Test
    public void GetHiddenWord(){
        GAME.setCurrentWord(WORD);
        GAME.addToGuessedLetters('к');
        assertEquals(GAME.getHiddenWord(), "_к__к_");
    }

    @Test
    public void CheckLetterTest(){
        GAME.setCurrentWord(WORD);
        char trueChar = 'к';
        char falseChar = 'ц';
        assertTrue(GAME.checkLetter(trueChar));
        assertFalse(GAME.checkLetter(falseChar));
    }
}
