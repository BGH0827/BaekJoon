import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int x = a/100;
		int x1 = a%100/10;
		int x2 = a%100%10;
		int x3 = x2*100 + x1*10 + x;
		
		int y = b/100;
		int y1 = b%100/10;
		int y2 = b%100%10;
		int y3 = y2*100 + y1*10 + y;
		
		int result = (x3>y3) ? x3 : y3;
		System.out.println(result);
	}
}
