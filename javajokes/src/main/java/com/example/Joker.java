package com.example;

import java.util.Random;

public class Joker {

    String[] jokes = new String[]{"What's brown and sticky? A stick!"};

    public String getJoke() {
        Random generator = new Random();
        int i = generator.nextInt(jokes.length);
        return jokes[i];
    }

}
