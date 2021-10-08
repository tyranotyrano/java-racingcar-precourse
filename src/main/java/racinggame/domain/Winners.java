package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {
	private final List<Car> winners;

	private Winners(List<Car> winners) {
		this.winners = winners;
	}

	public static Winners createBy(Cars cars, Distance maxDistance) {
		return new Winners(getWinners(cars, maxDistance));
	}

	private static List<Car> getWinners(Cars cars, Distance maxDistance) {
		List<Car> winners = new ArrayList<>();
		for (Car car : cars.getCars()) {
			addWinner(maxDistance, winners, car);
		}

		return winners;
	}

	private static void addWinner(Distance maxDistance, List<Car> winners, Car car) {
		if (car.isWinner(maxDistance)) {
			winners.add(car);
		}
	}
}
