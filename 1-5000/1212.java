import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String[] array = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		if(a.length() == 1 && a.charAt(0) == '0') {
			sb.append(0);
		}
		else {
			for(int i=0; i<a.length(); i++) {
				int n = Character.getNumericValue(a.charAt(i));
				
				if(i==0 && n<4) {
					switch(n) {
					case 1:
						sb.append("1");
						break;
					case 2:
						sb.append("10");
						break;
					case 3:
						sb.append("11");
						break;
					}
				}
				else {
					sb.append(array[n]);
				}
			}
		}
		System.out.print(sb.toString());
	}
}
