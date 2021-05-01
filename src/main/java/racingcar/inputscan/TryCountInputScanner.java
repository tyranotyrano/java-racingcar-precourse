package racingcar.inputscan;

import racingcar.TryCount;
import utils.ErrorMessage;
import utils.inputscan.InputScanner;

public class TryCountInputScanner {
	private static final InputScanner INPUT_SCANNER = new InputScanner();
	private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇회인가요?";

	public TryCount scanTryCount() {
		System.out.println(TRY_COUNT_INPUT_MESSAGE);

		try {
			return new TryCount(INPUT_SCANNER.scanInt());
		} catch (Exception e) {
			resetForRescanTryCount();
			return this.scanTryCount();
		}
	}

	private void resetForRescanTryCount() {
		System.out.println(ErrorMessage.TRY_COUNT_MUST_HAVE_0_OR_MORE);
		INPUT_SCANNER.clear();
	}
}
