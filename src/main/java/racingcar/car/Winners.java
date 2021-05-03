package racingcar.car;

import java.util.List;

public class Winners {
	private static final String COMMA_WITH_SPACE = ", ";

	private final List<String> winners;

	public Winners(List<String> winners) {
		this.winners = winners;
	}

	public String getJoinedWinnerNames() {
		return String.join(COMMA_WITH_SPACE, winners);
	}
}
