package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String a : array){
            if(a.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] rev = new String[array.length];
        for(int i = 0; i<array.length; i++){
            rev[i] = array[array.length - i - 1];
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i<array.length; i++){
            if(!array[i].equals(array[array.length - i - 1]))
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean status = true;
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String [] chara = alph.split("");

        String input = String.join(" ",array);
        input = input.toLowerCase();
        String [] lettrs = input.split("");


        for(int i = 0; i<chara.length; i++){
            boolean found = false;

            for(int j = 0; j<lettrs.length; j++){
                if(chara[i].equals(lettrs[j]))
                    found = true;
            }

            if (!found) {
                status = false;
                break;
            }

        }

        return status;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String arr : array){
            if(arr.equals(value))
                counter++;
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> workingCopy = new ArrayList<>();

        for(int i = 0; i<array.length; i++){
            if(!array[i].equals(valueToRemove)){
                workingCopy.add(array[i]);
            }
        }
        String [] last = new String[workingCopy.size()];
        workingCopy.toArray(last);
        return last;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> workingCopy = new ArrayList<>();
        workingCopy.add(array[0]);
        for(int i = 0; i<array.length-1; i++){
            if(!array[i].equals(array[i+1])){
                workingCopy.add(array[i+1]);
            }
        }
        String [] last = new String[workingCopy.size()];
        workingCopy.toArray(last);
        return last;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> workingCopy = new ArrayList<>();
        String builder = "";
        int temp = 0;

        for(int i = 0; i<array.length - 1; i++){
            if (array[i].equals(array[i+1])){
                temp = i;
                while(temp + 1 < array.length && array[temp].equals(array[temp+1])){
                    builder += array[temp];
                    temp++;
                }
                i = temp;
                builder+=array[temp];
                workingCopy.add(builder);
            }
            else {
                workingCopy.add(array[i]);

            }
            if(i == array.length - 2)
                workingCopy.add(array[i+1]);

            builder = "";
        }
        String [] last = new String[workingCopy.size()];
        workingCopy.toArray(last);
        return last;
    }


}
