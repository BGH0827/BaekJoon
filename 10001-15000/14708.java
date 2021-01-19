import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mul = 1;
		int a = Integer.parseInt(br.readLine());
		
		for(int i=a; i>1; i--) {
			mul *= i;
		}
		System.out.println(mul);
	}
}
