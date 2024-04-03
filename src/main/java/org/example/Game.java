package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private final Player player;
    private final WordList wordList;

    private String currentWord;

    private Set<Character> guessedLetters;

    public Game(){
        System.out.println("Инициализация игры \"Виселица\"...");
        player = new Player();
        wordList = new WordList();
        guessedLetters = new HashSet<>();
        currentWord = wordList.getRandom();
        System.out.println("Инициализация завершена");
    }

    public Player getPlayer() {
        return player;
    }

    public WordList getWordList() {
        return wordList;
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    public Set<Character> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(Set<Character> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }

    public void addToGuessedLetters(char c){
        this.guessedLetters.add(c);
    }

    public String getHiddenWord(){
        StringBuilder current = new StringBuilder(this.currentWord.toLowerCase());

        for(int i = 0; i < current.length(); i++){
            if(!guessedLetters.contains(current.charAt(i)))
                current.replace(i,i+1,"_");
        }

        return current.toString();
    }

    public boolean checkLetter(char c){
        if(currentWord.toLowerCase().contains(String.valueOf(c))) {
            addToGuessedLetters(c);
            return true;
        }
        else {
            player.updateAttempts(-1);
            return false;
        }
    }

    public void updateCurrentWord(){
        wordList.removeWord(currentWord);
        setCurrentWord(wordList.getRandom());
    }

    public int start(){
        if(player.getAttempts() != 0){
            int counter = 0;
            for(int i = 0; i < currentWord.length(); i++)
                if(guessedLetters.contains(currentWord.toLowerCase().charAt(i)))
                    counter++;
            System.out.println(counter);
            if(counter == currentWord.length()) {
                System.out.println("\nВы отгадали слово!\n");
                return 0;
            }
        }
        System.out.println("\nУ вас закончились попытки!\n");
        return 1;
    }

}
