import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		long answer = 0;
		
		for(int i=0; i<a.length(); i++) {
			answer = (10*answer + (a.charAt(i) - '0')) % 20000303;
		}
		
		System.out.println(answer);
	}
}
