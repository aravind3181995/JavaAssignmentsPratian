package abstractClass;

public class TestMain {
	public static void main(String args[]){
		Square square = new Square(10);
		square.draw();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(5);
		rectangle.draw();
	}
}
