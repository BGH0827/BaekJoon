import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long a = Integer.parseInt(br.readLine());
		
		if(a%8 == 1)
			System.out.println(1);
		else if(a%8 == 2 || a%8 == 0)
			System.out.println(2);
		else if(a%8 == 3 || a%8 == 7)
			System.out.println(3);
		else if(a%8 == 4 || a%8 == 6)
			System.out.println(4);
		else
			System.out.println(5);
	}
}
