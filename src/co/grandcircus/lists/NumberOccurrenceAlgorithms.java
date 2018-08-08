package co.grandcircus.lists;

import java.util.Arrays;
import java.util.HashMap;

public class NumberOccurrenceAlgorithms {

	public static void main(String[] args) {
		int[] sample = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10};
		
		arraySolution(sample);
		
		mapSolution(sample);
		
		
	}
	
	public static void arraySolution(int[] sample) {
		int[] occurrenceCounter = new int[11];
		// Estimate: (O)n
		
		// Fill the Array
		Arrays.fill(occurrenceCounter, 0);
	
		for (int i : sample) {
			occurrenceCounter[i] += 1;
		}
		
		for (int i = 0; i < occurrenceCounter.length; i++) {
			System.out.println("[" + i + "]: " + occurrenceCounter[i]);	
		}
		
	}
	
	public static void mapSolution(int[] sample) {
		// Estimate: (O)n
		
		HashMap<Integer, Integer> occurrenceCounter = new HashMap<Integer, Integer>();
		
		// Fill the HashMap
		for (int i = 0; i < 11; i++) {
			occurrenceCounter.put(i, 0);
		}
		
		for (Integer i : sample) {
			occurrenceCounter.put(i, occurrenceCounter.get(i) + 1);
		}
		
		System.out.println(occurrenceCounter);
	
	}
	

}
