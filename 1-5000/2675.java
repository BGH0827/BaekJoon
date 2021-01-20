import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++) {
			String[] s = br.readLine().split(" ");
			
			int b = Integer.parseInt(s[0]);
			String s1 = s[1];
			
			for(int j=0; j<s1.length(); j++) {
				for(int k=0; k<b; k++) {
					sb.append(s1.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
