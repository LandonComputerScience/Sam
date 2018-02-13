public class Sieve {
    // Returns an array isPrime of n elements;
    // isprime[p] is set to true if and only if p is a prime
    public static boolean[] markPrimes(int n) {
        boolean[] isPrime = new boolean[n]; // all set to false by default

        isPrime[0] = isPrime[1] = false; // optional
        isPrime[2] = true;
        for (int i = 3; i < n; i += 2)
            isPrime[i] = true;

        for (int p = 3; p < n; p += 2) {
            if (isPrime[p])  // if isPrime[p] is true
            {
                for (int i = p * p; i < n; i += 2 * p)
                    isPrime[i] = false;
            }
        }
        return isPrime;
    }
    public static boolean [] markOddPrimes(int n){
        int n2 = n / 2;

        boolean[] isOddPrime = new boolean[n2];

        isOddPrime[0] = false;

        for (int i = 1; i < n2; i++) {
            isOddPrime[i] = true;
        }
        for (int p = 1; p < n2; p+=1)
        {
            if (isOddPrime[p])
            {
                for (int i = (2*p + 1) * (2* p + 1); i < n; i += 2* (2*p +1))
                    isOddPrime[(i-1)/(2)] = false;
            }
        }
        return isOddPrime;
    }

    public static void main(String[] args) {
        int n = 120;
        boolean[] isPrime = markPrimes(n);
        int count = 0;
        for (int p = 0; p < n; p++)
            if (isPrime[p]) {
                System.out.print(p + " ");
                count++;
            }
        System.out.println();
        System.out.println(count + " primes under " + n);
        isPrime = markOddPrimes(n);
        count = 0;
        for (int k = 0; k < n/2; k++)
            if (isPrime[k])
            {
                System.out.print(2*k + 1 + " ");
                count++;
            }
        System.out.println();
        System.out.println(count + " odd primes under " + n);
    }
}
