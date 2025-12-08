
public class DemoManyCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String s = null;
	System.out.println(s.length());
	System.out.println(args[0]);
	System.out.println(1/0);
}
catch(ArithmeticException e){
	System.out.println("Catch Block Running");
	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array index out of bound");
}
catch(NullPointerException e) {
	System.out.println("Can not invoke method on null refrence");
}
catch(Exception e) {//Handles all type of exception,must always be written at the last
	System.out.println("Genric");
}

System.out.println("After");

	}

}
