package racingcar;

import racingcar.move.MovingCondition;

public class Car {
	private final CarName carName;
	private final MovingDistance movingDistance;
	private final MovingCondition movingCondition;

	public Car(CarName carName, MovingCondition movingCondition) {
		this.carName = carName;
		this.movingDistance = new MovingDistance();
		this.movingCondition = movingCondition;
	}

	public void move() {
		if (movingCondition.decideMoveStatus().isMovable()) {
			movingDistance.increase();
		}
	}

	public int getMovingDistance() {
		return movingDistance.getDistance();
	}
}
