import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double result = 0;
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++) {
			double x = Double.parseDouble(br.readLine());
			result = x * 80/ 100;
			
			sb.append("$").append(String.format("%.2f",result)).append("\n");
		}
		System.out.println(sb);
	}
}
