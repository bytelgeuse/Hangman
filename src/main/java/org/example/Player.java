package org.example;

public class Player {
    private int attempts;

    public Player(int attempts){
        this.attempts = attempts;
    }
    public int getAttempts() {
        return attempts;
    }
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    public void updateAttempts(int value){
        this.attempts += value;
    }

}
