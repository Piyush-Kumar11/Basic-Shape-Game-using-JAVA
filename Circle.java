package shape_game;

public class Circle extends TwoD_Shape{
	
	double r;	// Taking Radius as Input
	
	Circle()	// For Parent-Child Relationship
	{
		
	}
	
	Circle(double r)	// Initialization using Parameterized Constructor
	{
		this.r=r;
	}
	
	@Override
	public void getArea()	// Method Overriding
	{
		System.out.println("The area of the Circle is: "+(3.14*r*r)+"sq. unit");
	}
	
	@Override
	public void getPerimeter()	// Method Overriding
	{
		System.out.println("The perimeter of the Circle is: "+(2*3.14*r)+"unit");
	}

}
 