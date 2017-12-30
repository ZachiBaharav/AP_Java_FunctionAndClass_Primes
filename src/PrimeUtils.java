
/**
 *
 */


public class PrimeUtils {

    int primeCntr = 0 ; 
    int lastPrime ;

    // constructor
    public PrimeUtils() {
        // initalize?
        lastPrime = 1;
    }

    public PrimeUtils(int p) {
        lastPrime = p;
    }
    

    public int next() {
        
        lastPrime++;
        while (!isPrime(lastPrime))
            ++lastPrime;
        return lastPrime;
    }
    
    
    private boolean isPrime(int n) {
        for (int ii = 2; ii <= Math.sqrt(n); ++ii) {
            if (n % ii == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int[] next10() {
        int[] p = new int[10];
        for (int ii=0; ii<10; ++ii)
            p[ii] = next();
        return p;
    }
            
    public void next10(int[] ps) {
        for (int ii=0; ii<10; ++ii)
            ps[ii] = next();
    }
    
}
