package com.example.consumeapi;
import java.util.Random;
public class Guess {
    private int number;
    private int score;
    private boolean ready;
    public Guess(){
        if(!ready){
        Random rand = new Random();
        number = rand.nextInt(10);
        score = 100000;
        ready = true;
        }
    }

    public void reset(){
        score = 100000;
    }
    public boolean makeGuess(int answ){

        return answ == number ? true:falseRes();
    }
    public int getGuess(){
        return number;
    }

    public int getScore(){
        return score;
    }
    private boolean falseRes(){
        score -= 10000;
        return false;
    }
}
