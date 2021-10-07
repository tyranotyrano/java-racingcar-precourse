package racinggame.generator;

public class TestNumberGenerator implements NumberGenerator {

	private final int number;

	public TestNumberGenerator(int number) {
		this.number = number;
	}

	@Override
	public Integer generate() {
		return this.number;
	}
}
