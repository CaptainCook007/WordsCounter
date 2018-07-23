package tv.codely.java_bootstrap;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");

        Phrase inputPhrase = new Phrase(input.nextLine());
        System.out.println("Input phrase = " + inputPhrase);


        CounterUseCase counter = new CounterUseCase();

        int itemCount = counter.invoke(inputPhrase);
        System.out.println("The number of items is: " + itemCount);

        int charCount = counter.invokeWordsMoreThan3Char(inputPhrase);
        System.out.println("The number of items more than 3 char is: " + charCount);

        int VowelCount = counter.invokeWordsStartWithVowel(inputPhrase);
        System.out.println("The number of items start with a vowel: " + VowelCount);



    }
}


