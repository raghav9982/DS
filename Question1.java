package RetailMeNot;

public class Question1 {
/*
 minumm changes need to make both string anagram
 
 */
	public static void main(String[] args) {

		System.out.println(solution("rather", "harder"));

	}

	public static int solution(String A, String B) {

		int charCountOfA[] = new int[26];

		int charCountOfB[] = new int[26];

		for (int i = 0; i < A.length(); i++)
			charCountOfA[A.charAt(i) - 'a']++;

		for (int i = 0; i < B.length(); i++)
			charCountOfB[B.charAt(i) - 'a']++;

		int result = 0;

		for (int i = 0; i < 26; i++)
			result += Math.abs(charCountOfA[i] - charCountOfB[i]);

		return result;

	}

}
