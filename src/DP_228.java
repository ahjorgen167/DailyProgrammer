import java.util.ArrayList;

public class DP_228 {

	public static void main(String[] args) {
		wordsInAlphaOrder("almost");
		wordsInAlphaOrder("cereal");
		wordsInAlphaOrder("billowy");
		wordsInAlphaOrder("biopsy");
		wordsInAlphaOrder("chinos");
		wordsInAlphaOrder("defaced");
		wordsInAlphaOrder("chintz");
		wordsInAlphaOrder("sponged");
		wordsInAlphaOrder("bijoux");
		wordsInAlphaOrder("abhors");
		wordsInAlphaOrder("fiddle");
		wordsInAlphaOrder("begins");
		wordsInAlphaOrder("chimps");
		wordsInAlphaOrder("wronged");

	}

	public static void wordsInAlphaOrder(String word) {

		if (word.length() == 0 || word == null) {
			System.out.println("Please enter a word");
			return;
		}

		if (word.length() == 1) {
			System.out.println("Only 1 letter input");
			return;
		}

		System.out.print(word.toLowerCase());
		if (inOrderCheck(word)) {
			System.out.println(" IN ORDER");
			return;
		}
		if (inOrderCheck(new StringBuilder(word.toLowerCase()).reverse().toString())) {
			System.out.println(" REVERSE ORDER");
			return;
		}
		System.out.println(" NOT IN ORDER");
	}

	private static boolean inOrderCheck(String word) {
		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) < word.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}
//
//	private static boolean inReverseOrderCheck(String word) {
//		for (int i = 0; i < word.length() - 1; i++) {
//			if (word.charAt(i) < word.charAt(i + 1)) {
//				return false;
//			}
//		}
//		return true;
//	}

}
