package racingcar;

import utils.ErrorMessage;

public class TryCount {
	private final int tryCount;

	public TryCount(int tryCount) {
		validateTryCount(tryCount);
		this.tryCount = tryCount;
	}

	private void validateTryCount(int tryCount) {
		if (tryCount < 0) {
			throw new IllegalArgumentException(ErrorMessage.TRY_COUNT_MUST_HAVE_0_OR_MORE);
		}
	}

	public int getCount() {
		return tryCount;
	}
}
