package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    //todo заполнить нормальными словами
    

    private static final List<String> list = new ArrayList<String>() {{
        add("Слова");
        add("Для");
        add("Теста");
    }};

    public static List<String> getList() {
        return list;
    }
}
