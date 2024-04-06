package shape_game;

public class Square extends TwoD_Shape{
	
	double side;		// Declaration Of Variables
	
	Square()	// For Parent-Child Relationship
	{
		
	}
	
	Square(double side)		// Initialization using Parameterized Constructor
	{
		this.side=side;
	}
	
	@Override
	public void getArea()			//Method Overriding
	{
		System.out.println("The area of a Square is: "+(side*side)+"sq. unit");
	}
	
	@Override
	public void getPerimeter()		//Method Overriding
	{
		System.out.println("The perimeter of a Square is: "+(4*side)+"unit");
	}

}
