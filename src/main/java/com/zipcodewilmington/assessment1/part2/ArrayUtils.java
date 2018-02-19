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

        System.out.println(amysList);

        Integer[] answerArray = new Integer[amysList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = amysList.get(i);
        }
        return answerArray;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param intArray      an array of any type of Object
     * @param intArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] intArray, Integer[] intArrayToAdd) {
        Integer[] mergedArray = {};

        Arrays.toString(intArray);
        Arrays.toString(intArrayToAdd);



        return mergedArray;
    }
}
