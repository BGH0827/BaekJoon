import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
			
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger add = a.add(b);
		BigInteger sub = a.subtract(b);
		BigInteger mul = a.multiply(b);
		
		StringBuilder sb = new StringBuilder();
		sb.append(add + "\n");
		sb.append(sub + "\n");
		sb.append(mul + "\n");
		System.out.println(sb);
	}
}
