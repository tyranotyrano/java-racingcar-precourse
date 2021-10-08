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
}
