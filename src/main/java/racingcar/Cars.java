package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private final List<Car> cars;

	public Cars(List<String> carNames) {
		this.cars = createCarsFromCarNames(carNames);
	}

	private List<Car> createCarsFromCarNames(List<String> carNames) {
		List<Car> cars = new ArrayList<>();

		for (String carName : carNames) {
			cars.add(new Car(carName));
		}

		return cars;
	}

	public int size() {
		return this.cars.size();
	}
}
