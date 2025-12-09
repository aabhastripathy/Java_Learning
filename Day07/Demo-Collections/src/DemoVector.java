
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List Anime;
		Anime = new Vector();
		
		System.out.println(Anime.size());
		Anime.add("Naruto");//adding elements at last
		Anime.add("High School DXD");
		System.out.println(Anime.size());//number of elements
		System.out.println(Anime);
		Anime.add(1,"One Piece");//adds element at given index
		System.out.println(Anime);
		System.out.println(Anime.get(0));
		System.out.println("Before" + Anime);
		Collections.sort(Anime);
		System.out.println("After" + Anime);

		Anime.remove(1);//removes element from given index
		System.out.println(Anime);
		Anime.clear();//removes everything
		System.out.println(Anime.size());
		Anime.add(69);//boxing (primitive to wrapper)

	}

}
