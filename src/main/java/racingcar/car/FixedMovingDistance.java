package racingcar.car;

public class FixedMovingDistance implements MovingDistance {
	private final int movingDistance;

	public FixedMovingDistance(int movingDistance) {
		this.movingDistance = movingDistance;
	}

	@Override
	public int getDistance() {
		return movingDistance;
	}

	@Override
	public void increase() {

	}
}
