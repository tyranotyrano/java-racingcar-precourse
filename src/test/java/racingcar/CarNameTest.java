package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import racingcar.car.CarName;
import racingcar.car.Cars;

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

	@DisplayName("입력받은 자동차 이름을 콤마(,)를 기준으로 분리한다.")
	@ParameterizedTest
	@CsvSource(value = {",:0", ",,:0", "a ,b , c:3", "a,b,c,:3"}, delimiter = ':')
	void splitCarNameByComma(String input, int count) {
		List<String> inputNames = Arrays.asList(input.split(","));
		List<CarName> carNames = new ArrayList<>();
		for (String carName : inputNames) {
			carNames.add(new CarName(carName));
		}

		Cars cars = new Cars(carNames);

		assertThat(cars.size()).isEqualTo(count);
	}
}
