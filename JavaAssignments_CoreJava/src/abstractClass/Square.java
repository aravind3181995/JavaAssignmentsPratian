package abstractClass;

public class Square extends Rectangle{
	
	public Square(){
		
	}
	
	public Square(double side){
		super.setHeight(side);
	}
	
	public void setSide(double side){
		super.setHeight(side);
	}
	
	public double getSide(){
		return super.getHeight();
	}
	
	public void draw(){
		double side = super.getHeight();
		super.setColor("Red");
		double area = side*side;
		System.out.println("Square filled with "+super.getColor()+" and Area= "+area);
	}
}
