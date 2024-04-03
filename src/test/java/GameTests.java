import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.example.Game;
public class GameTests {
    private static final Game GAME = new Game();
    private static final String WORD = "Окошко";

    @Test
    public void InitGameTest(){
        assertNotNull(GAME.getPlayer());
        assertNotNull(GAME.getWordList());
    }

    @Test
    public void GetHiddenWord(){
        GAME.setCurrentWord(WORD);
        GAME.addToGuessedLetters('к');
        assertEquals(GAME.getHiddenWord(), "_к__к_");
    }
}
