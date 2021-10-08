package racinggame.view;

import static racinggame.constant.ErrorMessage.*;
import static racinggame.constant.RacingCarConstant.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nextstep.utils.Console;
import racinggame.constant.ErrorMessage;
import racinggame.domain.CarName;

public class GameInputView {
	private static final String CAR_NAME_INPUT_GUIDE_MESSAGE =
		"경주할 자동차 이름을 입력하세요.(이름은 쉼표(" + CAR_NAME_SEPARATOR + ") 기준으로 구분)";

	public List<CarName> inputCarNames() {
		System.out.println(CAR_NAME_INPUT_GUIDE_MESSAGE);
		String carNameBundle = Console.readLine();

		try {
			validateInputCarNames(carNameBundle);
			return convertToCarNames(carNameBundle);
		} catch (Exception e) {
			System.out.println(INVALID_CAR_NAME_LENGTH);
			return inputCarNames();
		}
	}

	private void validateInputCarNames(String carNameBundle) {
		if (carNameBundle == null || carNameBundle.isEmpty()) {
			throw new IllegalArgumentException(INVALID_CAR_NAME_LENGTH);
		}
	}

	private List<CarName> convertToCarNames(String carNameBundle) {
		List<CarName> carNames = new ArrayList<>();
		String[] splitCarNames = carNameBundle.split(CAR_NAME_SEPARATOR);
		validateCarNameSize(splitCarNames);

		for (String carName : splitCarNames) {
			carNames.add(CarName.of(carName.trim()));
		}

		return carNames;
	}

	private void validateCarNameSize(String[] splitCarNames) {
		if (Arrays.asList(splitCarNames).isEmpty()) {
			throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAME_LENGTH);
		}
	}
}
