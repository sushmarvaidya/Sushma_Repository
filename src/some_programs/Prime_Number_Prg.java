package some_programs;

public class Prime_Number_Prg {

	public static void main(String[] args) {
		int n=8;
		  if (isPrime(n)) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }
	    }

	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, not prime
            }
        }

        return true; // No factors found, it's prime
    }
	}
