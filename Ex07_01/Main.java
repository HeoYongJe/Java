
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(10, 20, 30, 40, 50, 60);
		Rectangle rect = new Rectangle(100, 200, 300, 400);
		Circle cir = new Circle(1000, 2000, 3000);
		
		Geometry [] geos = new Geometry[3];
		geos[0] = tri;
		geos[1] = rect;
		geos[2] = cir;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(Geometry geo : geos) {
			geo.draw();
		}
	}

}
