import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        
        // BigInteger a = new BigInteger("1234");
        // BigInteger b = new BigInteger("20");
        
        // BigInteger sum = a.add(b);
        // BigInteger product = a.multiply(b);
        
        // System.out.println(sum);
        // System.out.println(product);
        
        
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
