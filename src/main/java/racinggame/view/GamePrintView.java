package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.Distance;

public class GamePrintView {
	private static final String RACING_RESULT_TITLE = "실행 결과";
	private static final String RACING_STATUS_FORMAT = "%s : %s%n";
	private static final String HYPHEN = "-";

	public void printRacingResultTitle() {
		newLine();
		System.out.println(RACING_RESULT_TITLE);
	}
	public void printRacingStatus(Cars cars) {
		for (int i = 0; i < cars.getSize(); i++) {
			Car car = cars.getCar(i);
			System.out.printf(RACING_STATUS_FORMAT, car.getName().getName(), calculateDistance(car.getDistance()));
		}
		newLine();
	}

	private String calculateDistance(Distance distance) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < distance.getDistance(); i++) {
			stringBuilder.append(HYPHEN);
		}

		return stringBuilder.toString();
	}

	private static void newLine() {
		System.out.println();
	}
}
