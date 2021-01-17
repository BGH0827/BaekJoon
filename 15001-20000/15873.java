import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		int length = a.length();
		int answer = 0;
		br.close();
		
		if(length == 2)
			answer = a.charAt(0) + a.charAt(1) - 96;
		else if(length == 3) {
			if(a.charAt(1) == '0')
				answer = a.charAt(2) - 38;
			else
				answer = a.charAt(0) - 38;
		}
		else
			answer = 20;
			System.out.println(answer);
	}
}
