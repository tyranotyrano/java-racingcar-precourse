package racinggame.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.constant.ErrorMessage;

class TryCountTest {

	@DisplayName("이동횟수는 0 이상의 값을 가진다")
	@ParameterizedTest
	@ValueSource(ints = {0, 1, 5, 9, 10, 100, 100000})
	void createTryCount(int count) {
		// given
		// when
		TryCount tryCount = TryCount.of(count);
		// then
		assertEquals(count, tryCount.getCount());
	}

	@DisplayName("이동횟수는 0 미만의 값을 가질 수 없다")
	@ParameterizedTest
	@ValueSource(ints = {-1, -100, -1000})
	void throwExceptionWhenTryCountIsNegative(int count) {
		// given
		// when
		// then
		assertThatIllegalArgumentException()
			.isThrownBy(() -> TryCount.of(count))
			.withMessageContaining(ErrorMessage.INVALID_INPUT_TRY_COUNT);
	}
}