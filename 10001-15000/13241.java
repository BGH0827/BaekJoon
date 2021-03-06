import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		int max = 0;
		br.close();
		
		for(int i=1; i<=b; i++) {
			if(b%i==0 && c%i==0) {
				max = i;
			}
		}
		System.out.println(max * b/max * c/max);
	}
}
