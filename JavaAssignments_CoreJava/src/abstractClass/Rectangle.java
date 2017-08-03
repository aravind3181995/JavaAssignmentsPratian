package abstractClass;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void draw(){
		double height = this.getHeight();
		double width = this.getWidth();
		this.setColor("Blue");
		double area = height*width;
		System.out.println("Rectangle filled with "+this.getColor()+" and Area= "+area);
	}	
}
