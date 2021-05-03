package utils.random;

import java.util.Random;

public class RandomNumberGenerator {
	private static final int MAX_RANDOM_VALUE = 10;
	private static final Random random = new Random();

	public static int generateNumberFrom01to9() {
		return random.nextInt(MAX_RANDOM_VALUE);
	}
}
