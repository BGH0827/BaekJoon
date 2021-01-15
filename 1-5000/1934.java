import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int max = 0;
		
		for(int i=0; i<a; i++) {
			StringTokenizer sti = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(sti.nextToken());
			int c = Integer.parseInt(sti.nextToken());
			if(b<=c) {
				for(int j=1; j<=b; j++) {
					if(b%j==0 && c%j==0) {
						max = j;
					}
				}
				System.out.println(max * b/max * c/max);
			}
			else if(c<b) {
				for(int j=1; j<=c; j++) {
					if(b%j==0 && c%j==0) {
						max = j;
					}
				}
				System.out.println(max * b/max * c/max);
			}
		}
	}
}
