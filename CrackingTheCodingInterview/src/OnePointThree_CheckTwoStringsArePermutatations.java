import java.util.ArrayList;
import java.util.Collections;


// 1.3 Given two strings, writer a method to decide if one is a permutation of
// another.

public class OnePointThree_CheckTwoStringsArePermutatations {

	public static void main(String[] args){
		checkIfTwoStringsArePermutations("bell", "bell");
		checkIfTwoStringsArePermutations("bell", "blel");
		checkIfTwoStringsArePermutations("ball", "bell");
		checkIfTwoStringsArePermutations("bye", "bell");
		
	}
	
	public static void checkIfTwoStringsArePermutations(String stringA, String stringB){
		if(stringA.length() != stringB.length()){
			String output = String.format("%s %s - NOT PERMUTATIONS", stringA, stringB);
			System.out.println(output);
			return;
		}
		
		ArrayList<Character> firstString = new ArrayList<Character>();
		ArrayList<Character> secondString = new ArrayList<Character>();
		
		for(int i = 0; i < stringA.length(); i++){
			firstString.add(stringA.charAt(i));
			secondString.add(stringB.charAt(i));
		}
		
		Collections.sort(firstString);
		Collections.sort(secondString);
		if(firstString.equals(secondString)){
			String output = String.format("%s %s - ARE PERMUTATIONS", stringA, stringB);
			System.out.println(output);
			return;
		}
		else{
			String output = String.format("%s %s - NOT PERMUTATIONS", stringA, stringB);
			System.out.println(output);
			return;
		}
	}
	
}
