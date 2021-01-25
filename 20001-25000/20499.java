import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split("/");
		int[] a = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		if(a[0]+a[2] < a[1] || a[1] == 0) {
			sb.append("hasu");
		}
		else
			sb.append("gosu");
		
		System.out.print(sb);
	}
}
