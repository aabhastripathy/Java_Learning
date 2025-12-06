import org.ycpait.Geometry_app.entity.Circle;

public class geometryapp {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle c= new Circle(6.5f,"RED");
		
		System.out.println("Area of Circle is :"+c.CalculateArea());
		
		c.draw();
		
//		Rectangle r= new Rectangle(5f,5f,"RED");
//		
//		System.out.println("Area of Rectangle:"+ r.calculateArea());
//		
//		r.draw();

	}


}
