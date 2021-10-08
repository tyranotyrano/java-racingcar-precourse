package racinggame.domain;

import java.util.Objects;

public class Distance {
	private static final int INIT_DISTANCE = 0;

	private int distance;

	private Distance() {
		this.distance = INIT_DISTANCE;
	}

	public static Distance create() {
		return new Distance();
	}

	public void increase() {
		distance++;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Distance distance1 = (Distance)o;
		return distance == distance1.distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distance);
	}
}
