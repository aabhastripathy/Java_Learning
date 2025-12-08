
public class DemoExecptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 0;
		try 
		{
			System.out.println("Before Exception Occurs");
			int result = num1/num2;
			System.out.println("After Exception Occurs");
		System.out.println("Result is :" + result);
		}
		catch(ArithmeticException e){
			System.out.println("Catch Block Running");
			e.printStackTrace();//this gives full trace back where the error occured useful for debugging
		}
		finally {
			System.out.println("Finally Block Running After Catch");
		}
	}

}
