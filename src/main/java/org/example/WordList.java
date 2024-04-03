package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    private static final List<String> list = new ArrayList<String>() {{
        add("Яблоко");
        add("Машина");
        add("Кресло");
        add("Планета");
        add("Университет");
        add("Город");
    }};

    public static List<String> getList() {
        return list;
    }
}
