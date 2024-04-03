import org.junit.jupiter.api.Test;

import java.util.List;
import org.example.WordList;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class WordListTests {

    @Test
    public void ListIsNotNullTest(){
        List<String> list = WordList.getList();
        assertNotNull(list);
    }
}
