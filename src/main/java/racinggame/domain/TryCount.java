package racinggame.domain;

import racinggame.constant.ErrorMessage;

public class TryCount {
	private final int tryCount;

	private TryCount(int tryCount) {
		this.tryCount = tryCount;
	}

	public static TryCount of(int tryCount) {
		validateTryCount(tryCount);
		return new TryCount(tryCount);
	}

	private static void validateTryCount(int tryCount) {
		if (tryCount < 0) {
			throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_TRY_COUNT);
		}
	}

	public int getCount() {
		return tryCount;
	}
}
