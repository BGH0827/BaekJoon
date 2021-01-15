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
		int c = Integer.parseInt(br.readLine());
		br.close();
		int hour = 0;
		int min = 0;
		int time = b+c;
		
		if(time > 60) {
			min = time%60;
			hour = a + time/60;
		}
		else if(time < 60) {
			min = time;
			hour = a;
		}
		if(hour >= 24) {
			hour -= 24;
		}
		System.out.print(hour + " " + min);
	}
}
