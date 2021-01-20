import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			int a = Integer.parseInt(br.readLine()) % 42;
			h.add(a);
		}
		System.out.print(h.size());
	}
}
