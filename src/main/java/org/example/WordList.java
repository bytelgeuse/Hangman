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

    public List<String> getList() {
        return list;
    }

    public String getRandom(){
        int randomIndex = (int) (Math.random() * (list.size() - 1));
        return list.get(randomIndex);
    }

    public void removeWord(String word){
        list.remove(word);
    }


}
