import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import org.example.WordList;

import static org.junit.jupiter.api.Assertions.*;


public class WordListTests {

    private final WordList wordList = new WordList();

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

    @Test
    public void removeWordTest(){
        String word = wordList.getRandom();
        wordList.removeWord(word);
        assertFalse(wordList.getList().contains(word));
    }
}
