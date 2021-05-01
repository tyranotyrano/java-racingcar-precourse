package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private final List<Car> cars;

	public Cars(List<CarName> carNames) {
		this.cars = createCarsFromCarNames(carNames);
	}

	private List<Car> createCarsFromCarNames(List<CarName> carNames) {
		List<Car> cars = new ArrayList<>();

		for (CarName carName : carNames) {
			cars.add(new Car(carName));
		}

		return cars;
	}

	public int size() {
		return this.cars.size();
	}
}
