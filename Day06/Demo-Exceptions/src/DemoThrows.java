import java.io.IOException;

public class DemoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IOException e = new IOException();
//		try {
//			throw e;
//			}
//		catch(IOException ex) {
//			
//		}
		
		try{
			readFile();
		}
		catch(IOException ex) {
			
		}
		}
	
static void readFile()throws IOException {
	IOException e = new IOException();
	throw e;
}
}

