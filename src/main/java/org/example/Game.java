package org.example;

public class Game {
    private final Player player;
    private final WordList wordList;

    public Game(){
        System.out.println("Инициализация игры \"Виселица\"...");
        player = new Player();
        wordList = new WordList();
        System.out.println("Инициализация завершена");
    }

    public Player getPlayer() {
        return player;
    }

    public WordList getWordList() {
        return wordList;
    }
}
