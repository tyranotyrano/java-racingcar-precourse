package racinggame.domain;

import static racinggame.constant.RacingCarConstant.*;

import racinggame.constant.ErrorMessage;

public class CarName {

	private final String carName;

	private CarName(String carName) {
		validateCarName(carName);
		this.carName = carName.trim();
	}

	public static CarName of(String carName) {
		return new CarName(carName);
	}

	private void validateCarName(String carName) {
		if (carName == null || carName.trim().isEmpty() || carName.trim().length() > CAR_NAME_LENGTH_MAX) {
			throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAME_LENGTH);
		}
	}

	public String getName() {
		return carName;
	}
}
