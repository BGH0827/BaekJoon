import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c, d, e, f;
		
		String[] arr = br.readLine().split("");
		String[] arr1 = br.readLine().split("");
		
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		c = Integer.parseInt(arr[2]);
		d = Integer.parseInt(arr1[0]);
		e = Integer.parseInt(arr1[1]);
		f = Integer.parseInt(arr1[2]);
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		sb.append((a*100+b*10+c)*f);
		sb.append('\n');
		
		sb.append((a*100+b*10+c)*e);
		sb.append('\n');
		
		sb.append((a*100+b*10+c)*d);
		sb.append('\n');
		
		sb.append((a*100+b*10+c)*(d*100+e*10+f));
		
		System.out.print(sb);
	}
}
