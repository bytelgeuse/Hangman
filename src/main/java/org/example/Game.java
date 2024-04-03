package org.example;

public class Game {
    private final Player player;
    private final WordList wordList;

    public Game(){
        player = new Player();
        wordList = new WordList();
    }

    public Player getPlayer() {
        return player;
    }

    public WordList getWordList() {
        return wordList;
    }
}
