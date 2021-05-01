package racingcar.inputscan;

import java.util.List;

import utils.inputscan.InputScanner;

public class CarNameScanner {
	private static final InputScanner INPUT_SCANNER = new InputScanner();
	private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public List<String> scanCarNames() {
		System.out.println(CAR_NAME_INPUT_MESSAGE);
		return INPUT_SCANNER.scanStringSplitByComma();
	}
}
