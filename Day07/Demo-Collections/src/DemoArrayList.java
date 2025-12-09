import java.util.ArrayList;
import java.util.Collections;//class different from Collection interface plural is class singular is Interface
import java.util.List;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> cities;
cities = new ArrayList<String>();
System.out.println(cities.size());
cities.add("Mumbai");//adding elements at last
cities.add("Pune");
System.out.println(cities.size());//number of elements
System.out.println(cities);
cities.add(1,"Delhi");//adds element at given index
System.out.println(cities);
System.out.println(cities.get(0));
System.out.println("Before" + cities);
Collections.sort(cities);
System.out.println("After" + cities);

cities.remove(1);//removes element from given index
System.out.println(cities);
cities.clear();//removes everything
System.out.println(cities.size());
cities.add(12);//boxing (primitive to wrapper) will work if not genric 

	}

}
