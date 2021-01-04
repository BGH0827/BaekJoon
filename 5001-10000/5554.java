import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int sum = a+ b+ c+ d;
		int min = sum / 60;
		int sec = sum % 60;
		
		System.out.println(min);
		System.out.println(sec);
	}
}
