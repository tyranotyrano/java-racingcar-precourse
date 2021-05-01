package racingcar.car;

import java.util.Objects;

public class CarMovingDistance implements MovingDistance {
	private int distance = 0;

	public int getDistance() {
		return distance;
	}

	public void increase() {
		distance++;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CarMovingDistance that = (CarMovingDistance)o;
		return distance == that.distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distance);
	}
}
