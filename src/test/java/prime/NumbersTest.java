package prime;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersTest {
	@Test(expected = IllegalArgumentException.class)
	public void countPrimeWhenNull() throws Exception {
		new Numbers(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void countPrimeWhenEmpty() throws Exception {
		new Numbers("");
	}
	
	@Test
	public void countPrime() throws Exception {
		Numbers numbers = new Numbers("1 2 3 5 7 10");
		assertThat(numbers.countPrime(), is(4L));
	}
}
