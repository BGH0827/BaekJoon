import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int e = scan.nextInt();
			int f = scan.nextInt();
			
			int a1 = 1 - a;
			int b1 = 1 - b;
			int c1 = 2 - c;
			int d1 = 2 - d;
			int e1 = 2 - e;
			int f1 = 8 - f;
			
			System.out.print(a1 + " ");
			System.out.print(b1 + " ");
			System.out.print(c1 + " ");
			System.out.print(d1 + " ");
			System.out.print(e1 + " ");
			System.out.print(f1 + " ");
	}
}
