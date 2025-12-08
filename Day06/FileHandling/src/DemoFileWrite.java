import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class DemoFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileOutputStream fos = null;
try {
	fos = new FileOutputStream("Copyread.txt");
	fos.write(65);
	fos.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
