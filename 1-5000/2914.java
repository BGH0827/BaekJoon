import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int song = scan.nextInt();
		int avg = scan.nextInt();
		int mel = 0;
		mel = song * (avg - 1) + 1;
		
		System.out.println(mel);

	}
}
