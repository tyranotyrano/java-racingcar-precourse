package racinggame.domain;

import racinggame.domain.movingcondition.MovingCondition;

public class Car {
	private final CarName name;
	private final Distance distance;
	private final MovingCondition movingCondition;

	private Car(CarName name, MovingCondition movingCondition) {
		this.name = name;
		this.movingCondition = movingCondition;
		this.distance = Distance.create();
	}

	public static Car of(CarName carName, MovingCondition movingCondition) {
		return new Car(carName, movingCondition);
	}

	public void move() {
		if (movingCondition.decideMoveStatus().isMove()) {
			this.distance.increase();
		}
	}

	public CarName getName() {
		return name;
	}

	public Distance getDistance() {
		return distance;
	}
}
