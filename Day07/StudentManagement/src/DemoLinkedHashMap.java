
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> cities = new LinkedHashMap<Integer,String>();
		cities.put(22,"Mumbai");
		cities.put(33,"Kolkata");
		cities.put(11,"Delhi");

		System.out.println(cities);//ordered by insertion
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));//returns true or false
		System.out.println(cities.containsValue("Mumbai"));//returns true or false

		cities.put(33,"Jabalpur");//duplicate keys are not allowed it would override the value
		System.out.println(cities);
		cities.put(44,"Mumbai");//duplicate values are allowed
		System.out.println(cities);
		cities.clear();
	}

}
