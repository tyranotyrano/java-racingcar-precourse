package racingcar.inputscan;

import java.util.ArrayList;
import java.util.List;

import racingcar.car.CarName;
import utils.ErrorMessage;
import utils.inputscan.InputScanner;

public class CarNameScanner {
	private static final InputScanner INPUT_SCANNER = new InputScanner();
	private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public List<CarName> scanCarNames() {
		System.out.println(CAR_NAME_INPUT_MESSAGE);

		try {
			return mapToCarNames(INPUT_SCANNER.scanStringSplitByComma());
		} catch (Exception e) {
			resetForRescanCarNames();
			return scanCarNames();
		}
	}

	private List<CarName> mapToCarNames(List<String> inputNames) {
		List<CarName> carNames = new ArrayList<>();

		for (String carName : inputNames) {
			carNames.add(new CarName(carName));
		}

		return carNames;
	}

	private void resetForRescanCarNames() {
		System.out.println(ErrorMessage.CAR_NAME_LENGTH_MUST_HAVE_1_OR_MORE_AND_5_OR_LESS);
	}
}
