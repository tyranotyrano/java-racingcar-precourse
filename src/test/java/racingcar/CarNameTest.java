package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class CarNameTest {

	@DisplayName("자동차 이름이 null, 빈 문자열, 5자 초과이면 예외 발생한다.")
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {" ", "abcde6"})
	void validateIncorrectCarName(String name) {
		assertThatIllegalArgumentException().isThrownBy(() -> new CarName(name));
	}

	@DisplayName("자동차 이름은 1자 이상 5자 이하이다.")
	@ParameterizedTest
	@ValueSource(strings = {"a", "abcde", "abc12", "12345"})
	void validateCorrectCarName(String name) {
		assertThatNoException().isThrownBy(() -> new CarName(name));
	}
}
