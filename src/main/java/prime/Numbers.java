package prime;

import java.util.Arrays;

public class Numbers {
	private String[] numbers;

	public Numbers(String text) {
		if (text == null || text.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		this.numbers = text.split(" ");
	}

	public long countPrime() {
		return Arrays
			.stream(numbers)
			.map(Integer::parseInt)
			.filter(Prime::isPrime)
			.count();
	}
}
