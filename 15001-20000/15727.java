import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long a = Long.parseLong(br.readLine());
		long answer = 0;
		
		answer = a/5;
		if(a%5 == 0) {
			System.out.println(answer);
		}
		else
			System.out.println(answer+1);
	}
}
