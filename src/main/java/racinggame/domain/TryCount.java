package racinggame.domain;

import racinggame.constant.ErrorMessage;

public class TryCount {
	private static final int END_TRY_COUNT = 0;

	private int tryCount;

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

	public void reduce() {
		this.tryCount--;
	}

	public boolean isEndGame() {
		return this.tryCount == END_TRY_COUNT;
	}

	public int getCount() {
		return tryCount;
	}
}
