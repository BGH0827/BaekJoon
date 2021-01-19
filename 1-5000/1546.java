import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		double sum = 0;
		double max = 0;
		double[] arr = new double[a];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max < arr[i])
				max = arr[i];
		}
		
		for(int i=0; i<a; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
		
		System.out.println(sum/a);
	}
}
