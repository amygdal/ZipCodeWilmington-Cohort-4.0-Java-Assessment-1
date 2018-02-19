package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String letterToCap = str.substring(0,1).toUpperCase();
        String restOfWord = str.substring(1);
        String finalWordReadyToReturn = letterToCap + restOfWord;

        return finalWordReadyToReturn;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reversedString = builder.reverse().toString();

        return reversedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       String reversedString = reverse(str);
        return camelCase(reversedString);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder builder = new StringBuilder(str);
        String firstLetterRemoved = builder.substring(1);
        String lastLetterRemoved = firstLetterRemoved.substring(0,firstLetterRemoved.length()-1);

        return lastLetterRemoved;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] strToCharArray = str.toCharArray();

        for (int i = 0; i < strToCharArray.length; i++){
            char charToCheck = strToCharArray[i];
            if (Character.isUpperCase(charToCheck)){
                strToCharArray[i] = Character.toLowerCase(charToCheck);
            } else if (Character.isLowerCase(charToCheck)){
                strToCharArray[i]=Character.toUpperCase(charToCheck);
            }
        }

        return new String(strToCharArray);
    }
}
