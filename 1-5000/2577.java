import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int mul = a*b*c;
		String s= Integer.toString(mul);
		int[] arr = new int[10];
		for(int i=0; i<s.length(); i++) {
			arr[(s.charAt(i) - 48)]++;
		}
		
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
