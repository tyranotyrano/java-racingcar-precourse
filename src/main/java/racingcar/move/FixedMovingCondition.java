package racingcar.move;

public class FixedMovingCondition implements MovingCondition {
	private final int fixedCondition;

	public FixedMovingCondition(int fixedCondition) {
		this.fixedCondition = fixedCondition;
	}

	@Override
	public MoveStatus decideMoveStatus() {
		if (fixedCondition >= CarMovingCondition.MOVING_CRITERIA_CONDITION) {
			return MoveStatus.MOVE;
		}

		return MoveStatus.STOP;
	}
}
