package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.FixedMovingDistance;
import racingcar.car.MovingDistance;
import racingcar.move.FixedMovingCondition;

public class CarTest {

	@DisplayName("자동차는 0~9 랜덤값이 4이상이면 전진한다.")
	@ParameterizedTest
	@CsvSource(value = {"0:0", "3:0", "4:1", "9:1"}, delimiter = ':')
	void moveWhenRandomValueIsMoreThan4(int condition, int movingDistance) {
		Car car = new Car(new CarName("붕붕이"), new FixedMovingCondition(condition));
		car.move();

		assertThat(car.getMovingDistance().getDistance()).isEqualTo(movingDistance);
	}

	@DisplayName("가장 많이 움직인 거리를 추출한다.")
	@ParameterizedTest
	@CsvSource(value = {"0:0:0", "0:1:1", "4:0:1", "4:1:1"}, delimiter = ':')
	void getMaxMovingDistance(int condition, int maxDistance, int finalMaxDistance) {
		FixedMovingDistance maxMovingDistance = new FixedMovingDistance(maxDistance);

		Car car = new Car(new CarName("붕붕이"), new FixedMovingCondition(condition));
		car.move();

		MovingDistance finalMovingDistance = car.getBiggerMovingDistanceThan(maxMovingDistance);

		assertThat(finalMovingDistance.getDistance()).isEqualTo(finalMaxDistance);
	}
}
