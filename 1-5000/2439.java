import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=a; i++) {
			for(int j=0; j<a-i; j++) {
				sb.append(" ");
			}
			for(int k=0; k<i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
