import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int sum = 0;
		int result = 0;
		
		a[0] = A;
		a[1] = B;
		a[2] = C;
		a[3] = D;
		a[4] = E;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i] * a[i];
		}
		
		result = sum % 10;
		System.out.println(result);
	}
}
