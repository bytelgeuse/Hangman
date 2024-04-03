import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import org.example.WordList;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class WordListTests {

    private static final WordList wordList = new WordList();

    @Test
    public void ListIsNotNullTest(){
        List<String> list = wordList.getList();
        assertNotNull(list);
    }

    @Test
    public void GetRandomWordTest(){
        String randomWord = wordList.getRandom();
        assertNotNull(randomWord);
    }
}
