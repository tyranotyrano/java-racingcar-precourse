package racingcar.car;

public class FixedMovingDistance extends MovingDistance {
	private final int movingDistance;

	public FixedMovingDistance(int movingDistance) {
		this.movingDistance = movingDistance;
	}

	public int getDistance() {
		return movingDistance;
	}
}
