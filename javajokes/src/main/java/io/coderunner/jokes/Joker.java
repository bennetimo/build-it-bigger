package io.coderunner.jokes;

import java.util.Random;

public class Joker {

    private Random generator = new Random();
    private String[] jokes = new String[]{
            "What's brown and sticky? A stick!",
            "There are only 10 types of people in this world...those who understand binary and those who don't",
            "What's orange and sounds like a parrot? A carrot!"
    };

    public String getJoke() {
        int i = generator.nextInt(jokes.length);
        return jokes[i];
    }

}
