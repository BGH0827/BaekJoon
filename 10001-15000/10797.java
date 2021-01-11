import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		int b = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<5; i++) {
			b = Integer.parseInt(st.nextToken());
			if(a == b)
				count++;
		}
		System.out.println(count);
	}
}
