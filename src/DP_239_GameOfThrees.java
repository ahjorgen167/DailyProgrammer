import java.util.*;

public class DP_239_GameOfThrees {

	public static void main(String[] args) {

		gameOfThrees(100);
	}

	public static void gameOfThrees(int input) {
		while (input != 1) {
			if (input == 3)
				break;
			if (input % 3 == 0) {
				System.out.println(String.format("%d %d", input, 0));
				input /= 3;
			} else if (input % 3 == 2) {
				System.out.println(String.format("%d %d", input++, 1));
			} else {
				System.out.println(String.format("%d %d", input--, -1));

			}
		}
		System.out.println(1);

	}

}
