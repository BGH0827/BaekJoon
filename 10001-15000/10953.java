import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());

		for(int i=0; i<a; i++) {
			st = new StringTokenizer(br.readLine());
			String[] s = st.nextToken().split(",");
			int sum=0;
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			sum = x+y;
			
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
