package racinggame.generator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racinggame.constant.RacingCarConstant;

class RacingCarRandomGeneratorTest {

	@DisplayName("랜덤하게 생성된 숫자는 0 ~ 9 값을 갖는다")
	@Test
	void validateRandomNumberRange() {
		// given
		NumberGenerator numberGenerator = new RacingCarRandomGenerator();
		// when
		Integer randomNumber = numberGenerator.generate();
		// then
		assertTrue(RacingCarConstant.MOVING_MIN <= randomNumber && randomNumber <= RacingCarConstant.MOVING_MAX);
	}
}