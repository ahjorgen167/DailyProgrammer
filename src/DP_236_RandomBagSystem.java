import java.util.*;


public class DP_236_RandomBagSystem {

	public static void main(String[] args){
		System.out.println(fiftyTetrisPieces());
		System.out.println(fiftyTetrisPieces());
		System.out.println(fiftyTetrisPieces().length());
	}
	
	public static String fiftyTetrisPieces(){
		StringBuilder output = new StringBuilder();
		ArrayList<Character> bag = newPieces();
		Random rand = new Random();
		
		for(int i = 0; i < 50; i++){
			output.append(bag.remove(rand.nextInt(bag.size())));
			if(!bag.isEmpty()){
				bag = newPieces();
				rand = new Random();
			}
		}
		
		return output.toString();
	}
	
	public static ArrayList<Character> newPieces(){
		ArrayList<Character> bag = new ArrayList<Character>();
		bag.add('O');
		bag.add('I');
		bag.add('S');
		bag.add('Z');
		bag.add('L');
		bag.add('J');
		bag.add('T');
		return bag;
	}
	
}
