package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

import racinggame.domain.movingcondition.CarMovingCondition;
import racinggame.generator.RacingCarRandomGenerator;

public class Cars {
	private final List<Car> cars;

	private Cars(List<Car> cars) {
		this.cars = cars;
	}

	public static Cars of(List<CarName> carNames) {
		List<Car> cars = createCarsByCarNames(carNames);
		return new Cars(cars);
	}

	private static List<Car> createCarsByCarNames(List<CarName> carNames) {
		List<Car> cars = new ArrayList<>();
		for (CarName carName : carNames) {
			cars.add(Car.of(carName, CarMovingCondition.createBy(new RacingCarRandomGenerator())));
		}
		return cars;
	}
}
