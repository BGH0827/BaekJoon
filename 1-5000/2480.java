import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result1 = (k>n)? k:n;
		int result2 = (result1>m)? result1:m;
		
		if(k==n && k==m) {
			System.out.println((10000 + k * 1000));
		}
		else if(k==n && k!=m && n!=m) {
			System.out.println((1000 + k * 100));
		}
		else if(k!=n && k==m && n!=m) {
			System.out.println((1000 + k * 100));
		}
		else if(k!=n && k!=m && n==m) {
			System.out.println((1000 + n * 100));
		}
		else if(k!=n && k!=m && n!=m) {
			System.out.println((result2*100));
		}
		
	}
}
