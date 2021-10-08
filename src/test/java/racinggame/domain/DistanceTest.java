package racinggame.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DistanceTest {

	@DisplayName("자동차 이동거리는 최초에 0 이다")
	@Test
	void validateInitDistance() {
		// given
		// when
		Distance distance = Distance.create();
		// then
		assertEquals(0, distance.getDistance());
	}

	@DisplayName("자동차 이동거리는 1회 이동 시, 1만큼 증가한다")
	@ParameterizedTest
	@ValueSource(ints = {0, 1, 5, 9, 10})
	void validateDistance(int moveCount) {
		// given
		Distance distance = Distance.create();
		// when
		for (int i = 0; i < moveCount; i++) {
			distance.increase();
		}
		// then
		assertEquals(moveCount, distance.getDistance());
	}
}