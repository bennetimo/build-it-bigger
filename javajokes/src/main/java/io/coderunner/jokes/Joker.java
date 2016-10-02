package io.coderunner.jokes;

import java.util.Random;

public class Joker {

    private Random generator = new Random();
    private String[] jokes = new String[]{
            "What's brown and sticky? A stick!",
            "There are only 10 types of people in this world...those who understand binary and those who don't",
            "What's orange and sounds like a parrot? A carrot!",
            "Standing in the park, I was wondering why a Frisbee gets larger the closer it gets. Then it hit me.",
            "My name is Fin, which means it's very hard for me to end emails without sounding pretentious.",
            "I was watching the London Marathon and saw one runner dressed as a chicken and another runner dressed as an egg. I thought: 'This could be interesting'.",
            "I needed a password eight characters long so I picked Snow White and the Seven Dwarfs.",
            "I went to buy some camouflage trousers the other day but I couldn't find any.",
            "I heard a rumour that Cadbury is bringing out an oriental chocolate bar. Could be a Chinese Wispa.",
            "I had an argument with one of the seven dwarfs. He wasn’t happy.",
            "The early bird gets the worm but the late worm gets to live.",
            "I’ve decided to sell my Hoover… well, it was just collecting dust.",
            "I saw a documentary on how ships are kept together. Riveting!"

    };

    public String getJoke() {
        int i = generator.nextInt(jokes.length);
        return jokes[i];
    }

}
