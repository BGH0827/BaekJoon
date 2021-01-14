import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] a = new int[4];
		int[] b = new int[4];
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			sum += a[i];
		}
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
    
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st1.nextToken());
			sum1 += b[i];
		}
		
		br.close();
    
		if(sum >= sum1)
			System.out.println(sum);
		else
			System.out.println(sum1);
	}
}
