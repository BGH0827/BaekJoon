import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<9; i++) {
			int x = Integer.parseInt(br.readLine());
			sum += x;
		}
		
		System.out.println(a-sum);
	}
}
