package shape_game;

public class Rhombus extends TwoD_Shape{
	
	double diagonal1;		// Declaration of variables
	double diagonal2;
	double side;

	Rhombus()	// For Parent-Child Relationship
	{
		
	}
	
	Rhombus(double diagonal1, double diagonal2, double side)	// Initialization using Parameterized Constructor
	{
		this.diagonal1=diagonal1;
		this.diagonal2=diagonal2;
		this.side=side;
	}
	
	@Override
	public void getArea()		// Method Overriding
	{
		System.out.println("The area of a Rhombus is: "+((1/2)*diagonal1*diagonal2)+"sq. unit");
	}
	
	@Override
	public void getPerimeter()	// Method Overriding
	{
		System.out.println("The perimeter of a Rhombus is: "+(4*side)+"unit");
	}
}
