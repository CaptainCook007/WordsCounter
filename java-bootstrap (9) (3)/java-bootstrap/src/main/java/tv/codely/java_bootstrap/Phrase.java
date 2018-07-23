package tv.codely.java_bootstrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Phrase {

    final private String phrase;

    public Phrase(String phrase) {
        this.phrase = phrase;
    }

    public List<Word> words() {
        String[] rawWordsArray = phrase.split(" ");

        return Arrays.stream(rawWordsArray).map(Word::new).collect(Collectors.toList());
    }


}
