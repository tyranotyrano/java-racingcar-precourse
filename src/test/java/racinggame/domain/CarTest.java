package racinggame.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import racinggame.constant.ErrorMessage;
import racinggame.domain.movingcondition.CarMovingCondition;
import racinggame.generator.RacingCarRandomGenerator;
import racinggame.generator.TestNumberGenerator;

class CarTest {

	@DisplayName("자동차 이름을 할당하여 생성한다")
	@ParameterizedTest
	@CsvSource(value = {"a:0", "abc:3", "abc1:4", "abc12:9"}, delimiter = ':')
	void validateCarCreation(String name, int randomNumber) {
		// given
		// when
		Car car = Car.of(CarName.of(name), CarMovingCondition.createBy(new RacingCarRandomGenerator()));
		// then
		assertAll(
			() -> assertEquals(name, car.getName().getName()),
			() -> assertEquals(0, car.getDistance().getDistance())
		);
	}

	@DisplayName("자동차 이름을 할당하여 생성한다")
	@ParameterizedTest
	@CsvSource(value = {"'':0", "' ':3", "abc123:4", "abc1234:9"}, delimiter = ':')
	void throwExceptionWhenInvalidCarName(String name, int randomNumber) {
		// given
		// when
		// then
		assertThatIllegalArgumentException()
			.isThrownBy(() -> Car.of(CarName.of(name), CarMovingCondition.createBy(new TestNumberGenerator(randomNumber))))
			.withMessageContaining(ErrorMessage.INVALID_CAR_NAME_LENGTH);
	}

	@DisplayName("자동차는 랜덤값이 4 이상이면 이동한다")
	@ParameterizedTest
	@CsvSource(value = {"a:0:0", "abc:3:0", "abc1:4:1", "abc12:9:1"}, delimiter = ':')
	void moveWhenRandomNumberIsMoreThan4(String name, int randomNumber, int resultDistance) {
		// given
		Car car = Car.of(CarName.of(name), CarMovingCondition.createBy(new TestNumberGenerator(randomNumber)));
		// when
		car.move();
		// then
		assertEquals(resultDistance, car.getDistance().getDistance());
	}
}