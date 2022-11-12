package it.develhope.javadoc;

/**
 * This is the class where you put your methods and stuff
 */
public class WordGames {
    /**
     *
     * @param word input for your string
     */
    public void addHelloWord(String word){
       System.out.printf("Hello %s %n", word);
    }

    /**
     *
     * @param name input your desired name
     * @param surname input your desired surname
     */
    public void getFullName(String name, String surname){
        System.out.printf("%s %s %n", name, surname);
    }

}
