package com.upskill.assignment_4;

import java.util.*;
public class Ex_4_3 {


public static void main(String[] args) {
        int[] values = {0,1,2,3,4,4};
        duplicate(values);
        
    }

    public static void duplicate(int numbers[]) {
        Arrays.sort(numbers);
        int previous = numbers[0] - 1;
        
        int dupCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == previous) {
                dupCount++;
            } else {
                previous = numbers[i];
            }

        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
    }
	
}