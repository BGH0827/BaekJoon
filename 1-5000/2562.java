import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int max = 0;
		int[] a = new int[9];
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<9; i++) {
			if(max < a[i])
				max = a[i];
		}
		sb.append(max).append("\n");
		for(int i=0; i<9; i++) {
			if(max==a[i])
				sb.append(i+1);
		}
		System.out.print(sb);
	}
}
