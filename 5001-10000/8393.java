import java.util.Scanner;

public class Main {
	public static void main(String[] args) extends NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = br.readLine();
		int sum = 0;
		
		for(int i=1; i<=A; i++) {
			sum += i;
		}
		
		System.out.print(sum);
	}
}
