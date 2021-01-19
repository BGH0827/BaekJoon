import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr= new int[26];
		String s = br.readLine();
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(arr[c-'a'] == -1) {
				arr[c-'a'] = i;
			}
		}
		
		for(int x : arr) {
			sb.append(x).append(" ");
		}
		
		System.out.print(sb);
	}
}
