package string_processing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Hangman {

	public static void main(String[] args) {

		// Enter Secret Word
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Secret Word: ");
		String secretWord = scanner.next().toLowerCase();
		char[] secretAnswer = new char[secretWord.length()];
		for (int i = 0; i < secretAnswer.length; i++) {
			secretAnswer[i] = '*';
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("_______________HangMan_________________");
			System.out.println();

		}

		System.out.println("Secret Word: " + Arrays.toString(secretAnswer));

		TreeMap<Character, Character> secretWordMap = new TreeMap<>();
		for (int i = 0; i < secretWord.length(); i++) {
			secretWordMap.put(secretWord.charAt(i), secretWord.charAt(i));
		}
		String sq = new String();
		
		while (!sq.equalsIgnoreCase(secretWord)) {
			System.out.println();

			System.out.print("Guess a Letter: ");
			char guess = scanner.next().charAt(0);

			if (secretWordMap.containsKey(guess)) {
				for (int i = 0; i < secretWord.length(); i++) {
					if (secretWord.charAt(i) == guess) {
						secretAnswer[i] = guess;
						sq = new String(secretAnswer);

					}

				}
				System.out.println(secretAnswer);

			}
		}
		System.out.println();
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

		System.out.println("       WINNER!🥳     ");
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

		return;

	}
}
