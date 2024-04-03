import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Player;
public class PlayerTests {
    private static final int PLAYER_ATTEMPTS = 5;
    private static final Player PLAYER = new Player(PLAYER_ATTEMPTS);

    @Test
    public void GetAttemptsTest(){
        assertEquals(PLAYER.getAttempts(), PLAYER_ATTEMPTS);
    }

    @Test
    public void SetAttemptsTest(){
        int currentAttempts = 3;
        PLAYER.setAttempts(currentAttempts);
        assertEquals(PLAYER.getAttempts(), currentAttempts);
    }

    @Test
    public void UpdateAttemptsTest(){
        int currentAttempts = PLAYER.getAttempts();
        int updateValue = -1;
        PLAYER.updateAttempts(updateValue);
        assertEquals(PLAYER.getAttempts(), currentAttempts + updateValue);
    }
}
