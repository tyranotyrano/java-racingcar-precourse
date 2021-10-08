package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.TryCount;
import racinggame.view.GameInputView;

public class RacingGameController {
	private final GameInputView inputView;

	public RacingGameController() {
		this.inputView = new GameInputView();
	}

	public void play() {
		Cars cars = Cars.of(this.inputView.inputCarNames());
		TryCount tryCount = this.inputView.inputTryCount();
		RacingGame racingGame = RacingGame.of(cars, tryCount);

		racingGame.run();
	}
}
