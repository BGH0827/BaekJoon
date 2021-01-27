import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		int count1 = 0;
		
		for(int i=0; i<a; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 1)
				count++;
			else
				count1++;
		}
		if(count > count1) {
			sb.append("Junhee is not cute!");
		}
		else
			sb.append("Junhee is cute!");

	}
}
