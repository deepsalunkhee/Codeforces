import java.util.*;
import java.io.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    private static void printInt(int a){
		System.out.print(a);
	}
	
	private static void printChar(char a){
		System.out.print(a);
	}
	
	private static void printString(String a){
		System.out.print(a);
	}
	
	private static void ln(){
		System.out.println();
	}
	
	private static void print2dArr(int[][]arr,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			ln();
		}
	}
	private static void print1dArr(long[]arr,long r){
		for(int i=0;i<r;i++){
		
				System.out.print(arr[i]+" ");
			
		}
		ln();
	}
    
    private static void printScore(int result) {
        System.out.println(result);
    }
    
    private static Map<Integer, Integer> buildFrequencyMap(int[] arr, int length) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < length; i++) {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
        }
        return frequency;
    }
    
    public static void solveProblem() {
        int arraySize = sc.nextInt();
        int targetSum = sc.nextInt();
        int[] elements = new int[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            elements[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> freqMap;
        freqMap= buildFrequencyMap(elements, arraySize);
        int totalPairs = 0;
        
        for (int key : freqMap.keySet()) {
            int required = targetSum - key;
            if (freqMap.containsKey(required)) {
                int possiblePairs = Math.min(freqMap.get(key), freqMap.get(required));
                if (key == required) {
                    possiblePairs /= 2; // Self-pair adjustment
                }
                totalPairs += possiblePairs;
                freqMap.put(key, freqMap.get(key) - possiblePairs);
                freqMap.put(required, freqMap.get(required) - possiblePairs);
            }
        }
        
        printScore(totalPairs);
    }
    
    public static void main(String[] args) {
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            solveProblem();
        }
    }
}
