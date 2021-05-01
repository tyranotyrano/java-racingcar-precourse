package racingcar.move;

public enum MoveStatus {
	MOVE,
	STOP;

	public boolean isMovable() {
		return this.equals(MOVE);
	}
}
