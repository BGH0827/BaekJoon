import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("");
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}
}
