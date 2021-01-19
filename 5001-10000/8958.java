import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int count = 1;
		int score = 0;
		String[] s = new String[a];
		
		for(int i=0; i<a; i++) {
			s[i] = br.readLine();
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<s[i].length(); j++) {
				if(s[i].charAt(j) == 'O') {
					score += count;
					count ++;
				}
				else if(s[i].charAt(j) == 'X') {
					count = 1;
				}
			}
			sb.append(score).append("\n");
			count = 1;
			score = 0;
		}
		System.out.print(sb);
	}
}
