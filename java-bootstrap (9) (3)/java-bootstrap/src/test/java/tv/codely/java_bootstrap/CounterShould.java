package tv.codely.java_bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CounterShould {

	@Test
	void count_the_word_in_the_phrase_giving_by_the_user() {

		CounterUseCase counter = new CounterUseCase();
		Phrase phrase = new Phrase("Hello Word");
		assertEquals(2, counter.invoke(phrase));
	}

	@Test
	void Only_count_the_words_with_more_than_3_characters(){
		CounterUseCase counter2 = new CounterUseCase();
		Phrase phrase = new Phrase("Hello worlds how are you guys");
		assertEquals(3,counter2.invokeWordsMoreThan3Char(phrase));

	}

    @Test
    void Only_count_the_words_starts_with_a_vowel(){
        CounterUseCase counter3 = new CounterUseCase();
        Phrase phrase = new Phrase("Hello worlds how are you guys");
        assertEquals(2,counter3.invokeWordsStartWithVowel(phrase));

    }

}
