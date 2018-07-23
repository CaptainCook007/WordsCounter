package tv.codely.java_bootstrap;

public class Word {

    final private String word;

    Word(String word){
        this.word = word;
    }

/*
    public String getWordsMoreThan3Char() {
        if (wordsMoreThan3Char.length() > 3){
            return wordsMoreThan3Char;
        }
        return null;
    }*/

    public Boolean hasMoreThan3Characters() {
        return word.length() > 3;
    }

    public Boolean StartWithaVowel(){
        return word.startsWith("a") || word.startsWith("e") || word.startsWith("i")
         || word.startsWith("u") || word.startsWith("o") || word.startsWith("y");
    }
}
