import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		int limit = s.length;
		int count = 0;
		
		while(true) {
			if(count%10 == 9) {
				System.out.print(s[count]);
				System.out.print("\n");
			}
			else
			System.out.print(s[count]);
			count++;
			limit--;
			if(limit == 0)
				break;
		}
	}
}
