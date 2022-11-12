package it.develhope.javadoc;

/**
 * This is the class where you run your code
 */
public class Tester {

    public static void main(String[] args) {
        WordGames word = new WordGames();
        /**
         * this prints hello + your name
         */
        word.addHelloWord("Paolo");
        /**
         * this method prints your fullname
         */
        word.getFullName("Paolone","Teresssa");
    }
    
}
