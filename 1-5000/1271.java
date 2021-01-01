import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		
		BigInteger C = A.divide(B);
		BigInteger D = A.remainder(B);
		
		System.out.println(C);
		System.out.println(D);
	}
}
