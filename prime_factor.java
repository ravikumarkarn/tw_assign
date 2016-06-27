import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class prime_factor{
public static void main(String args[]) {
int n=Integer.parseInt(args[0]);
System.out.println(primeFactors(n));
}

public static Set<Integer> primeFactors(long number) {
        Set<Integer> primefactors=new HashSet<>();
        long copyOfInput=number;
        for (int i=2;i<=copyOfInput;i++) {
            if (copyOfInput % i == 0) {
                primefactors.add(i);
                copyOfInput /= i;
                i--;
            }
        }
        return primefactors;
}    }
