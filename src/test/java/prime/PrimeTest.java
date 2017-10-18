package prime;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {
	@Test
	public void isPrime() throws Exception {
		assertTrue(Prime.isPrime(3));
	}
	
	@Test
	public void isNotPrime() throws Exception {
		assertFalse(Prime.isPrime(1));
		assertFalse(Prime.isPrime(4));
	}
	
	@Test
	public void findDivisor() throws Exception {
		assertThat(Prime.findDivisor(10, 2), is(2));
		assertThat(Prime.findDivisor(15, 2), is(3));
		assertThat(Prime.findDivisor(11, 3), is(11));
	}
}
