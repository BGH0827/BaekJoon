import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		br.close();
		
		if(a==4 || a==7)
			System.out.println(-1);
		else if(a%5 == 0)
			System.out.println(a/5);
		else if(a%5 ==1 || a%5 == 3)
			System.out.println(a/5 +1);
		else if(a%5 == 2 || a%5 == 4)
			System.out.println(a/5 + 2);
	}
}
