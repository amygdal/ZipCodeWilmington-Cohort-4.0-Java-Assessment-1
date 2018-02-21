package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int numOfOccurrences = 0;

        for (Object element: objectArray) {
            if (element.equals(objectToCount)){
                numOfOccurrences++;
            }
        }

        return numOfOccurrences;


        /* how we did this in the remedial lessons:
        Integer counter = 0;
        for(Integer i = 0; i < objectArray.length; i++){
            if (objectArray[i].equals(objectToCount)){
                counter++;
            }
        }

        return counter;

        */


    }

    /**
     * @param intArray    an array of any type of Object
     * @param  intToRemove value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] intArray, Integer intToRemove) {

        List<Integer> amysList = new ArrayList<Integer>();

        for (Integer element: intArray){
            if (!element.equals(intToRemove)){
                amysList.add(element);
            }
        }

        Integer[] arrayWithValueRemoved = new Integer[amysList.size()];
        for (int i = 0; i < arrayWithValueRemoved.length; i++){
            arrayWithValueRemoved[i] = amysList.get(i);
        }
        return arrayWithValueRemoved;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Integer count = 0;
        Object obj = null;
        for (int i=0; i < objectArray.length; i++) {
            Integer n = getNumberOfOccurrences(objectArray, objectArray[i]);
            if (n > count) {
                count = n;
                obj = objectArray[i];
            }
        }
        return obj;

//        Integer mostCommon = null;
//        Integer numOfTimesWeveSeenTheMostCommon = 0;
//
//        for (Integer element: objectArray){
//            int numOfOccurrencesOfElement = getNumberOfOccurrences(objectArray, element);
//            if (numOfOccurrencesOfElement > numOfTimesWeveSeenTheMostCommon) {
//                mostCommon = element;
//                numOfTimesWeveSeenTheMostCommon = numOfOccurrencesOfElement;
//
//            }
//        }
//
//
//        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {

        Integer leastCommon = null;
        Integer numOfTimesWeveSeenTheLeastCommon = Integer.MAX_VALUE;

        for (Integer element: objectArray){
            int numOfOccurrencesOfElement = getNumberOfOccurrences(objectArray, element);
            if (numOfOccurrencesOfElement < numOfTimesWeveSeenTheLeastCommon) {
                 leastCommon= element;
                numOfTimesWeveSeenTheLeastCommon = numOfOccurrencesOfElement;

            }
        }


        return leastCommon;
    }

    /**
     * @param intArray      an array of any type of Object
     * @param intArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] intArray, Integer[] intArrayToAdd) {

        List<Integer> amysList = new ArrayList<Integer>();

        for (Integer element: intArray){
            amysList.add(element);
            }
        for (Integer element: intArrayToAdd){
            amysList.add(element);
        }

        Integer[] answerArray = new Integer[amysList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = amysList.get(i);
        }
        return answerArray;

    }
}
