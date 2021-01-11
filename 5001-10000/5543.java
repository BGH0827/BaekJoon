import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];
		
		for(int i=0; i<3; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<2; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = arr1[0];
		
		for(int i=0; i<3; i++) {
			if(answer > arr1[i])
				answer = arr1[i];
		}
		
		if(arr2[0]<arr2[1])
			System.out.println((answer+arr2[0]-50));
		else
			System.out.println((answer+arr2[1]-50));
	}
}
