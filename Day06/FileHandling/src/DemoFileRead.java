import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Readme.txt");
			int data = fis.read();
			while (data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
