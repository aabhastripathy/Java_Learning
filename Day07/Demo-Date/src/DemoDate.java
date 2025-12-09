import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d = new Date();
System.out.println(d);//returns current date and time
SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");//dd/MM/yyyy pre defined format

String strDate = df.format(d);
System.out.println(d);
	}

}
