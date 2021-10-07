package racinggame.domain.movingcondition;

public enum MoveStatus {
	MOVE,
	STOP;

	public boolean isMove() {
		return this.equals(MOVE);
	}

	public boolean isStop() {
		return this.equals(STOP);
	}
}
