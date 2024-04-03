package org.example;

import java.util.*;

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
        Scanner console = new Scanner(System.in);
        String playerLetter;

        while(player.getAttempts() != 0) {
            System.out.println("Загаданное слово: " + getHiddenWord() + "\n");

            do {
                System.out.print("Введите вашу букву: ");
                playerLetter = console.nextLine();
            } while (playerLetter.toCharArray().length > 1);

            if(checkLetter(playerLetter.charAt(0))){
                if(player.getAttempts() != 0){
                    int counter = 0;
                    for(int i = 0; i < currentWord.length(); i++)
                        if(guessedLetters.contains(currentWord.toLowerCase().charAt(i)))
                            counter++;
                    if(counter == currentWord.length()) {
                        System.out.println("Вы отгадали слово \"" + getCurrentWord() + "\"!\n\n");
                        return 0;
                    }
                }
            }
            else {
                switch (player.getAttempts()) {
                    case (3):
                        System.out.println("\nВы подошли к табуретке\n");
                        break;
                    case (2):
                        System.out.println("\nВы встали на табурет\n");
                        break;
                    case (1):
                        System.out.println("\nВы накинули петлю\n");
                        break;
                    case (0):
                        System.out.println("\nВы погибли!\n");
                        break;

                }
            }



        }

        System.out.println("\nУ вас закончились попытки!\n");
        System.out.println("Загаданное слово: " + getCurrentWord() + "\n");
        return 1;
    }

}
