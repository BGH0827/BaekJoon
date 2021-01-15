import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		BigInteger c = new BigInteger("1");
		BigInteger d = new BigInteger("1");
		
		br.close();
		
		for(int i=0; i<b; i++) {
			c = c.multiply(new BigInteger(String.valueOf(a-i)));
			d = d.multiply(new BigInteger(String.valueOf(i+1)));
		}
		
		System.out.println(c.divide(d));
	}
}


