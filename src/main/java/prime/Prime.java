package prime;

public class Prime {
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		
		if (smallestDivisor(number) == number) {
			return true;
		}
		
		return false;
	}
	
	// 2이상의 수에서 가장 작은 약수 구하기
	private static int smallestDivisor(int n) {
		return findDivisor(n, 2);
	}

	static int findDivisor(int n, int testDivisor) {
		if (square(testDivisor) > n) {
			return n;
		}
		
		if (remainder(n, testDivisor) == 0 ) {
			return testDivisor;
		}
		
		return findDivisor(n, testDivisor + 1);
	}

	private static int square(int number) {
		return number * number;
	}

	private static int remainder(int n, int number) {
		return n % number;
	}
}
