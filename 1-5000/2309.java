import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		boolean checked = false;
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = Integer.MIN_VALUE;
					arr[j] = Integer.MIN_VALUE;
					checked = true;
					break;
				}
				if(checked)
					break;
			}
		}
		Arrays.sort(arr);
		
		for(int x : arr) {
			if(x != Integer.MIN_VALUE)
				System.out.println(x);
		}
	}
}
