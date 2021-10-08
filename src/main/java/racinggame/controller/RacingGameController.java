package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.TryCount;
import racinggame.view.GameInputView;
import racinggame.view.GamePrintView;

public class RacingGameController {
	private final GameInputView inputView;
	private final GamePrintView printView;

	public RacingGameController() {
		this.inputView = new GameInputView();
		this.printView = new GamePrintView();
	}

	public void play() {
		Cars cars = Cars.of(this.inputView.inputCarNames());
		TryCount tryCount = this.inputView.inputTryCount();
		RacingGame racingGame = RacingGame.of(cars, tryCount);

		runGame(racingGame);
	}

	private void runGame(RacingGame racingGame) {
		this.printView.printRacingResultTitle();

		while (!racingGame.isEndGame()) {
			racingGame.run();
			this.printView.printRacingStatus(racingGame.getCars());
		}
	}
}
