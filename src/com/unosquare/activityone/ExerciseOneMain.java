package com.unosquare.activityone;
import java.util.ArrayList;

public class ExerciseOneMain {
	
	/**
	 * Method to calculate % of 3. 
	 * @param value
	 * @return true if %3 == 0.
	 */
    public static Boolean canBeDividedBy3(Integer value) {
    	
        if (value % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Generate 'value' amount of numbers as an arrayList.
     * @param value
     * @return list of numbers.
     */
    public static ArrayList<Integer> generatedNumbers(Integer value){
    	
        ArrayList<Integer> list = new ArrayList<>();
        Integer i=1;

        while(value>=i){
            list.add(i);
            i++;
        }
        return list;
    }
    
	@SuppressWarnings("static-access")
	public static void main(String args[]){
	/*
	ExerciseOneMethods methods = new ExerciseOneMethods();
	int amountOfNumbers = 50;
	
    for (Integer i : methods.generatedNumbers(amountOfNumbers)) {
        System.out.print(i);
       if(methods.canBeDividedBy3(i)) {
          System.out.print("-> Can be divided by 3.");
      }
      System.out.println();
  }
    */
		System.out.println("Exercise 1.- Java conventions Practice");
		System.out.println("Instructions: ");
		System.out.println("1. Inside the main class, create a program that contains:");
		System.out.println("a) A boolean method called canBeDividedBy3() that will receive an Integer value and will return true or false according to whether the number is divisible by 3 or not.");
		System.out.println("b) An ArrayList method called generateNumbers() that will receive an Integer value and will create an ArrayList filled with all the numbers less than the value introduced as a parameter.");
		System.out.println("c) The main method must run and print the numbers from 1 to 30 in ascendent order and must also print your name every time the number can be divided by 3.");
		
		System.out.println("Activity: ");
		
		int amountOfNumbers = 30;
		
	    for (Integer i : generatedNumbers(amountOfNumbers)) {
	        System.out.print(i);
	       if(canBeDividedBy3(i)) {
	          System.out.print("-> Can be divided by 3.");
	      }
	      System.out.println();
	  }
    
}
}