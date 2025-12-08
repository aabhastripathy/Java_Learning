import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream fis = null;
FileOutputStream fos = null;
try {
	fis = new FileInputStream("Readme.txt");
	System.out.println("FILE FOUND");
	fos = new FileOutputStream("CReadme.txt");
	int data = fis.read();
	while(data != -1) {
		System.out.print((char)data);
		fos.write(data);
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
try {
	fis.close();
	fos.close();
}
catch(Exception e) {
	e.printStackTrace();
	
}

	}

}
