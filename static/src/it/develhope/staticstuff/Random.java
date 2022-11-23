package it.develhope.staticstuff;

import java.security.SecureRandom;

public class Random {

    public static final String NUMBERS = "0123456789";
    public static final String LOWERCASE = "abcdefghijklmnopqrstuwxyz";
    public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVZXYW";
    public static final String FULLCHARACTER = LOWERCASE + UPPERCASE;
    public static final String CHARACTER_AND_NUMBERS = FULLCHARACTER + NUMBERS;

    private static SecureRandom random = new SecureRandom();

    public static String generateString(int size, String charset) {
        if (size < 1) {
            return "";
        }
        StringBuilder builder = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int randomPosition = random.nextInt(charset.length());
            char randomCharacter = charset.charAt(randomPosition);
            builder.append(randomCharacter);
        }
        return builder.toString();
    }

}
