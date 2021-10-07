package racinggame.generator;

import nextstep.utils.Randoms;
import racinggame.constant.RacingCarConstant;

public class RacingCarRandomGenerator implements NumberGenerator {

	@Override
	public Integer generate() {
		return Randoms.pickNumberInRange(RacingCarConstant.MOVING_MIN, RacingCarConstant.MOVING_MAX);
	}
}
