
public class String_Demo {
public static void main(String[] args) {
	String city = new String("Mumbai");
	System.out.println(city);
	System.out.println(city.length());
	System.out.println(city.charAt(0));
	System.out.println(city.equals("Mumbai"));
	System.out.println(city.equals("mumbai"));
	System.out.println(city.equalsIgnoreCase("mumbai"));
	System.out.println(city.substring(2));
	System.out.println(city.substring(2, 4));
	String newcity = city.replace("M", "P");
	System.out.println(newcity);
	
}
}
