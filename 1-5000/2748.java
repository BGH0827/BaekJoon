import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Integer.parseInt(br.readLine());
		long x = 0;
		long y = 1;
		long sum = 0;
		
		for(int i=0; i<a; i++) {
			sum = x+y;
			x = y;
			y = sum;
		}
		System.out.print(x);
	}
}
