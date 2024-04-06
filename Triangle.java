package shape_game;

public class Triangle extends TwoD_Shape{

	double side1, side2, side3;		// Declaration of variables
	double base;
	double height;
	
	Triangle()		// For parent Child Relation
	{
		
	}
	
	Triangle(double side1, double side2, double side3, double base, double height)//Initialization using Parameterized Constructor
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.base=base;
		this.height=height;
	}
	
	@Override
	public void getArea()		//Method Overriding
	{
		System.out.println("The area of a triangle is: "+((1/2)*base*height)+"sq. unit");
	}
	
	@Override
	public void getPerimeter()		//Method Overriding
	{
		System.out.println("The perimeter of a triangle is: "+(side1+side2+side3)+"unit");
	}
	
}
