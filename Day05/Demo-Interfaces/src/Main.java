
public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printable p = () ->{};
		Taxable t = (double income) -> {return income * 2;};
		StringJoinner sj = (String s1,String s2) -> {return s1+s2;};
		
		Lenthable l = m ->  m.length();
		System.out.println(l.Length("Aabhas"));
	}

}
