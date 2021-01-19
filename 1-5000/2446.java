import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*a-1-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<a-1; i++) {
			for(int j=1; j<a-1-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<3+2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
