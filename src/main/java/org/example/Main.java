package org.example;

public class Main {
    public static void main(String[] args) {
        Game hangman = new Game();
        System.out.println("Игра \"Виселица\"");
        System.out.println("Правила:\n " +
                "Вам загадывается некоторое слово\n" +
                "Слово нужно отгадать до того, как закончатся ваши попытки\n" +
                "Чтобы отгдать слово вводите поочередно буквы\n" +
                "Если введеная буква не присутствует в слове, у вас отнимается попытка\n" +
                "Начнем!\n");
        while(hangman.start() != 1) {
            hangman.updateCurrentWord();
        }
    }
}