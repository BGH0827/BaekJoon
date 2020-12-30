import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		a[0] = A + B;
		a[1] = A - B;
		a[2] = A * B;
		a[3] = A / B;
		a[4] = A % B;
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
}
