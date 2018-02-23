package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        Integer numOfPalindromes = 0;

        for (int i = 0; i <= input.length(); i++){
            for (int j = i+1; j <= input.length(); j++){
                StringBuilder reverseMyInput = new StringBuilder(input.substring(i,j));
                reverseMyInput.reverse();
                if (input.substring(i,j).equals(reverseMyInput.toString())){
                    numOfPalindromes++;
                }
            }
        }


        return numOfPalindromes;
    }
}
