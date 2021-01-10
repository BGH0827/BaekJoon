import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger c = new BigInteger("2");
		br.close();
		
		BigInteger d1 = a.add(b);
		BigInteger d2 = d1.divide(c);
		BigInteger d3 = a.subtract(d2);

		System.out.println(d2);
		System.out.println(d3);
	}
}
