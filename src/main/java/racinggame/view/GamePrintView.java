package racinggame.view;

import java.util.StringJoiner;

import racinggame.constant.RacingCarConstant;
import racinggame.domain.Car;
import racinggame.domain.CarName;
import racinggame.domain.Cars;
import racinggame.domain.Distance;
import racinggame.domain.Winners;

public class GamePrintView {
	private static final String RACING_RESULT_TITLE = "실행 결과";
	private static final String RACING_STATUS_FORMAT = "%s : %s%n";
	private static final String RACING_WINNER_FORMAT = "최종 우승자는 %s 입니다.";
	private static final String HYPHEN = "-";

	public void printRacingResultTitle() {
		newLine();
		System.out.println(RACING_RESULT_TITLE);
	}
	public void printRacingStatus(Cars cars) {
		for (Car car : cars.getCars()) {
			System.out.printf(RACING_STATUS_FORMAT, car.getName().getName(), calculateDistance(car.getDistance()));
		}
		newLine();
	}

	public void printWinners(Winners winners) {
		System.out.printf(RACING_WINNER_FORMAT, winners.getTotalWinnerNames());
	}

	private String calculateDistance(Distance distance) {
		StringBuilder distanceHyphens = new StringBuilder();
		for (int i = 0; i < distance.getDistance(); i++) {
			distanceHyphens.append(HYPHEN);
		}

		return distanceHyphens.toString();
	}

	private static void newLine() {
		System.out.println();
	}
}
