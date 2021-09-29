package template_I;

public class GuessNumberHigherOrLower {
	public static void main(String[] args) {
		GuessSolution s = new GuessSolution();
		System.out.println(s.guessNumber(10));
	}
}

class GuessGame {

	public int guess(int num) {
		int guessThis = (int) (Math.random() * 10);
		return guessThis;
	}

}

/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the
 *         guess number otherwise return 0 int guess(int num);
 */

class GuessSolution extends GuessGame {
	public int guessNumber(int n) {
		int start = 1;
		int end = n;
		while (start <= end) {

			int pick = start + (end - start) / 2;

			if (guess(pick) == 0) {
//				System.out.println(pick + ", 0");
				return pick;
			} else if (guess(pick) == 1) {
//				System.out.println(pick + ", -1");
				start = pick + 1;
			} else if (guess(pick) == -1) {
//				System.out.println(pick + ", 1");
				end = pick - 1;
			}

		}

		return end;
	}
}