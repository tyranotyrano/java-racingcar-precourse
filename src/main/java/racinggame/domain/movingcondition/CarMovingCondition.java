package racinggame.domain.movingcondition;

import racinggame.constant.RacingCarConstant;
import racinggame.generator.NumberGenerator;

public class CarMovingCondition implements MovingCondition {

	private final NumberGenerator numberGenerator;

	private CarMovingCondition(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}

	public static CarMovingCondition createBy(NumberGenerator numberGenerator) {
		return new CarMovingCondition(numberGenerator);
	}

	@Override
	public MoveStatus decideMoveStatus() {
		if (this.numberGenerator.generate() >= RacingCarConstant.MOVING_CRITERIA) {
			return MoveStatus.MOVE;
		}

		return MoveStatus.STOP;
	}
}
