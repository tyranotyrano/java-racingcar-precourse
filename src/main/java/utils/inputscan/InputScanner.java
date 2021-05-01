package utils.inputscan;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputScanner {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final String COMMA = ",";

	public List<String> scanStringSplitByComma() {
		return Arrays.asList(SCANNER.nextLine().split(COMMA));
	}
}
