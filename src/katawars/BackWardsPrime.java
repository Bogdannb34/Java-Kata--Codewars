package katawars;


public class BackWardsPrime {

    /*
    Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime.
     (This rules out primes which are palindromes.)
     13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.

    Task
    Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one being always greater
    than or equal to the first one. The resulting array or the resulting string will be ordered following the natural order
     of the prime numbers.
    */

    public static void main(String[] args) {
        System.out.println(backwardsPrime(2, 100));
        System.out.println(backwardsPrime(9900, 10000));
    }

    public static String backwardsPrime(long start, long end) {
        String foo = "";
        for (long i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(reverse(i)) && i != reverse(i)) {
                foo = foo + i + " ";
            }
        }
        return foo.trim();
    }

    public static boolean isPrime(long num) {
        if (num > 2 && num % 2 == 0) return false;
        int number = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < number; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long reverse(long num) {
        String s = "";
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        return Long.parseLong(s);
    }

}
