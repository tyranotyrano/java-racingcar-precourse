package racinggame.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static racinggame.constant.RacingCarConstant.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.constant.ErrorMessage;

class CarNameTest {

	@DisplayName("자동차 이름은 1~5자로 구성된다")
	@ParameterizedTest
	@ValueSource(strings = {"a", "ab", "abc", "abc1", "abc12"})
	void validateCarNameLength(String name) {
		// given
		// when
		CarName carName = CarName.of(name);
		// then
		assertTrue(() -> carName.getName().length() <= CAR_NAME_LENGTH_MAX);
	}

	@DisplayName("자동차 이름이 1~5자가 아니면 에러가 발생한다")
	@ParameterizedTest
	@ValueSource(strings = {"", " ", "abc123", "abc1234"})
	void throwExceptionWhenInvalidCarName(String name) {
		// given
		// when
		// then
		assertThatIllegalArgumentException()
			.isThrownBy(() -> CarName.of(name))
			.withMessageContaining(ErrorMessage.INVALID_CAR_NAME_LENGTH);

	}
}