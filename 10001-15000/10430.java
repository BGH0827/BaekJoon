import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		a[0] = (A+B)%C;
		a[1] = ((A%C)+(B%C))%C;
		a[2] = (A*B)%C;
		a[3] = ((A%C)*(B%C))%C;
		
		for(int i=0; i<4; i++) {
			System.out.println(a[i]);
		}
	}
}
