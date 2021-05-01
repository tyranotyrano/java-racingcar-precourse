package utils.random;

import java.util.Random;

public class RandomNumberGenerator {
	private static final Random random = new Random();

	static int generateNumberFrom01to9() {
		return random.nextInt(10);
	}
}
