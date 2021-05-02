package racingcar.car;

import java.util.ArrayList;
import java.util.List;

import racingcar.move.CarMovingCondition;
import utils.print.RacingPrint;

public class Cars {

	private final List<Car> cars;

	public Cars(List<CarName> carNames) {
		this.cars = createCarsFromCarNames(carNames);
	}

	private List<Car> createCarsFromCarNames(List<CarName> carNames) {
		List<Car> cars = new ArrayList<>();

		for (CarName carName : carNames) {
			cars.add(new Car(carName, new CarMovingCondition()));
		}

		return cars;
	}

	public int size() {
		return this.cars.size();
	}

	public void move() {
		for (Car car : cars) {
			car.move();
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public boolean isEmpty() {
		return cars.isEmpty();
	}

	public void printRacingWinners() {
		if (isEmpty()) {
			return;
		}

		RacingPrint.printRacingWinners(decideWinnerNames(decideMaxMovingDistance()));
	}

	private MovingDistance decideMaxMovingDistance() {
		if (isEmpty()) {
			return new CarMovingDistance();
		}

		MovingDistance maxMovingDistance = cars.get(0).getMovingDistance();

		for (Car car : cars) {
			maxMovingDistance = car.getBiggerMovingDistanceThan(maxMovingDistance);
		}

		return maxMovingDistance;
	}

	private List<String> decideWinnerNames(MovingDistance maxMovingDistance) {
		List<String> winnerNames = new ArrayList<>();

		for (Car car : cars) {
			winnerNames.addAll(car.getCarNameWhenWinner(maxMovingDistance));
		}

		return winnerNames;
	}
}
