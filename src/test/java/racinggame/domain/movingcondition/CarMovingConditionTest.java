package racinggame.domain.movingcondition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.generator.TestNumberGenerator;

class CarMovingConditionTest {

	@DisplayName("생성된 랜덤값이 4 이상이면 전진한다")
	@ParameterizedTest
	@ValueSource(ints = {4, 5, 6, 7, 8, 9})
	void moveWhenRandomNumberIsMoreThan4(int number) {
		// given
		CarMovingCondition carMovingCondition = CarMovingCondition.createBy(new TestNumberGenerator(number));
		// when
		MoveStatus moveStatus = carMovingCondition.decideMoveStatus();
		// then
		assertTrue(moveStatus.isMove());
	}

	@DisplayName("생성된 랜덤값이 3 이하이면 멈춘다")
	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	void moveWhenRandomNumberIsLessThan3(int number) {
		// given
		CarMovingCondition carMovingCondition = CarMovingCondition.createBy(new TestNumberGenerator(number));
		// when
		MoveStatus moveStatus = carMovingCondition.decideMoveStatus();
		// then
		assertTrue(moveStatus.isStop());
	}
}