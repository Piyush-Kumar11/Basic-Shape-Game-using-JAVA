package shape_game;

public class Rectangle extends TwoD_Shape{

	double l;		// Declaration of variables
	double b;
	
	Rectangle()	// For Parent-Child Relationship
	{
		
	}
	
	Rectangle(double l, double b)	// Initialization using Parameterized Constructor
	{
		this.l=l;
		this.b=b;
	}
	
	@Override
	public void getArea()	// Method Overriding
	{
		System.out.println("The area of a rectangle is: "+(l*b)+"sq. unit");
	}
	
	@Override
	public void getPerimeter()	// Method Overriding
	{
		System.out.println("The perimeter of a rectanle is: "+(2*(l+b))+"unit");
	} 
}
