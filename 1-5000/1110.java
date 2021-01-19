import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int tmp = a;
		int count = 0;
		
		while(true) {
			a = ((a%10)*10) + (((a/10) + (a%10)) % 10);
			count++;
				if(tmp == a)
					break;
		}
		System.out.println(count);
	}
}
