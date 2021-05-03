package utils.print;

import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.car.MovingDistance;
import racingcar.car.Winners;

public class RacingPrint {
	private static final String RACING_RESULT = "실행 결과";
	private static final String RACING_WINNERS_MESSAGE = "(이)가 최종 우승했습니다.";
	private static final String COLON = " : ";
	private static final String HYPHEN = "-";

	public static void printRacingResult() {
		newLine();
		System.out.println(RACING_RESULT);
	}

	public static void printRacingWinners(Winners winners) {
		System.out.println(winners.getJoinedWinnerNames() + RACING_WINNERS_MESSAGE);
	}

	public static void printRacingStatus(Cars cars) {
		for (Car car : cars.getCars()) {
			System.out.print(car.getCarName() + COLON);
			printMovingDistance(car.getMovingDistance());
		}

		newLine();
	}

	private static void printMovingDistance(MovingDistance movingDistance) {
		for (int i = 0; i < movingDistance.getDistance(); i++) {
			System.out.print(HYPHEN);
		}

		newLine();
	}

	private static void newLine() {
		System.out.println();
	}
}
