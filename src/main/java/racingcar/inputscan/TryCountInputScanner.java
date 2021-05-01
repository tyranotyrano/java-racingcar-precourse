package racingcar.inputscan;

import utils.inputscan.InputScanner;

public class TryCountInputScanner {
	private static final InputScanner INPUT_SCANNER = new InputScanner();
	private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇회인가요?";

	public int scanTryCount() {
		System.out.println(TRY_COUNT_INPUT_MESSAGE);
		return INPUT_SCANNER.scanInt();
	}
}
