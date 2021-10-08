package racinggame.domain;

public class RacingGame {
	private final Cars cars;
	private final TryCount tryCount;

	private RacingGame(Cars cars, TryCount tryCount) {
		this.cars = cars;
		this.tryCount = tryCount;
	}

	public static RacingGame of(Cars cars, TryCount tryCount) {
		return new RacingGame(cars, tryCount);
	}

	public void run() {
		this.cars.move();
		this.tryCount.reduce();
	}

	public boolean isEndGame() {
		return tryCount.isEndGame();
	}

	public Cars getCars() {
		return this.cars;
	}

	public Distance getMaxDistance() {
		Distance maxDistance = Distance.create();
		for (Car car : this.cars.getCars()) {
			maxDistance = Distance.of(Math.max(maxDistance.getDistance(), car.getDistance().getDistance()));
		}

		return maxDistance;
	}
}
