import java.util.ArrayList;
import java.util.List;

public class DemoProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> cities = new ArrayList();
cities.add("Mumbai");
cities.add("Delhi");
cities.add("Pune");
cities.add("Mysore");
cities.add("Manglore");
System.out.println(cities);
List<String> copy = new ArrayList();
for(String c : cities) {
	if(c.startsWith("M")) {
		copy.add(c);
	}	
}
cities.forEach(str -> System.out.println(str));
System.out.println(copy);

List<Integer> LengthCities = new ArrayList();
for(String c : cities) {
	int l = c.length();
	LengthCities.add(l);
	}
System.out.println(LengthCities);

	}

}
