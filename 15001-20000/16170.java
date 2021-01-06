import java.text.SimpleDateFormat;
import java.util.Date;
			
public class Main {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		String time = format.format(d);
		String[] a = time.split("-");
    
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
      
	}
}
