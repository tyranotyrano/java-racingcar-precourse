package utils.print;

import racingcar.car.Car;
import racingcar.car.Cars;

public class RacingPrint {
	private static final String RACING_RESULT = "실행 결과";
	private static final String COLON = " : ";
	private static final String HYPHEN = "-";

	public static void printRacingResult() {
		newLine();
		System.out.println(RACING_RESULT);
	}

	public static void printRacingStatus(Cars cars) {
		for (Car car : cars.getCars()) {
			System.out.print(car.getCarName() + COLON);
			printMovingDistance(car.getMovingDistance());
		}

		newLine();
	}

	private static void printMovingDistance(int movingDistance) {
		for (int i = 0; i < movingDistance; i++) {
			System.out.print(HYPHEN);
		}

		newLine();
	}

	private static void newLine() {
		System.out.println();
	}
}
