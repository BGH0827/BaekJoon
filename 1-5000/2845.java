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
		int g = scan.nextInt();
		
		System.out.print(c-(a*b)+" ");
		System.out.print(d-(a*b)+" ");
		System.out.print(e-(a*b)+" ");
		System.out.print(f-(a*b)+" ");
		System.out.print(g-(a*b));
	}
}
