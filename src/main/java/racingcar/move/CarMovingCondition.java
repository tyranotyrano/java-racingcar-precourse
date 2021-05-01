package racingcar.move;

import utils.random.RandomNumberGenerator;

public class CarMovingCondition implements MovingCondition {
	public static final int MOVING_CRITERIA_CONDITION = 4;

	public MoveStatus decideMoveStatus() {
		if (RandomNumberGenerator.generateNumberFrom01to9() >= MOVING_CRITERIA_CONDITION) {
			return MoveStatus.MOVE;
		}

		return MoveStatus.STOP;
	}
}
