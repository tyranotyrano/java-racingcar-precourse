package racingcar;

import racingcar.car.Cars;
import racingcar.inputscan.CarNameScanner;
import racingcar.inputscan.TryCountInputScanner;
import utils.print.RacingPrint;

public class RacingCarGame {
	private final CarNameScanner carNameScanner;
	private final TryCountInputScanner tryCountInputScanner;
	
	private Cars cars;
	private TryCount tryCount;

	public RacingCarGame() {
		this.carNameScanner = new CarNameScanner();
		this.tryCountInputScanner = new TryCountInputScanner();
	}

	public void play() {
		initCars();
		initTryCount();
		moveCars();
		printRacingWinners();
	}

	private void initCars() {
		cars = new Cars(carNameScanner.scanCarNames());
	}

	private void initTryCount() {
		if (cars.isEmpty()) {
			tryCount = new TryCount(0);
			return;
		}

		tryCount = tryCountInputScanner.scanTryCount();
	}

	private void moveCars() {
		if (cars.isEmpty()) {
			return;
		}

		RacingPrint.printRacingResult();

		for (int i = 0; i < tryCount.getCount(); i++) {
			cars.move();
			RacingPrint.printRacingStatus(cars);
		}
	}

	private void printRacingWinners() {
		if (cars.isEmpty()) {
			return;
		}

		cars.printRacingWinners();
	}
}
