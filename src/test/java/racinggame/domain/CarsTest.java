package racinggame.domain;

import static org.junit.jupiter.api.Assertions.*;
import static racinggame.constant.RacingCarConstant.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarsTest {

	@DisplayName("콤마(,)로 구분되는 자동차이름을 입력하여 여러대의 자동차를 생성한다")
	@ParameterizedTest
	@CsvSource(value = {"a:1", "a,ab:2", "a,ab,abc:3", "a,ab,abc,abc1:4", "a,ab,abc,abc1,abc12:5"}, delimiter = ':')
	void createCarsByCarName(String carNameBundle, int carCount) {
		// given
		List<CarName> carNames = new ArrayList<>();
		String[] splitCarNames = carNameBundle.split(CAR_NAME_SEPARATOR);
		for (String carName : splitCarNames) {
			carNames.add(CarName.of(carName));
		}
		// when
		Cars cars = Cars.of(carNames);
		// then
		assertEquals(carCount, cars.getSize());
	}
}