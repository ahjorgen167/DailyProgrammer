import java.util.*;

public class DP_238_FalloutHackingGame {

	static String alpha = "QWERTYUIOPASDFGHJKLZXCVBNM";

	public static void main(String[] args) {
		HackingGame();
	}

	public static void HackingGame() {
		Scanner in = new Scanner(System.in);
		System.out.println("Difficult level? (1 - 5)");
		ArrayList<String> words;
		Random rand = new Random();
		int answerIndex;
		int remainingGuesses = 4;
		
		while (true) {
			if (in.hasNextLine()) {
				String temp = in.nextLine();
				if (temp.length() == 1 && temp.charAt(0) >= '1'
						&& temp.charAt(0) <= '5') {
					words = generateWords(temp.charAt(0) - '0');
					break;
				} else {
					System.out.println("Please print number between 1 and 5.");
				}
			}
		}
		
		answerIndex = rand.nextInt(words.size());
		
		for(String s : words){
			System.out.println(s);
		}
		
		while(remainingGuesses > 0){
			if (in.hasNextLine()) {
				String temp = in.nextLine();
				if(checkAnswer(temp.toUpperCase(), words.get(answerIndex))){
					System.out.println("You win!");
					return;
				} else {
					remainingGuesses--;
				}
			}
		}
		System.out.println("You lose :(");
	}
	
	private static boolean checkAnswer(String input, String answer){
		int similiarChars = 0;
		for(int i = 0; i < input.length() && i < answer.length(); i++){
			if(input.charAt(i) == answer.charAt(i)){
				similiarChars++;
			}
		}
		System.out.format("%d/%d\n", similiarChars, answer.length());
		return(similiarChars == answer.length());
	}

	private static ArrayList<String> generateWords(int difficulty) {
		ArrayList<String> words = new ArrayList<String>();
		int length = 4 + (difficulty - 1) * 2;
		int wordCount = 5 + (difficulty - 1) * 2;
		for (int i = 0; i < wordCount; i++) {
			words.add(randomWord(length));
		}

		return words;
	}

	private static String randomWord(int length) {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(alpha.charAt(rand.nextInt(alpha.length())));
		}

		return sb.toString();
	}
}
