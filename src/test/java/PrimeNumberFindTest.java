import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberFindTest {
	PrimeNumberFind primeNumberFind;
	List<Integer> list;
	int inputCount;
	String input = "1 3 5 7 9";

	@Before
	public void setup() {
		primeNumberFind = new PrimeNumberFind();
		inputCount = 5;
	}

	@Test
	public void 첫번째_단계_입력값_분리하기() throws Exception {
		assertEquals(inputCount, inputSeparate(input).length);
	}

	private String[] inputSeparate(String input) {
		// TODO Auto-generated method stub
		String[] indexs = input.split(" ");
		return indexs;
	}

	@Test
	public void 두번째_단계_각_숫자들이_소수인지_확인하기() throws Exception {
		String[] indexs = inputSeparate(input);
		assertEquals(3, primeNumberCheck(indexs));
	}

	private int primeNumberCheck(String[] indexs) {
		// TODO Auto-generated method stub
		int count = 0;
		for (String index : indexs) {
			count += calculateNumber(index);
		}
		return count;
	}

	private int calculateNumber(String index) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = Integer.parseInt(index);
		for (int i = 1; i <= number; i++) {
			count += devideNumber(i, number);
		}
		if (count == 2) {
			return 1;
		}
		return 0;
	}

	private int devideNumber(int i, int number) {
		// TODO Auto-generated method stub
		int count = 0;
		if (number % i == 0) {
			count++;
		}
		return count;
	}

}
