package tv.codely.java_bootstrap;

import java.util.List;
import java.util.stream.Collectors;

public class CounterUseCase {

    public int invokeWordsMoreThan3Char(Phrase phrase) {
        List<Word> words = phrase.words();

        List<Word> wordsWithMoreThan3Characters = words
                .stream()
                .filter(Word::hasMoreThan3Characters)
                .collect(Collectors.toList());

        return wordsWithMoreThan3Characters.size();
    }

    public int invoke(Phrase phrase){
        List<Word> words = phrase.words();
        return words.size();
    }

    public int invokeWordsStartWithVowel(Phrase phrase){
        List<Word> words = phrase.words();

        List<Word> wordsStartswithaVowel = words
                .stream()
                .filter(Word::StartWithaVowel)
                .collect(Collectors.toList());

        return wordsStartswithaVowel.size();
    }
}
