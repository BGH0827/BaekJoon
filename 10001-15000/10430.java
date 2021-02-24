import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[5];
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		a[0] = (A+B)%C;
		a[1] = ((A%C)+(B%C))%C;
		a[2] = (A*B)%C;
		a[3] = ((A%C)*(B%C))%C;
		
		for(int i=0; i<4; i++) {
			System.out.println(a[i]);
		}
	}
}
