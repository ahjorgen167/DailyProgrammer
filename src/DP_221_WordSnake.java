import java.util.ArrayList;
import java.util.Arrays;


public class DP_221_WordSnake {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("SHENANIGANS");
		words.add("SALTY");
		words.add("YOUNGSTER");
		words.add("ROUND");
		words.add("DOUBLET");
		words.add("TERABYTE");
		words.add("ESSENCE");
		wordSnake(words);
	}

	public static void wordSnake(ArrayList<String> inputWords){
		ArrayList<char[]> words = new ArrayList<char[]>();
		for(String word : inputWords)
			words.add(word.toCharArray());
		
		char[][] board = createBoard(words);
		
		int x = 0, y = 0;
		direction curDirection = direction.RIGHT;
		
		for(char ltr : words.get(0))
			board[y][x++] = ltr;
		
		for (char[] row : board){
			for(char letter : row){
			System.out.print(letter);
			}
			System.out.print("\n");
		}
		
		y++;
		
		
		
	}
	
	private static char[][] createBoard(ArrayList<char[]> words){
		int width = 1, height = 1, index = 0;
		while(index < words.size()){
			width += (words.get(index++).length - 1);
			if (index == words.size())
				break;
			height += (words.get(index++).length - 1);
		}
		char[][] board = new char[width][height];
		for(int i = 0; i < board.length; i++){
			Arrays.fill(board[i], ' ');
		}
		return board;
	}
	
	public enum direction{
		UP, DOWN, LEFT, RIGHT
	}
}
