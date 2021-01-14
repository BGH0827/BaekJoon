import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer[] a= new Integer[4];
		Integer[] b= new Integer[2];
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<2; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i=0; i<3; i++) {
			sum += a[i];
		}
		
		System.out.println((sum + b[0]));
	}
}
