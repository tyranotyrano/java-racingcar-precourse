package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import racingcar.move.FixedMovingCondition;

public class CarTest {

	@DisplayName("자동차는 0~9 랜덤값이 4이상이면 전진한다.")
	@ParameterizedTest
	@CsvSource(value = {"0:0", "3:0", "4:1", "9:1"}, delimiter = ':')
	void moveWhenRandomValueIsMoreThan4(int condition, int movingDistance) {
		Car car = new Car(new CarName("붕붕이"), new FixedMovingCondition(condition));
		car.move();

		assertThat(car.getMovingDistance()).isEqualTo(movingDistance);
	}
}
