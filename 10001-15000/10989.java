import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		for(int x:arr) {
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}
