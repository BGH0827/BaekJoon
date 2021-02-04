import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[8];
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] b = {8, 7, 6, 5, 4, 3, 2, 1};
		int count = 0;
		int count2 = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<8; i++) {
			if(arr[i] == a[i])
				count ++;
			else if(arr[i] == b[i])
				count2 ++;
		}
		if(count == 8)
			sb.append("ascending");
		if(count2 == 8)
			sb.append("descending");
		if(count != 8 && count2 != 8)
			sb.append("mixed");
		
		System.out.print(sb);
	}
}
