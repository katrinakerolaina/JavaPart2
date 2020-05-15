package jtm.activity03;

import java.util.Arrays;

public class Array {
	static int[] array;

	public static void main(String[] args) {
		// TODO Use passed parameters for main method to INITILIZE array	
		// Hint: use Run� Run configurations... Arguments to pass parameters to
		// main method when calling from Eclipse
		// SORT elements in this array in ascending order
		// Hint: use Integer.parseInt(args[n]) to convert passed
		// parameters from String to int
		// Hint: use Arrays.sort(...) from
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		
		array = new int[args.length];//Initilize array
		
		
		for(int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);//Convert from String to int
		
		}
		
		Arrays.sort(array);//Sort
		printSortedArray();
		
	}
		
	public static void printSortedArray() {
		
		// TODO print content of array on standard output
		// Hint: use Arrays.toString(array) method for this
		System.out.println(Arrays.toString(array));
	}

	public static int[] returnSortedArray() {
		
		// TODO return reference to this array
		Arrays.sort(array);
		return array;
	}

}
