package utils.random;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {

	@DisplayName("0~9 중 랜덤으로 숫자를 추출")
	@Test
	void drawRandomNumberFrom1to9() {
		Set<Integer> numberSet = new HashSet<>();

		while (numberSet.size() < 10) {
			numberSet.add(RandomNumberGenerator.generateNumberFrom01to9());
		}

		assertThat(numberSet).contains(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
							 .size()
							 .isEqualTo(10);
	}
}