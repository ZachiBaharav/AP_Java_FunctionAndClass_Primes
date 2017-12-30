
/**
 *
 *
 * We will start by:
 *    Writing the 'prime' code within main
 *       Just review of class, main
 *    Writing the isPrime as a function
 *       function
 *       parameters
 *       return values etc.
 *       Scope of variables
 *    Writing isPrime as Class
 *       constructor
 *       functions
 *       function signature  (int-> double yes, double ->int no)
 *    Writing functions in there
 *       nextPrime() < -- local variables, persistence, etc.
 *       first N primes
 *           function signature: one argument (just array, default is 10 primes)
 *                               Two arguments: How many you want
 *
 *
 *
 *
 */
public class Main {

    static public void main(String[] args) {

        // 1. Just the functionality
        // Prime number: larger than 1, and is divisible only by 1 and itself. 
        int n = 29;

        boolean isNPrime = true;
        for (int ii = 2; ii <= Math.sqrt(n); ++ii) {
            if (n % ii == 0) {
                isNPrime = false;
            }
        }
        String str =  (isNPrime) ? "is" : "is Not";
        System.out.println(n + " " + str + " a prime.");

        // 2. as a function
        isNPrime = isPrime(n);
        str =  (isNPrime) ? "is" : "is Not";
        System.out.println("Using function: " + n + " " + str + " a prime.");
        
        System.out.println("\n\n");
        // 3. Benefit: Using a loop!
        for (n=2; n<50 ; ++n) {
            // isNPrime = isPrime(n);
            //str =  (isNPrime) ? "is" : "is Not";
            //System.out.println("Using function: " + n + " " + str + " a prime.");
            if (isPrime(n))
                System.out.println(n + " is a prime.");
        }
        
        // 4. Homework now: Do Euler 7. ( i give skeleton)
        
        // 5. Create a class!
        PrimeUtils p = new PrimeUtils();

        System.out.println("\n\n");
        for (int ii=1; ii<10; ++ii)
            System.out.println(ii + " :: " + p.next());
        
        
        // Euler 9, 39   (Triangles)
        // Euler 46
        
        // Then a new one: Euler 3 -> Factors
        
        // 6. Pass by Value -> 
        // Function that returns the next 10 prime numbers
        // Side step: function to switch two numbers ==> Doesn't work
        // AND, we'll also talk about function signature
        System.out.println("\n\nPass By Value\n\n");
        int a=5,b=7;
        System.out.println("Before switch2(a,b):"  + "a=" + a + " , b=" + b);
        switch2(a,b);
        System.out.println("After switch2(a,b):"  +"a=" + a +" , b="+b);
        int[] c = {5,7};
        // function signature!
        System.out.println("\n\nUsing array (still, pass by value)\n\n");
        System.out.println("Before switch2(c):"  +"c[0]=" + c[0] +" , c[1]="+c[1]);
        switch2(c);
        System.out.println("After switch2(c):"  +"c[0]=" + c[0] +" , c[1]="+c[1]);
        
        
        System.out.println("\n\nNext 10 primes");

        System.out.println("First method: next10() returning an array");
        int[] p10 = p.next10();
        for (int pp : p10)
            System.out.print( pp + " , ");
        
        System.out.println("\n\nSecond method: next10(int[] p) passing array an argument");
        int[] p10b = new int[10];
        // Function signature!
        p.next10(p10b);        
        for (int pp : p10b)
            System.out.print( pp + " , ");
        
        System.out.println("\n\n");
        
        // For some later homework: Euler 4 (palindrome),   12 and 21 (factors)
        // Euler 11: 2D array
        
        
        
        
    }
    
    
    static public boolean isPrime(int x) {
        for (int ii = 2; ii <= Math.sqrt(x); ++ii) {
            if (x % ii == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    static public void switch2(int a, int b) {
        System.out.println("In switch2: BEFORE: a="+a+" , b="+b);
        int tmp = a;
        a=b; 
        b = tmp;
        System.out.println("In switch2: AFTER: a="+a+" , b="+b);
    }
    
    static public void switch2(int[] c) {
        System.out.println("In switch2: BEFORE: c[0]="+c[0]+" , c[1]="+c[1]);
        int tmp = c[0];
        c[0]=c[1]; 
        c[1] = tmp;
        System.out.println("In switch2: AFTER: c[0]="+c[0]+" , c[1]="+c[1]);
    }

}
