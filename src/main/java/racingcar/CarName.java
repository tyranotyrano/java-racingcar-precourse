package racingcar;

import utils.ErrorMessage;

public class CarName {
	private static final int CAR_NAME_MAX_LENGTH = 5;

	private final String carName;

	public CarName(String carName) {
		validateCarName(carName);
		this.carName = carName.trim();
	}

	private void validateCarName(String carName) {
		if (carName == null) {
			throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_NULL);
		}
		if (carName.trim().isEmpty() || carName.trim().length() > CAR_NAME_MAX_LENGTH) {
			throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_MUST_TO_1_OR_MOR_AND_5_OR_LESS);
		}
	}
}
