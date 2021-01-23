import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] arr = new int[7];
		int sum = 0;
		int min = 100;
		
		for(int i=0; i<7; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i]%2 == 1) {
				sum += arr[i];
				if(min > arr[i]) {
					min = arr[i];
				}
			}
		}
		if(sum != 0) {
		sb.append(sum).append("\n").append(min);
		}
		else {
			sb.append(-1);
		}
		System.out.print(sb);
	}
}
