import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTests {
    private static final Game GAME = new Game();

    @Test
    public void InitGameTest(){
        assertNotNull(GAME.getPlayer());
        assertNotNull(GAME.getWordList());
    }
}
