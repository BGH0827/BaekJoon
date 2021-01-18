import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		
		if(b>=45) {
			b -= 45;
		}
		else {
			if(a==0) {
				a=23;
				b=60-(45-b);
			}
			else {
				a -= 1;
				b= 60-(45-b);
			}
		}
		System.out.println(a + " " + b);
	}
}
