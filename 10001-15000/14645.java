import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int people = 0;
			int[] arr = new int[a];
			
			for(int i=0; i<arr.length; i++) {
				if(a%2 == 1) {
					arr[i] -= scan.nextInt();
				}
				else {
					arr[i] += scan.nextInt();
				}
				people += arr[i];
			}
			if(a != -5000)
			System.out.println("비와이");
	}
}
