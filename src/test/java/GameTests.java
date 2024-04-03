import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.example.Game;
public class GameTests {
    private static final Game GAME = new Game();

    @Test
    public void InitGameTest(){
        assertNotNull(GAME.getPlayer());
        assertNotNull(GAME.getWordList());
    }
}
