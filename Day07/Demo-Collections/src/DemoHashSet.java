import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> cities;
cities = new HashSet<String>();
cities.add("Mumbai");
cities.add("Pune");
System.out.println(cities);//unordered so no way of knowing the order in output
System.out.println(cities.contains("Mumbai"));//unordered so no index methods
	}

}
