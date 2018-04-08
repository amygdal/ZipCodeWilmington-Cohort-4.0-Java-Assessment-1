package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param input an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] input) {

        return input[0];
    }

    /**
     * @param input an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] input) {

        return input[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {

        return stringArray[stringArray.length-1];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        return stringArray[stringArray.length-2];
    }
}
